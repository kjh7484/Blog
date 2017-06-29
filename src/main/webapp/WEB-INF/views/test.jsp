<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
 
<html lang="en"> 
 
<head> 
 
<meta charset="UTF-8"> 
 
<title>멀티셀렉트</title> 
 
<script type="text/javascript"> 
 
 function fnSelect(obj){ 
    var select1Index =  document.getElementById("select1").selectedIndex; 
	var selectId = "select" + (Number(obj.getAttribute("id").replace("select", ""))+1);
    document.getElementsByTagName(selectId).length=0 
 
    // 두번째 select 박스 지우기 
    var index = obj.selectedIndex; 
   
    // select{?} : select 박스, _ : 앞에 select 박스 인덱스
    var select2_0 = [ "김치", "양파", "상추", "오이"]; 
    var select2_1 = [ "돼지고기", "닭고기", "소고기", "오리고기"]; 
    
    var select3_0, select3_1, select3_2, select3_3;
    
    if(select1Index == 0) {
        select3_0 = [ "김치1", "김치2", "김치3", "김치4"];
        select3_1 = [ "양파1", "양파2", "양파3", "양파4"];
        select3_2 = [ "상추1", "상추2", "상추3", "상추4"];
        select3_3 = [ "오이1", "오이2", "오이3", "오이4"];
    } else {
        select3_0 = [ "돼지고기1", "돼지고기2", "돼지고기3", "돼지고기1"];
        select3_1 = [ "닭고기1", "닭고기2", "닭고기3", "닭고기4"];
        select3_2 = [ "소고기1", "소고기2", "소고기3", "소고기4"];
        select3_3 = [ "오리고기1", "오리고기2", "오리고기3", "오리고기4"];
    }
    
    var options_str = ""; 
 
    var i = 0; 
 
    eval(selectId+"_"+index).forEach( function(s) { 
        options_str += '<option value="' + (i++) + '">' + s + '</option>'; 
     }); 
    
    document.getElementById(selectId).innerHTML = options_str;
    
    if(obj.getAttribute("id") == "select1") {
        document.getElementById(selectId).addEventListener("change"
                , fnSelect(document.getElementById(selectId)));    
    }
 } 
</script> 
 </head> 
 
 <body> 
 <table> 
 <tbody> 
 <tr> 
 <td style="text-align: left; "> 
 <select id="select1" style="width: 80px; margin-top: 10px;" 
 onchange="javscript:fnSelect(this);"> 
 <option>야채</option> 
 <option>고기</option> 
 </select> 
 <select id="select2" style="width: 80px; margin-top: 10px;" 
 onchange="javscript:fnSelect(this);"
 > 
     <option>김치</option> 
     <option>양파</option> 
     <option>상추</option> 
     <option>오이</option> 
 </select>
<select id="select3" style="width: 80px; margin-top: 10px;"> 
     <option>김치1</option> 
     <option>김치2</option> 
     <option>김치3</option> 
     <option>김치4</option> 
 </select> 
 </td> 
 </tr> 
 </tbody> 
 <tfoot></tfoot> 
 </table> 
 </body> 
 
 </html> 
 
 <tr>
					<td>글 분야</td>
					<td colspan="2">
					<select name="bigarea" id="bigarea" onchange="changeArea(this)">
						<option value="none">==선택하세요==</option>
						<option value="art">엔터테인먼트.예술</option>
						<option value="life">생활.노하우.쇼핑</option>
						<option value="hobby">취미.여가.여행</option>
						<option value="int">지식.동향</option>
					</select>
					<select name="area" id="area">
						<option value="none">==선택하세요==</option>
					</select>	
					</td>			
				</tr>