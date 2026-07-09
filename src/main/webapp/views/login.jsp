<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>

<body class="center">

<div class="form-card">
    <h2 style="text-align:center; color:#38bdf8;">Login</h2>

    <form action="<%=request.getContextPath()%>/LoginServlet" method="post">

        <input type="email" name="email" placeholder="Email" required>
        <input type="password" name="password" placeholder="Password" required>

        <button>Login</button>
    </form>

    <p style="text-align:center;">
        New user? <a href="signup.jsp">Sign up</a>
    </p>
</div>

</body>
</html>