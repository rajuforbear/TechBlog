/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.tech.blog.entities.User;

/**
 *
 * @author RAJLM
 */
public class UpdateUser {
    
    
    Connection con;
    
    public  UpdateUser(Connection con){
         this.con=con;
    }
    
    public  boolean updateUser(User user){
      
            boolean f = false;
            
        
        
        
        try{
        
            String querry="update user set name=?,email=?,password=?,gender=?,about=? where id=?";
             PreparedStatement pstmt=con.prepareStatement(querry);
             
             pstmt.setString(1, user.getName());
             pstmt.setString(2, user.getEmail());
             pstmt.setString(3, user.getPassword());
             pstmt.setString(5, user.getAbout());
             pstmt.setString(4, user.getGender());
           
             pstmt.setInt(6, user.getId());
             pstmt.executeUpdate();
             f=true;
             
            
             
        }catch(Exception e){
           e.printStackTrace();
        }
        return f;
    }
    
    public boolean updatePhotoName(User user){
    
              boolean f = false;
              
              
              try{
              
                   String q = "update user set profile=? where id=?";
                   
                   PreparedStatement pstmt = con.prepareStatement(q);
                   pstmt.setString(1, user.getProfile());
                   pstmt.setInt(2, user.getId());
              }catch(Exception e){
                 e.printStackTrace();
              }
              
              
              
              return f;    
    
    }
    
   
}
