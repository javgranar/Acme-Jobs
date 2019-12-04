<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>


<acme:form>
	<acme:form-textbox code="employer.job.form.label.reference" path="reference"/>
	<acme:form-textbox code="employer.job.form.label.title" path="title"/>
	<acme:form-moment code="employer.job.form.label.deadline" path="deadline"/>
	<acme:form-money code="employer.job.form.label.salary" path="salary"/>
	<acme:form-url code="employer.job.form.label.moreInfo" path="moreInfo"/>
	<acme:form-textarea code="employer.job.form.label.description" path="description"/>
	
	<acme:form-return code="employer.job.form.button.return"/>
	
	<acme:form-submit code="employer.job.form.button.listAuditRecord" method ="get" action="/authenticated/audit-record/list?id=${id}"/> 
	<acme:form-submit code="employer.job.form.button.Descriptor" method ="get" action="/authenticated/descriptor/show?id=${id}"/>
	</acme:form> 

