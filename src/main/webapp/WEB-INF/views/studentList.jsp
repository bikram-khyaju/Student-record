<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../spring/layout/taglib.jsp" %>

<table class="table table-bordered table-hover" >
	<thead>
		<tr>
			<td>Student list</td>
			<td>Action</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${studentList}" var="student">
		<tr>
			<td>${student.firstName}</td>
			<td><a href='<spring:url value="/editStudent/${student.id}" />'>Edit</a> || <a href='<spring:url value="/deleteStudent/${student.id}" />'>Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>