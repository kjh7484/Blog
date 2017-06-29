<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp"%>
<%
String bgPath = config.getServletContext().getRealPath("/WEB-INF/blog/background/"); //백그라운드 이미지 경로
String hdPath = config.getServletContext().getRealPath("/WEB-INF/blog/header/"); //헤더 이미지 경로
%>	
<c:set var = "bg" value="<%=bgPath%>"/>
<c:set var = "hd" value="<%=hdPath%>"/>
<section>
	<article>
		<h1>블로그 만들기<img src="resources/images/2step.jpg" align="right" width="150" height="50"></h1>
		<h2>2단계:레이아웃 선택</h2>
		<form action="blogMake2pro.blog" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td width="8%">레이아웃</td>
					<td width="72%">
					<div align="center">
						<input type="radio" name="layout" value="1" id="layout1" checked>
						<img src="resources/images/layout/layout1.jpg" onclick='layoutChoice(1)' style="cursor:pointer;" class="layout1">
						<input type="radio" name="layout" value="2" id="layout2">
						<img src="resources/images/layout/layout2.jpg" onclick='layoutChoice(2)' style="cursor:pointer;" class="layout2">
						<input type="radio" name="layout" value="3" id="layout3">
						<img src="resources/images/layout/layout3.jpg" onclick='layoutChoice(3)' style="cursor:pointer;" class="layout3">
						<input type="radio" name="layout" value="4" id="layout4">
						<img src="resources/images/layout/layout4.jpg" onclick='layoutChoice(4)' style="cursor:pointer;" class="layout4">
						<input type="radio" name="layout" value="5" id="layout5">
						<img src="resources/images/layout/layout5.jpg" onclick='layoutChoice(5)' style="cursor:pointer;" class="layout5">
						<input type="radio" name="layout" value="6" id="layout6">
						<img src="resources/images/layout/layout6.jpg" onclick='layoutChoice(6)' style="cursor:pointer;" class="layout6">
					</div>
					</td>
					<td width="20%">
					레이아웃은 추후에<br> 변경 가능합니다.
					</td>
				</tr>
				<tr>
					<td colspan="3" align="center"><hr size="1">
					<input type="submit" value="만들기">&nbsp;&nbsp;&nbsp;
					<input type="reset" value="취소">
					</td>
				</tr>				
			</table>
		</form>	
	</article>  
</section>
<%@ include file="aside.jsp"%>
<%@ include file="footer.jsp"%>