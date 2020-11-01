<%-- 
    Document   : Right
    Created on : Sep 24, 2020, 11:05:42 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<div class="category">Categories</div>
<div class="type-category" style="padding-left: 40px;">
    <c:forEach items="${categories.categories}" var="x">
        <div class="each-category">
            <img src="image/img01.jpg" alt=""/>&nbsp; &nbsp; &nbsp;
            <a style="color: black" href="search?category_id=${x.id}"> ${x.name}</a>

        </div>
    </c:forEach>

</div>

