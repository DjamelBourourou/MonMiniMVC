<%-- 
    Document   : user
    Created on : 23 juin 2025, 20:46:27
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="model.User"%>
<% User user =(User) request.getAttribute("user");%>
<html
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenue</title>
    </head>
    <body>
        <h1>Bienvenue<%= user.getPrenom()%><%=user.getNom()%></h1>
    </body>
</html>
