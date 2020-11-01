<%-- 
    Document   : LastPost
    Created on : Sep 24, 2020, 11:12:06 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="dal.BlogDAO"%>



<div class="last-Post">
    <c:if test="${top.top3 != null}">
        <c:forEach items="${top.top3}" var="x">
            <div class="each-Post">
                <div class="dot"> &nbsp; .  &nbsp;</div>
                <div class="bold"><a href="detail?id=${x.id}">${x.title}</a> &nbsp;</div>
                <div class="grey" ><em>Posted on ${x.timePost}</em></div>
            </div>
        </c:forEach>
    </c:if>

</div>


