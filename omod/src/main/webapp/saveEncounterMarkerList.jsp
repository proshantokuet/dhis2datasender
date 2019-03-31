<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>



<table border="1">
				<tr>
					<th>Name</th>
					<th>Last Read Entry Id</th>
					<th>Marker Id</th>
					
				</tr>
				<c:forEach var="cn" items="${ encounterMarkers }">
					<tr>
						<td><a href="<c:url value="/module/dhis2datasender/editEncounterMarker.form?id=${ cn.markerId }"/>"> ${ cn.name }</a> </td>
						<td> ${ cn.lastReadEntryId } </td>
						<td> ${ cn.markerId } </td>
						<td><a href="<c:url value="/module/dhis2datasender/deleteEncounterMarker.form?id=${ cn.markerId }"/>"> ${ cn.name }</a> </td>
						
						
						<%-- <td>
						<c:forEach var="t" items= "${ cn.tags }" varStatus="status">
						<c:out escapeXml="true" value=" ${ t.tag } " />
						<c:if test="${not status.last}">, </c:if>
						</c:forEach> 
                        </td> --%>
					</tr>
				</c:forEach>
			</table>
<%@ include file="/WEB-INF/template/footer.jsp"%>