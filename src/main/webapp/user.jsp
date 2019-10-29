<%--
  Created by IntelliJ IDEA.
  User: Damir_Valeev
  Date: 9/11/2019
  Time: 12:16 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<section>
    <h3>Bot info</h3>
    <jsp:useBean id="user" scope="request" type="entity.User"/>
    <tr>
        <td>fullname: ${user.fullname} | address: ${user.address} | login: ${user.login}</td>
        <td><a href="user?action=update">Update</a></td>
    </tr>
</section>
</body>
</html>
