<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="taglib.jsp" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%-- <%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<tilesx:useAttribute name="current"/> --%>

<!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
		<div class="masthead">
			<h3 class="text-muted">Student Record System</h3>
			<nav>
				<ul class="nav nav-justified">
					<li class="${current == 'home' ? 'active' : ''}"><a href='<spring:url value="/home" />'>Home</a></li>
					<li class="${current == 'student' ? 'active' : ''}"><a href='<spring:url value="/add" />'>Add</a></li>
					<security:authorize access="hasRole('ROLE_ADMIN')">
						<li class="${current == 'studentList' ? 'active' : ''}"><a href='<spring:url value="/studentList" />'>Student List</a></li>
					</security:authorize>
					<security:authorize access="hasRole('ROLE_ADMIN')">
						<li class="${current == 'userList' ? 'active' : ''}"><a href='<spring:url value="/userList" />'>user-list</a></li>
					</security:authorize>
					<li class="${current == 'register' ? 'active' : ''}"><a href='<spring:url value="/register" />'>user-register</a></li>
					<security:authorize access="!isAuthenticated()">
						<li class="${current == 'login' ? 'active' : ''}"><a href='<spring:url value="/login" />'>login</a></li>
					</security:authorize>
					<security:authorize access="isAuthenticated()">
						<li> <a href='<spring:url value="/logout" />'>logout</a></li>
					</security:authorize>
				</ul>
			</nav>

		</div>