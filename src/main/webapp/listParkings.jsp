<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ import="dao.ParkingDao.java" %>
<%@ import="dto.Parking.java" %>
<%
   ParkingDao listaParkings= new ParkingDao();
   

   
    List<Parking> listaParkings = listaParkings.listarParkings();
   

  
    request.setAttribute("listaParkings", listaParkings);
    
%>

<jsp:include page="common/header.jsp"/>
<p class="h1">Parkings Registrados</p>


<div class="row">
    <ul class="list-group">
        <c:forEach var="parking" varStatus="loop" items="${listaParkings}">
            <li class="list-group-item">ID: <c:out value="${parking.id}"/> - <c:out value="${parking.nombre}"/> - Municipio:
                <c:out value="${parking.municipio}"/> - Plazas Disponibles: <c:out value=${parking.dispoinbles}/> - Plazas Totales:  <c:out value=${parking.totales}/></li>
        </c:forEach>
    </ul>
</div>


<jsp:include page="common/footer.jsp"/>
