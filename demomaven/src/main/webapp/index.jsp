
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP index</title>
    </head>
    <body bgcolor="orange">
        <form method="post" action="login.jsp">
            <center>
            <table border="0" width="30%" cellpadding="3">
                <thead>
                    <tr><th colspan="2"><h1>Cricket_Kernel</h1></th>
                    <br>
                        <th colspan="2">TM</th>
                    </tr>
                    <tr><th colspan="2">***************************************</th>
                    <br>
       
                    </tr>
                    <tr><th colspan="2"><h2>Login_Page</h2></th>
                    <br>
                    </tr>
                </thead>
                </table>
                <table border="1" width="30%" cellpadding="3">
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="user" value="" /></td>
                        <td colspan="2">New User</td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                        <td colspan="2"><a href="register.html">Register Here</a></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td>***********************************</td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
       
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>