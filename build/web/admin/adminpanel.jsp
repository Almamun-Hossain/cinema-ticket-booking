<%@page import="cn.techtutorial.ctb.admin.model.Admin"%>
<%@page import="cn.techtutorila.ctb.connection.ConnectionDB"%>

<% 
    Admin admin = (Admin) session.getAttribute("loggedAdmin");
    if(admin == null){
        response.sendRedirect("adminlogin.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= admin.getEmail() %>
        
    </body>
</html>
