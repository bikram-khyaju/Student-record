<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ include file="../spring/layout/taglib.jsp" %>

<table class="table table-bordered table-hover" >
	<thead>
		<tr>
			<td>User list</td>
			<td>Action</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${userList}" var="users">
		<tr>
			<td>${users.name}</td>
			<td><a href='<spring:url value="/edit/${users.id}" />'>Edit</a> || <a href='<spring:url value="/deleteUser/${users.id}" />'>Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>