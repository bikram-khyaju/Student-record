<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../spring/layout/taglib.jsp"%>

<form:form commandName="user" cssClass="form-horizontal" >

	

	<input type="hidden" name="id" value="${user.id}" />

	<div class="form-group">
		<label for="name" class="col-sm-2 control-label">Name</label>
		<div class="col-sm-10">
			<form:input path="name" cssClass="form-control" value="${user.name}" />
			<form:errors path="name"></form:errors>
		</div>
	</div>

	<div class="form-group">
		<label for="email" class="col-sm-2 control-label">Email</label>
		<div class="col-sm-10">
			<form:input path="email" cssClass="form-control" value="${user.email}" />
			<form:errors path="email"></form:errors>
		</div>
	</div>

	<div class="form-group">
		<label for="password" class="col-sm-2 control-label">Password</label>
		<div class="col-sm-10">
			<form:password path="password" cssClass="form-control"	value="${user.password}" />
			<form:errors path="password"></form:errors>
		</div>
	</div>


	<div class="form-group">
		<div class="col-sm-2">

			<input type="submit" value="save" class="btn btn-lg btn-primary" />

		</div>
	</div>
</form:form>