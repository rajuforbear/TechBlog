

<%@page import="com.tech.blog.entities.User"%>
<%@page errorPage="error_page.jsp"%>
<%
   //validation
    User user = (User) session.getAttribute("currentUser");
    if (user == null) {
        response.sendRedirect("login_page.jsp");
    }

%>

<%

   int postId=Integer.parseInt(request.getParameter("post_id"));

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blogs</title>
        
         <!-- css -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>

        <style>
            .banner-background{
                background:polygon(50% 0%, 100% 0, 99% 94%, 63% 95%, 25% 89%, 0 100%, 0 0);


            }
        </style>
        <!-- css end -->
        
    </head>
    <body>
        <h1>This is post</h1>
        <h1>Post Id=<%=postId%></h1>
    </body>
</html>
