<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" type="text/css" href="styles.css"/>
    <title>User</title>
    <style>
        <%@ include file="/WEB-INF/views/styles.css" %>
    </style>
</head>

<body>
<div class="head_sky">
    You are logged in as: ${currentUser.sex.respectCall} ${currentUser.fullname}
    <span class="logout_span"><a href="/logout">Logout</a></span>
</div>
<h1>
    Online Marketplace
</h1>
<jsp:useBean id="currentUser" scope="session" type="entity.User"/>

<h4 class="search_parameters">Search parameters</h4>

<form name="search_param" method="post" class="keyword">
    <h5>Keyword:</h5>
    <div class="field">
        <input type="text" name="username" value=""/>
        <select>
            <option>Option - 1</option>
            <option>Option - 2</option>
        </select>
        <button>Search</button>
    </div>
</form>


<div>
    <span class="logout_span"><a href="/showItems">Show All Items</a></span>
    <span class="logout_span"><a href="/showMyItems?currentUser=${currentUser.fullname}">Show My Items</a></span>
    <span class="logout_span"><a href="/">Sell</a></span>
</div>
<div class="div_center">
    <h2>Dear ${currentUser.sex.respectCall} ${currentUser.fullname}. Here are your products.</h2>
</div>
<div>
    <table>
        <caption>Your Items</caption>
        <tr>
            <td>Name product</td>
            <td>Description</td>
            <td>Start price</td>
            <td>Step level</td>
            <td>Time</td>
        </tr>
        <br>
        <c:forEach var="prod" items="${currentUser.productList}">
            <tr>
                <td><c:out value="${prod.nameProduct}"/></td>
                <td><c:out value="${prod.description}"/></td>
                <td><c:out value="${prod.startPrice}"/></td>
                <td><c:out value="${prod.stepLevel}"/></td>
                <td><c:out value="${prod.time}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
