<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../spring/layout/taglib.jsp" %>

<section class="container">
	<form:form modelAttribute="student" class="form-horizontal"  >
		<fieldset>
			<legend>Edit Student</legend>
			<input type="hidden" name="id" value="${studentEdit.id}"/>

			<div class="form-group">
				<label class="control-label col-lg-2" for="firstName">First
					Name</label>
				<div class="col-lg-10">
					<form:input id="firstName" path="firstName" type="text" value="${studentEdit.firstName}"
						class="form:input-large" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-lg-2" for="lastName">Last
					Name</label>
				<div class="col-lg-10">
					<form:input id="lastName" path="lastName" type="text" value="${studentEdit.lastName}"
						class="form:input-large" />
				</div>
			</div>
			
			<div class="form-group">
				<label class="control-label col-lg-2" for="email">email</label>
				<div class="col-lg-10">
					<form:input id="email" path="email" type="text" value="${studentEdit.email}"
						class="form:input-large" />
				</div>
			</div>
			
			<div class="form-group">
				<label class="control-label col-lg-2" for="password">Password</label>
				<div class="col-lg-10">
					<form:input id="password" path="password" type="text" value="${studentEdit.password}"
						class="form:input-large" />
				</div>
			</div>
			

			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<input type="submit" id="btnAdd" class="btn btn-primary"
						value="Update" />
				</div>
			</div>
		</fieldset>
	</form:form>
</section>
    