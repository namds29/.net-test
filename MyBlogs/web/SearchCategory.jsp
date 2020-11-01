<%-- 
    Document   : HomePage
    Created on : Sep 23, 2020, 10:16:05 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
            <div class="main">
                <div class="left">
                    <div class="name" style="text-align: center;font-size: 80px;">${category.name}</div>

                    <div class="search_blog">
                        <c:forEach items="${listBlog}" var="x">
                            <div class="each_blog">
                                <div><img class="each_blog_image" src="image/${x.image}" alt=""/></div>

                                <div class="each_blog_content">
                                    <div class="each_title_blog"><a href="detail?id=${x.id}"><h1>${x.title}</h1></a></div>
                                    ${x.shortDescription}<br>
                                    <br><p style="text-align: center;color: grey">Posted on ${x.timePost}</p>
                                </div>

                            </div>
                        </c:forEach>
                    </div>
                    <c:if test="${listBlog != null}">
                        <div class="paging">
                            <c:forEach begin="1" end="${maxPage}" step="1" var="i">
                                <a class="${i==pageIndex?"active":""}" href="search?pageIndex=${i}&category_id=${category.id}">${i}</a>
                            </c:forEach>
                        </div>
                    </c:if>

                </div>
                <div class="right">
                    <%@include file="Right.jsp" %>
                </div>

            </div>
        </div>

    </body>
</html>
