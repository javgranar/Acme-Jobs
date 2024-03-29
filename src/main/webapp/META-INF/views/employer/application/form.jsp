<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="employer.application.form.label.reference" path="reference"/>
	<acme:form-moment code="employer.application.form.label.deadline" path="deadline"/>
	<acme:form-textbox code="employer.application.form.label.status" path="status"/>
	<acme:form-textarea code="employer.application.form.label.statement" path="statement"/>
	<acme:form-textarea code="employer.application.form.label.skills" path="skills"/>
	<acme:form-textarea code="employer.application.form.label.qualifications" path="qualifications"/>
	
	<acme:form-textbox code="employer.application.form.label.jobReference" path="jobReference"/>

	<acme:form-return code="employer.application.form.button.return"/>
	</acme:form> 

