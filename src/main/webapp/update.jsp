<%--
  Created by IntelliJ IDEA.
  User: Damir_Valeev
  Date: 9/11/2019
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<section>
    <jsp:useBean id="user" scope="request" type="entity.User"/>
    <form method="post" action="user?action=submit">
        <dl>
            <dt>fullname:</dt>
            <dd><input type="text" name="fullname" value="${user.fullname}" placeholder="${user.fullname}"/></dd>
        </dl>
        <dl>
            <dt>address:</dt>
            <dd><input type="text" name="address" value="${user.address}" placeholder="${user.address}"/></dd>
        </dl>
        <dl>
            <dt>login:</dt>
            <dd><input type="text" name="login" value="${user.login}" placeholder="${user.login}"/></dd>
        </dl>
        <button type="submit">Save</button>
    </form>
</section>
</body>
</html>
