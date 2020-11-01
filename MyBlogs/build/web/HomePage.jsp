
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dal.BlogDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="top" class="dal.BlogDAO" scope="request"/>
        <jsp:useBean id="categories" class="dal.CategoryDAO" scope="request"/>
        <title>My Blogs</title>
    </head>
    <body>
        <div class="container">
            <div class="title">my blogs</div>
            <div class="menu">
                <a href="home">Home</a>
                <a href="Contact.jsp">Contact</a>
            </div>
            <div class="chosen_homepage">
                <img src="image/img02.jpg" alt=""/>
            </div>
            <div class="main">
                <div class="left">
                    <%@include file="Left.jsp" %>
                    
                </div>
                <div class="right">
                    <%@include file="Right.jsp" %>
                </div>
                
            </div>
        </div>
        
    </body>
</html>
