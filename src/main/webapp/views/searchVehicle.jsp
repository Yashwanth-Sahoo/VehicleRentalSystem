<!DOCTYPE html>
<html>
<head>
    <title>Search Vehicle</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>

<h2>Search Vehicle</h2>

<form action="<%=request.getContextPath()%>/SearchVehicleServlet" method="post">

    Vehicle Name: <input type="text" name="name"><br><br>
    <button type="submit">Search</button>

</form>

<br>
<a href="dashboard.jsp">Back to Dashboard</a>

</body>
</html>