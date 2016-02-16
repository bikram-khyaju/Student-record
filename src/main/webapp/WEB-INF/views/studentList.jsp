<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<table>
	<thead>
		<tr>Student list</tr>
	</thead>
	<tbody>
		<c:forEach items="${students}" var="student"></c:forEach>
		<tr>
			<td>${student.firstName}</td>
		</tr>
	</tbody>
</table>