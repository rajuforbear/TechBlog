<%-- 
    Document   : index
    Created on : 15-Aug-2022, 3:58:31 pm
    Author     : RAJLM
--%>

<%@page import="java.sql.*,com.tech.blog.helper.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tech Blog</title>
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
     
        <%@include file="normal_navbar.jsp" %>  
        
        <!<!-- Banner -->
        <div class="container-fluid p-0 m-0">
            <div class="jumbotron primary-background text-white">
                <div class="container">
                    <h3 class="display-3">Welcome to TechBlog</h3>
                <p>A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output.[citation needed] Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>
                <p>Most programming languages consist of instructions for computers. There are programmable machines that use a set of specific instructions, rather than general programming languages. Since the early 1800s, programs have been used to direct the behavior of machines such as Jacquard looms, music boxes and player pianos.</p>
                <button class="btn-outline-light btn-lg"> <span class="	fa fa-external-link"></span> Start ! its Free</button>
                <button class="btn-outline-light btn-lg"> <span class="	fa fa-user-circle-o fa-spin"></span><a href="login_page.jsp" class="primary-background text-white md-4">  Login</a></button>
     
            
                </div>
              
            </div>
        </div>
        <!-- cards -->
        <div class="container">
            <div class="row mb-2">
                <div class="col-md-4">
                    <div class="card">
                      <div class="card-body">
                        <h5 class="card-title">Java Programming Language</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn primary-background text-white">Read More...</a>
                       </div>
                    </div>
                </div>
                 <div class="col-md-4">
                    <div class="card">
                      <div class="card-body">
                        <h5 class="card-title">Java Programming Language</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn primary-background text-white">Read More...</a>
                       </div>
                    </div>
                </div>
                 <div class="col-md-4">
                    <div class="card">
                      <div class="card-body">
                        <h5 class="card-title">Java Programming Language</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn primary-background text-white">Read More...</a>
                       </div>
                    </div>
                </div>
            </div>
               <div class="row">
                <div class="col-md-4">
                    <div class="card">
                      <div class="card-body">
                        <h5 class="card-title">Java Programming Language</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn primary-background text-white">Read More...</a>
                       </div>
                    </div>
                </div>
                 <div class="col-md-4">
                    <div class="card">
                      <div class="card-body">
                        <h5 class="card-title">Java Programming Language</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn primary-background text-white">Read More...</a>
                       </div>
                    </div>
                </div>
                 <div class="col-md-4">
                    <div class="card">
                      <div class="card-body">
                        <h5 class="card-title">Java Programming Language</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn primary-background text-white">Read More...</a>
                       </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- cards end -->
        <!-- javascrip -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>                 
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>

            <!-- javascript end -->

    </body>
</html>
