<%-- 
    Document   : result
    Created on : 12 ??? 2016, 3:13:18 ??
    Author     : Georgio
--%>

<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <body>
        <h1 align="center">Beer Recommendation JSP</h1>
        <form method="POST" action="logout.do">
            Welcome: <%=session.getAttribute("username")%><br/>
            Born: <%=session.getAttribute("birthyear")%><br/>
            Mail: <%=session.getAttribute("mail")%><br/>
            Users currently logged in: <%=session.getAttribute("totalsessions")%><br/>
            <input type="hidden" name="hidden1" value="hidden?"/>
            <input type="submit" value="logout" />
        </form>
        <br/>
        <%
            List styles = (List) request.getAttribute("styles");
            Iterator it = styles.iterator();
            while(it.hasNext()) {
                out.print("<br>try: " + it.next());
            }
        %>
        
    </body>
</html>