<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link href="styles.css" rel="stylesheet">
    <title>Show Items</title>
    <style>
        <%@ include file="/styles.css" %>
    </style>
</head>

<body>
    <div class="head_sky">
        You are logged in as: Mr. Manning
        <span class="logout_span"><a href="http://www.yandex.ru">Logout</a></span>
    </div>
    <h1>
        Online Marketplace
    </h1>
    <h4 class="search_parameters">Search parameters</h4>
    <form name="search_param" method="post" class="keyword">
        <h5>Keyword:</h5>
        <div class="field">
            <input type="text" id="username" name="username" value="" />
            <select>
                <option>Option - 1</option>
                <option>Option - 2</option>
            </select>
            <button>Search</button>
        </div>
    </form>
    <br>
    <div>
        <span class="logout_span"><a href="http://www.yandex.ru">Show All Items</a></span>
        <span class="logout_span"><a href="http://www.yandex.ru">Show My Items</a></span>
        <span class="logout_span"><a href="http://www.yandex.ru">Sell</a></span>
    </div>
    <div>
        <table>
            <caption>Items</caption>
            <tr>
                <td>UID</td>
                <td>Title</td>
                <td>Description</td>
                <td>Seller</td>
                <td>Start price</td>
                <td>Bid inc</td>
                <td>Best offer</td>
                <td>Bidder</td>
                <td>Stop date</td>
                <td>Bidding</td>
            </tr>
            <br>
            <tr>
                <td>1</td>
                <td>A parrot</td>
                <td>Very beatiful bird</td>
                <td>Mr.Smith</td>
                <td>10.00</td>
                <td>1.50</td>
                <td>15.00</td>
                <td>Mrs.Jonsen</td>
                <td>24.11.2007 11:00</td>
                <td>
                    <input type="text" id="username" name="username" value="" />
                    <button>Bid</button>
                </td>
            </tr>

        </table>
    </div>

</body>

</html>
