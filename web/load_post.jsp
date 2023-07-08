<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entities.Posts"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<div class="row">
<%
    Thread.sleep(1000);
    int cId=Integer.parseInt(request.getParameter("cid"));
   
    PostDao d = new PostDao(ConnectionProvider.geConnection());
    List<Posts>list=null;
    if(cId==0){
    list=d.getAllPost();
    }
    else
    {
          list=d.getAllPostById(cId);
    }
    if(list.size()==0)
    {
        out.println("<H3 class='display-3 text-center' >No Posts on this category....</H3>");
        return;
    }
    for(Posts p : list)
    {
%>

<div class="col-md-6 mt-4">
    
    <div class="card">
        <img class="card-img-top" src="blog_pics/<%=p.getpPic()%>" alt="Card image cap">
        <div class="card-body">
            <b><%=p.getpTitle()%></b>
            <p><%=p.getpContent()%></p>
            
        </div>
            <div class="card-footer text-center bg-primary">
                <a href="#!" class="btn btn-outline-light btn-sm"><i class="fa fa-thumbs-o-up"><span>10</span></i></a>
                <a href="show_blog_page.jsp?post_id=<%=p.getpId()%>" class="btn btn-outline-light btn-sm">Read More...</a>
                
                <a href="#!" class="btn btn-outline-light btn-sm"><i class="fa fa-commenting-o"><span>20 comments..</span></i></a>
            </div>
    </div>
    
</div>

<%

}
%>
</div>