

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <!-- css -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry ! Something went wrong.. </title>
    </head>
    <body>
        <div class="container text-center">

            <img src="img/eror2.png" alt="image" class="image-fluid">
            <h3 class="display-3">Sorry ! Something Went Wrong....</h3>
            <%= exception%>
            <a href="index.jsp" class="btn primary-background btn-lg text-white mt-3">HOME</a>

        </div>
    </body>
</html>
