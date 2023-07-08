/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.tech.blog.servletes;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.dao.UpdateUser;
import com.tech.blog.entities.Messege;
import com.tech.blog.helper.Helper;
import java.io.File;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;



/**
 *
 * @author RAJLM
*/

@MultipartConfig
public class EditServlete extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
             HttpSession s = request.getSession();
             User user =(User)s.getAttribute("currentUser");
         
             String userName=request.getParameter("user_name");
             String userEmail= request.getParameter("user_email");
             String userPassword = request.getParameter("user_password");
             String userAbout =request.getParameter("user_about");
            // String id =request.getParameter("user_id");
            //int   UserId=Integer.parseInt(id);
            Part part = request.getPart("user_profile");
            String new_pic_name=part.getSubmittedFileName();
            String old_pic_name=user.getProfile();
         
             
            
             user.setName(userName);
             user.setEmail(userEmail);
             user.setPassword(userPassword);
             user.setAbout(userAbout);
             user.setProfile(new_pic_name);
             
           
             //user.setId(UserId);
         
             UpdateUser up = new UpdateUser(ConnectionProvider.geConnection());
             
            boolean ans= up.updateUser(user);
            if(ans){
            
                String path = request.getRealPath("/")+"pics"+File.separator + user.getProfile();
                String oldpath = request.getRealPath("/")+"pics"+File.separator + old_pic_name;
                if(!old_pic_name.equals("default.png"))
                    Helper.deleteFile(oldpath);
                
               // out.println("updated to db....");
              if(Helper.saveFile(part.getInputStream(), path))
              {
                     Messege msg = new Messege("profile details updated","success","alert-success");
                //  HttpSession s =request.getSession();
                  s.setAttribute("msg", msg);
              }
                 
                 
            }
            else{
            
                  Messege msg = new Messege("something went wrong ! please try Again","error","alert-danger");
                //  HttpSession s =request.getSession();
                  s.setAttribute("msg", msg);
            }
        response.sendRedirect("profile_page.jsp"); 
             
             
             
             
             
             
         
             
             
            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditServlete at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
