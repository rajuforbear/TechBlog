 
package com.tech.blog.dao;
import com.tech.blog.entities.Category;
import com.tech.blog.entities.Posts;
import com.tech.blog.helper.ConnectionProvider;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostDao {
    Connection con;

    public PostDao(Connection con) {
        this.con = con;
    }
    
    public  ArrayList<Category> getAllCategories(){
      ArrayList<Category> list =new ArrayList<>();
      
      try{
          
          String q= "select * from categories";
          Statement st = this.con.createStatement();
          ResultSet set = st.executeQuery(q);
          
          while(set.next()){
          
              int cid = set.getInt("cid");
              String name = set.getString("name");
              String description=set.getString("description");
              Category c = new Category(cid, name, description);
              list.add(c);
          }
      }
      catch(Exception e){
          e.printStackTrace();
      }
      
      return list;
    }
    public boolean savePost(Posts p){
    
            boolean flag =false;
            try{
                String q = "insert into posts(pTitle,pContent,pCode,pPic,catId,userId) values(?,?,?,?,?,?)";
                PreparedStatement pstm = con.prepareStatement(q);
                pstm.setString(1, p.getpTitle());
                pstm.setString(2,p.getpContent() );
                pstm.setString(3, p.getpCode());
                pstm.setString(4, p.getpPic());
                pstm.setInt(5, p.getCatId());
                pstm.setInt(6, p.getUserId());
                pstm.executeUpdate();
                flag=true;
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
            return flag;
    }
    
    
    //get all the post
    public List<Posts> getAllPost()
    {
    
          List<Posts> list= new ArrayList<>();
        try {
            String q= "select * from posts order by pId desc";
            PreparedStatement pst = con.prepareStatement(q);
           
            ResultSet set = pst.executeQuery();
            while(set.next()){
        int pId = set.getInt("pId");
        String pTitle=set.getString("pTitle");
        String pContent=set.getString("pContent");
        String pCode=set.getString("pCode");
        String pPic =set.getString("pPic");
        Timestamp pDate = set.getTimestamp("pDate");
        int catId=set.getInt("catId");
        int userId=set.getInt("userId");
        Posts post = new Posts(pId, pTitle, pContent, pCode, pPic, pDate, catId, userId);
             list.add(post);
            }
             
        }
        catch(Exception e){
            System.out.println("error");
        }
        return list;
    
    }
    public List<Posts> getAllPostById(int pId)
    {
         List<Posts> list= new ArrayList<>();
        try {
            String q= "select * from posts where pId=?";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setInt(1, pId);
            ResultSet set = pst.executeQuery();
            while(set.next()){
       // int pId = set.getInt("pId");
        String pTitle=set.getString("pTitle");
        String pContent=set.getString("pContent");
        String pCode=set.getString("pCode");
        String pPic =set.getString("pPic");
        Timestamp pDate = set.getTimestamp("pDate");
        int catId=set.getInt("catId");
        int userId=set.getInt("userId");
        Posts post = new Posts( pTitle, pContent, pCode, pPic, pDate, catId, userId);
             list.add(post);
            }
             
        }
        catch(Exception e){
            System.out.println("error");;
        }
        return list;
       
    }
    
    
    
}
