package AlsongDalsong_backend.AlsongDalsong.domain.post;

import AlsongDalsong_backend.AlsongDalsong.domain.user.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTodo(Todo todo);

    List<Post> findByTodoAndCategory(Todo todo, Category category);
    
    List<Post> findByTodoAndDecisionOrderByVoteListDesc(Todo todo, Decision decision);

    Long countByUserIdAndTodoAndDecision(User user, Todo todo, Decision decision);
}
