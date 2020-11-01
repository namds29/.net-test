<%-- 
    Document   : Contact
    Created on : Sep 25, 2020, 9:46:25 AM
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
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="title">my blogs</div>
            <div class="menu">
                <a href="home">Home</a>
                <a href="Contact.jsp">Contact</a>
            </div>
            <div class="chosen_contact">
                <img src="image/img02.jpg" alt=""/>
            </div>
            <div class="main">
                <div class="left">

                    <div class="contact-box">
                        <div class="title_contact_box">All field are required</div>
                        <div class="content_contact_box">
                            <form action="contact" method="get">
                                <div class="each-input">Name: <input type="text" name="name" required></div>
                                <div class="each-input">Email: <input type="email" name="email" required></div>
                                <div class="each-input"> Phone: <input type="text" name="phone" required></div>
                                <div class="each-input">Company: <input type="text" name="company" required></div>

                                <div class="each-input">
                                    <div class="one_row">
                                        <div><label style="padding-right: 5px;">Message: </label> </div>
                                        <div><textarea style="resize: none"  required rows="3"  name="message" ></textarea></div>
                                    </div>
                                </div>
                                <div class="showsubmit_notification">
                                    <div class="notification">
                                        <c:if test="${notification == 'Send successfully !'}" >
                                            <h3 style="color: green">${notification}</h3>
                                        </c:if>
                                        <c:if test="${notification != 'Send successfully !'}" >
                                            <h3 style="color: red">${notification}</h3>
                                        </c:if>
                                    </div>
                                    <button type="submit" class="submit">send</button>
                                </div>
                            </form>
                        </div>

                    </div>

                </div>
                <div class="right">
                    <jsp:include page="Right.jsp"/>
                </div>

            </div>
        </div>

    </body>
</html>