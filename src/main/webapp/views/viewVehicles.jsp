<%@ page import="java.util.*, com.vehicle.model.Vehicle" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vehicles</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>

<body>

<div class="main">

<div class="header">Vehicle List</div>

<div class="table-container">

<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Type</th>
    <th>Price</th>
    <th>Status</th>
    <th>Action</th>
</tr>

<%
List<Vehicle> list = (List<Vehicle>) request.getAttribute("vehicles");

if (list != null && !list.isEmpty()) {
    for (Vehicle v : list) {
%>

<tr>
    <td><%= v.getId() %></td>
    <td><%= v.getName() %></td>
    <td><%= v.getType() %></td>
    <td><%= v.getPrice() %></td>
    <td><%= v.getStatus() %></td>

    <td>
        <form action="<%=request.getContextPath()%>/deleteVehicle" method="post">
            <input type="hidden" name="id" value="<%=v.getId()%>">
            <button>Delete</button>
        </form>
    </td>
</tr>

<%
    }
} else {
%>
<tr>
    <td colspan="6" style="text-align:center;">No vehicles found</td>
</tr>
<%
}
%>

</table>

</div>

<br>

<!-- BACK BUTTON -->
<a href="<%=request.getContextPath()%>/views/dashboard.jsp">
    <button style="background:#64748b;"> Back to Dashboard</button>
</a>

</div>

</body>
</html>