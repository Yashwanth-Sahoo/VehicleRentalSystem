<!DOCTYPE html>
<html>
<head>
    <title>Signup</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>

<body class="center">

<div class="form-card">
    <h2 style="text-align:center; color:#38bdf8;">Create Account</h2>

    <form action="<%=request.getContextPath()%>/SignupServlet" method="post">

        <input type="text" name="fullname" placeholder="Full Name" required>
        <input type="email" name="email" placeholder="Email" required>
        <input type="password" name="password" placeholder="Password" required>

        <button>Sign Up</button>
    </form>

    <p style="text-align:center;">
        Already have account? <a href="login.jsp">Login</a>
    </p>
</div>

</body>
</html>