<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="auditor.audit-record.form.label.title" path="title"/>
	<acme:form-moment code="auditor.audit-record.form.label.creationMoment" path="creationMoment"/>
	<acme:form-url code="auditor.audit-record.form.label.body" path="body"/>
	<acme:form-textarea code="auditor.audit-record.form.label.published" path="published"/>

	<acme:form-return code="aditor.auditRecord.form.button.return"/>
	</acme:form> 

