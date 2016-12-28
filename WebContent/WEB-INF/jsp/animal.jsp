<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns:th="http://www.thymeleaf.org">

<%@ page session="false"%>
<html>
<head>
<title>Zoo Page</title>

<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>
</head>
<h1>Show Animal list</h1>
<body>
	<h3>Animal List</h3>

<c:url var="addAction" value="/animal/update" ></c:url>
<form:form  method="post" action="${addAction}" commandName="animal">
<table>
     <tr>
	   <td>
	    AnimalId:
	   </td>
	  <td>
	    <input type = "text" name = "id" required>
	  </td>
	</tr>
	<tr>
	<tr>
	   <td>
	    AnimalGroupName:
	   </td>
	  <td>
	    <input type = "text" name = "animalGroupName" required>
	  </td>
	</tr>
	<tr>
	<tr>
	   <td>
	    Consumption:
	   </td>
	  <td>
	    <input type = "text" name = "consumption"  required>
	  </td>
	</tr>
	<tr>
	  <td>
	    Allocation:
	  </td>
	  <td>
	    <input type = "text" name = "allocation"  required>
	  </td>
	</tr>
	<tr>
	<tr>
	  <td>
	    ZooID:
	  </td>
	  <td>
	    <input type = "text" name = "zooId"  required>
	  </td>
	</tr>
	<tr>
	  <td>
	    FoodID:
	  </td>
	  <td>
	    <input type = "text" name = "foodid" required>
	  </td>
	</tr>
	<tr>
	  <td>
	    NoOfTimes
	  </td>
	  <td>
	    <input type = "text" name = "feedTimes"  required/>
	  </td>
	</tr>
	<tr>
	  <td>
	    VendorStatusUpdate
	  </td>
	  <td>
	    <input type = "text" name = "vendorStatusUpdate" required/>
	  </td>
	</tr>
	<tr>
	 <td>
	  <input type = "submit" value = "submit"/>
	 </td>
	</tr>
</table>	
 <c:out value ="${result }"></c:out>
 <c:if test = "${!empty ResultList}">
   <table class = "tg">
     <tr>
       <th width = "60"> Animal Consumption on Average</th>
     </tr>
     <c:forEach items= "${ResultList}" var="result">
       <tr>
         <td>
         <c:out value = "${result}"></c:out>
         </td>
       </tr>
     </c:forEach>
   </table>
 </c:if>
 
  <c:if test = "${!empty ResultTimes}">
   <table class = "tg">
     <tr>
       <th width = "60"> Average Times consumed </th>
     </tr>
     <c:forEach items= "${ResultTimes}" var="times">
       <tr>
         <td>
         <c:out value = "${times}"></c:out>
         </td>
       </tr>
     </c:forEach>
   </table>
 </c:if>
   <c:if test = "${!empty ResultWaste}">
   <table class = "tg">
     <tr>
       <th width = "60"> Average Times wasted </th>
     </tr>
     <c:forEach items= "${ResultWaste}" var="waste">
       <tr>
         <td>
         <c:out value = "${waste}"></c:out>
         </td>
       </tr>
     </c:forEach>
   </table>
 </c:if>
 
 
 
 
 
 
 
</form:form>
	<c:if test="${!empty AnimalList}">
		<table class="tg">
			<tr>
			    <th width = "120">ID</th>
				<th width="120">ZooID</th>
				<th width="120">AnimalGroupName</th>
				<th width="120">FeedTimes</th>
				<th width="120">foodID</th>
				<th width="120">Consumption</th>
				<th width="60">Allocation</th>
				<th width="60">VendorStatusUpdate</th>
			</tr>
			<c:forEach items="${AnimalList}" var="animal">
				<tr>
				<td>
		         <c:out value="${animal.id}"></c:out>				
				</td>
				<td>
				<c:out value="${animal.zooId}"></c:out>				
				</td>
				<td>
			    <c:out value="${animal.animalGroupName}"></c:out>
				</td>
				<td>
				 <c:out value="${animal.feedTimes}"></c:out>
				</td>
				<td>
	             <c:out value="${animal.foodid}"></c:out>
				</td>
				<td>
			     <c:out value="${animal.consumption}"></c:out>
				</td>
				<td>
			     <c:out value="${animal.allocation}"></c:out>
				</td>
				<td>
			     <c:out value="${animal.vendorStatusUpdate}"></c:out>
				</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>