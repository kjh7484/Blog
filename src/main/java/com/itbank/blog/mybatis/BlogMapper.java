package com.itbank.blog.mybatis;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BlogMapper {

  private static SqlSessionFactory sqlMapper;

  static {
    try {
    	String resource = "com/itbank/blog/SqlMapConfig.xml";
    	Reader reader = Resources.getResourceAsReader(resource);
    	sqlMapper = new SqlSessionFactoryBuilder().build(reader); 
    } catch (IOException e) {
   
      throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
    }
  }
  
 
  
  
  
//==============CateMapper================ 
/*  
  public static List listCate(){
	SqlSession session = sqlMapper.openSession();
	//Ʈ����Ǳ��(�ѹ� , Ŀ��)
	List<CategoryDTO> list = session.selectList("listCate");
	session.close();  //���� �ȴݾ����� ���߿� ��û ������
	return list;
  }
  
  public static int deleteBoard(int cnum){
	  SqlSession session = sqlMapper.openSession();
	  int res = session.delete("deleteCate",cnum);
	  session.commit(); //commit���� close�� �ϸ� db���¿����� ��������(�׳� session����������)
	  session.close();
	  return res;
  }
  
  public static int insertCate(CategoryDTO dto){
	  SqlSession session = sqlMapper.openSession();
	  int res = session.insert("insertCate",dto);
	  session.commit();
	  session.close();
	  return res;
  }
  
 //==============ProdMapper================ 
  
  public static List listProd(){
	  SqlSession session = sqlMapper.openSession();
	  List<ProductDTO> list = session.selectList("listProd");
	  session.close();
	  return list;
  }
  
  public static int insertProd(ProductDTO dto){
	  SqlSession session = sqlMapper.openSession();
	  int res = session.insert("insertProd",dto);
	  session.commit();
	  session.close();
	  return res;
  }
  
  public static int deleteProd(int pnum){
	  SqlSession session = sqlMapper.openSession();
	  int res = session.delete("deleteProd",pnum);
	  session.commit();
	  session.close();
	  return res;
  }

  public static ProductDTO getProd(int pnum){
	  SqlSession session = sqlMapper.openSession();
	  ProductDTO dto = session.selectOne("getProd",pnum);
	  session.close();
	  return dto;
  }
  
  public static int updateProd(ProductDTO dto){
	  SqlSession session = sqlMapper.openSession();
	  int res = session.update("updateProd",dto);
	  session.commit();
	  session.close();
	  return res;
  }
  
  public static ArrayList<ProductDTO> listSpec(String psepc){
	  SqlSession session = sqlMapper.openSession();
	  ArrayList<ProductDTO> list = (ArrayList)session.selectList("listSpec",psepc); 
	  session.close();
	  return list;
  }
  
  public static ArrayList<ProductDTO> listCode(String code){
	  SqlSession session = sqlMapper.openSession();
	  ArrayList<ProductDTO> list = (ArrayList)session.selectList("listCode",code+"%");
	  session.close();
	  return list;
  }
  */
  
}
