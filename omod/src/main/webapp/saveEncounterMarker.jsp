<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<c:url var="saveUrl" value="/module/dhis2datasender/saveEncounterMarker.form" />


<form:form method="POST" action="${saveUrl}" modelAttribute="encounterMarker">

	<div class="form-group">
		<div class="row">
			<div class="col-3">
				<label for="name">Name</label>
				<form:input path="name"/>
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="row">
			<div class="col-3">
				<label for="name">last Read EntryId</label>
				<form:input path="lastReadEntryId"/>
			</div>
		</div>
	</div>

    <form:hidden path="markerId" />

	<div class="form-group">
		<div class="row">
			<div class="col-3">
				<div class="form-group">
					<input type="submit" value="Save" />
				</div>
			</div>
		</div>
	</div>

</form:form>

<%@ include file="/WEB-INF/template/footer.jsp"%>