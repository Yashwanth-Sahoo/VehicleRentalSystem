<!DOCTYPE html>
<html>
<head>
    <title>Book Vehicle</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>

<body>

<div class="main">

<div class="form-card">

<h2>Book Vehicle</h2>

<form action="<%=request.getContextPath()%>/bookVehicle" method="post">

    <input type="number" name="vehicleId" placeholder="Vehicle ID" required>
    <input type="date" name="startDate" required>
    <input type="date" name="endDate" required>

    <button>Book</button>

</form>

<br>

<!-- BACK BUTTON -->
<a href="<%=request.getContextPath()%>/views/dashboard.jsp">
    <button style="background:#64748b;"> Back to Dashboard</button>
</a>

</div>

</div>

</body>
</html>