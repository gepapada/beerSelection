<%-- 
    Document   : beerselection
    Created on : Oct 19, 2016, 9:18:23 PM
    Author     : Georgio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>  
<body>
    <h1 align="center">Beer Advisor </h1>
    <form method="POST" action="logout.do">
        Welcome: <%=session.getAttribute("username")%><br/>
        Born: <%=session.getAttribute("birthyear")%><br/>
        Mail: <%=session.getAttribute("mail")%><br/>
        Users currently logged in: <%=session.getAttribute("totalsessions")%><br/>
        <input type="hidden" name="hidden1" value="hidden?"/>
        <input type="submit" value="logout" />
    </form>
    <br/>
    
    <form method="POST"
        action="Beer.do">
        Select Beer characteristics:
        <br><br>
        Color:
        <select name="color" size="1">
            <option value="light">Light</option>
            <option value="amber">Amber</option>
            <option value="brown">Brown</option>
            <option value="dark">Dark</option>
            <option value="greek">Greek</option>
        </select>
        <br><br>
    <center>
        <input type="SUBMIT">
    </center>
    </form>
    
    
    
</body>
</html>
