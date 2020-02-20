<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/css/index3.css" rel="stylesheet">
<script type="text/javascript" src="/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<form action="list.do">
发布时间：<input type="text" name="t1" onclick="WdatePicker()" value="${t1 }">--
<input type="text" name="t2" onclick="WdatePicker()" value="${t2 }">
排序<select name="sortt">
		<option value="1" ${sorrt==1?'selected':'' }>发布时间</option>
		<option value="2" ${sorrt==2?'selected':'' }>作者</option>
		<option value="3" ${sorrt==3?'selected':'' }>评论数量</option>
	</select>
	<input type="submit" value="查询">
<table>
  <tr>
    <th>文章id</th>
    <th>标题</th>
    <th>作者</th>
    <th>发布时间</th>
    <th>评论数量</th>
  </tr>
  <c:forEach items="${list }" var="l">
  <tr>
    <td>${l.id }</td>
    <td>${l.title }</td>
    <td>${l.username }</td>
    <td>
    <fmt:formatDate value="${l.created }" pattern="yyyy-MM-dd"/>
    </td>
    <td>${l.commentCnt }</td>
  </tr>
  </c:forEach>
  <tr>
  		<td colspan="100">
  			<button name="pageNum" value="1">首页</button>
  			<button name="pageNum" value="${p.getPrePage()==0?1:p.getPrePage() }">上一页</button>
  			<button name="pageNum" value="${p.getNextPage()==0?p.getPages():p.getNextPage() }">下一页</button>
  			<button name="pageNum" value="${p.getPages() }">尾页</button>
  		</td>
  </tr>
</table>

</form>
</body>
</html>