
import com.tech.blog.dao.PostDao;
import com.tech.blog.entities.Posts;
import com.tech.blog.helper.ConnectionProvider;
import java.util.List;


public class FetchPostMain {
    public  static void main(String[] args)
    {
        PostDao post = new PostDao(ConnectionProvider.geConnection());
        List<Posts> pst = post.getAllPost();
        for(Posts p:pst)
        {
          System.out.println(p.getpId()+" "+p.getpTitle());
        }
    }
}
