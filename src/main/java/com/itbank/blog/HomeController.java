package com.itbank.blog;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "blogmain";
	}
	
	@RequestMapping(value="/login.do")
	public ModelAndView adminHome(HttpServletRequest request, HttpServletResponse response) throws Exception{
		return new ModelAndView("WEB-INF/blog/main.jsp");
	}
	
	@RequestMapping(value="/blogStart.blog")
	public ModelAndView blogStart(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("blog/index");
		String id = "admin";
		mav.addObject("id", id);
		return mav;
	}
		
	@RequestMapping(value="/blogMake.blog")
	public ModelAndView blogMake(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("blog/makeBlog");
		String id = request.getParameter("id");
		mav.addObject("id", id);
		return mav;
	}
	
	@RequestMapping(value="/blogMake2.blog")
	public ModelAndView blogMake2(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("blog/makeBlog2");
		String id = request.getParameter("id");
		mav.addObject("id", id);
		return mav;
	}
	
}
