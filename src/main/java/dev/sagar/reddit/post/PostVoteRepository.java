package dev.sagar.reddit.post;

import dev.sagar.reddit.user.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostVoteRepository extends JpaRepository<PostVote, Long> {
  Optional<PostVote> findByPostAndUser(Post post, User user);
}
