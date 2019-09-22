<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Damir_Valeev
  Date: 9/19/2019
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link href="styles.css" rel="stylesheet">
    <title>Registration</title>
</head>

<body>
<div class="head_sky">
    You are logged in as: ${currentUser.sex.respectCall} ${currentUser.fullname}
    <span class="logout_span"><a href="/logout">Logout</a></span>
</div>
<h1>
    Online Marketplace
</h1>
<form name="addProduct" action="/addProduct" method="post">
    <fieldset class="field_center">
        <legend>Add new product</legend>
        <div class="addProd">
            <label for="prodname">Product Name:</label>
            <input type="text" id="prodname" name="prodname" value=""/>
        </div>
        <br>
        <div class="addProd">
            <label for="description">Description:</label>
            <input type="text" id="description" name="description" value=""/>
        </div>
        <br>
        <br>
        <div>
            <div class="addProd">
                <label for="startPrice">Start price:</label>
                <input type="number" id="startPrice" name="startPrice" value=""/>
            </div>
            <br>
            <div class="addProd">
                <label for="stepLevel">Step level:</label>
                <input type="number" id="stepLevel" name="stepLevel" value=""/>
            </div>
            <br>
            <div class="addProd">
                <label for="time">Time:</label>
                <input type="number" id="time" name="time" value=""/>
            </div>

        </div>
        <br>
        <div>
            <input type="hidden" name="forSale" value="0">
            <input type=checkbox name="forSale" value="1"> Put up for sale
        </div>
        <br>
        <div>
            <input class="bigButton" name="submit" type="submit" value="Add new product in auction"/>
        </div>
    </fieldset>
</form>
<br>
<div class="center">
    <button class="bigButton">Cancel</button>
</div>


</body>

</html>
