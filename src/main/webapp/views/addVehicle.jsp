<!DOCTYPE html>
<html>
<head>
    <title>Add Vehicle</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>

<body>

<div class="main">

<div class="form-card">
    <h2>Add Vehicle</h2>

    <form action="<%=request.getContextPath()%>/addVehicle" method="post">

        <input type="text" name="name" placeholder="Vehicle Name" required>
        <input type="text" name="type" placeholder="Type" required>
        <input type="number" name="price" placeholder="Price" required>

        <button>Add Vehicle</button>
    </form>

    <br>

    <!-- BACK BUTTON -->
    <a href="<%=request.getContextPath()%>/views/dashboard.jsp">
        <button style="background:#64748b;">Back to Dashboard</button>
    </a>

</div>

</div>

</body>
</html>