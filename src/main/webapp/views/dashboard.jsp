<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>

<div class="sidebar">
    <h2>Rental</h2>
    <a href="dashboard.jsp">Dashboard</a>
    <a href="addVehicle.jsp">Add Vehicle</a>
    <a href="<%=request.getContextPath()%>/viewVehicles">Vehicles</a>
    <a href="booking.jsp">Bookings</a>
    <a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a>
</div>

<div class="main">

<div class="header">
    Welcome, ${sessionScope.userName}
</div>

<div class="card-container">
    <div class="card">
        <h3>Total Vehicles</h3>
        <p>--</p>
    </div>

    <div class="card">
        <h3>Total Bookings</h3>
        <p>--</p>
    </div>
</div>

<div class="card">
    <h3>System Overview</h3>
    <p>Manage vehicles, bookings and users efficiently.</p>
</div>

</div>

</body>
</html>