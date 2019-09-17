<%--
  Created by IntelliJ IDEA.
  User: Damir_Valeev
  Date: 9/11/2019
  Time: 12:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link href="WEB-INF/views/styles.css" rel="stylesheet">
    <title>Login</title>
</head>

<body>
<form name="f" action="/login" method="post">
    <fieldset>
        <legend>Please, log in</legend>
        <div class="field">
            <br>
            <label for="username">Login</label>
            <input type="text" id="username" name="username" value=""/>
        </div>
        <br>
        <div class="field">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" value=""/>
        </div>
        <br>
        <div class="login">
            <button class="login_buttons" onclick="location.href = '/singUp'">Registration</button>
            <button class="login_buttons" name="submit" type="submit">Reset</button>
            <button class="login_buttons" name="submit" type="submit">Enter as guest</button>
        </div>
    </fieldset>
</form>

</body>
</html>
