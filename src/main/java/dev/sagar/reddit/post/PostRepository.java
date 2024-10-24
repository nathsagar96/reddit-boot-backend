package dev.sagar.reddit.post;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
  List<Post> findAllBySubredditId(Long subredditId);

  List<Post> findAllByUserId(Long userId);
}
