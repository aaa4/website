package c.e.d.services;

import c.e.d.forumElements.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DevService {
    private  static List<Post> MOCK_POSTS = new ArrayList();

    public DevService() {
        populate();
    }


    public void populate(){
      MOCK_POSTS.add(new Post(1,"admin","Всем привет, это первый пост"));
      MOCK_POSTS.add(new Post(2,"admin","Пост для проверки перебора"));
      MOCK_POSTS.add(new Post(3,"admin","Просто третий пост"));
  }

  public void addPost(Post post){
        MOCK_POSTS.add(post);

  }

  public List<Post> getPosts(){
      return MOCK_POSTS;
  }
}
