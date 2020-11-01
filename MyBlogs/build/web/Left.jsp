<%-- 
    Document   : Left
    Created on : Sep 24, 2020, 11:05:51 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


    <div class="type">
        <div class="green">
            Category ${data.category}
            <div class="dot"> &nbsp; .  &nbsp;</div>
        </div> 
        <em>Full Category</em>

    </div>
    <div class="name">${data.title}</div>
    <div class="timePost"><div class="grey">Posted on ${data.timePost}
            <div class="dot"> &nbsp; .  &nbsp;</div></div>

        <em>Full Article</em>
    </div>
    <div class="description">
        <div class="image-space">
            <img class="image" src="image/${data.image}" alt=""/>
        </div>
        <div class="content">
            ${data.description}
        </div>
    </div>
    <div >
        <jsp:include page="LastPost.jsp"/>
    </div>

