<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link href="styles.css" rel="stylesheet">
    <title>Login</title>
</head>

<body>
    <form name="f" action="/login" method="post">
        <fieldset>
            <legend>Please, log in</legend>
            <div class="field">
                <br>
                <label for="username">Login</label>
                <input type="text" id="username" name="username" value="" />
            </div>
            <br>
            <div class="field">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" value="" />
            </div>
            <br>
            <div>
                <button class="registration_buttons" onclick="location.href = '/singUp'">Registration</button>
                <button class="registration_buttons" name="submit" type="submit">Reset</button>
            </div>
        </fieldset>
    </form>

</body></html>
