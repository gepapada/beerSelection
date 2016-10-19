<%-- 
    Document   : failed
    Created on : Oct 19, 2016, 9:38:20 PM
    Author     : Georgio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Failed</title>
    </head>
    <body>
        <h1>Login failed!</h1>
        <%
	session = request.getSession(false);
        if(session == null || session.getAttribute("username")==null){
	%>
        <form method="POST" action="login.do">
            Username:<input type="text" name="username" /><br/>
            Password:<input type="password" name="password" /><br/>
            <input type="hidden" name="hidden1" value="hidden?"/>
            <input type="submit" value="login" />
        </form>
	<%
	}
	else{
            
            String redirectURL = "beerselection.jsp";
            response.sendRedirect(redirectURL);

        }
        %>
    </body>
</html>
