<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<table class="table-striped" >
	<thead>
		<tr><td>Student list<td><td>Action</td></tr>
	</thead>
	<tbody>
		<c:forEach items="${studentList}" var="student">
		<tr>
			<td>${student.firstName}</td>
			<td><a href='<spring:url value="/edit" />'>Edit</a> || <a href='<spring:url value="/delete/${student.id}" />'>Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>