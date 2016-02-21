<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="taglib.jsp" %>

<%-- <%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<tilesx:useAttribute name="current"/> --%>

<!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
		<div class="masthead">
			<h3 class="text-muted">Project name</h3>
			<nav>
				<ul class="nav nav-justified">
					<li class="${current == 'home' ? 'active' : ''}"><a href='<spring:url value="/home" />'>Home</a></li>
					<li class="${current == 'student' ? 'active' : ''}"><a href='<spring:url value="/add" />'>Add</a></li>
					<li class="${current == 'studentList' ? 'active' : ''}"><a href='<spring:url value="/allStudent" />'>Student List</a></li>
					<li><a href="#">Downloads</a></li>
					<li><a href="#">About</a></li>
					<li class="${current == 'login' ? 'active' : ''}"><a href='<spring:url value="/login" />'>login</a></li>
				</ul>
			</nav>

		</div>