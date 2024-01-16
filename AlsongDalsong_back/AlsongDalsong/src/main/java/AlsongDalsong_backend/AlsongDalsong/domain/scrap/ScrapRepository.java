package AlsongDalsong_backend.AlsongDalsong.domain.scrap;

import AlsongDalsong_backend.AlsongDalsong.domain.post.Post;
import AlsongDalsong_backend.AlsongDalsong.domain.user.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScrapRepository extends JpaRepository<Scrap, Long> {
    Scrap findByUserIdAndPostId(User user, Post post);

    boolean existsByUserIdAndPostId(User user, Post post);

    List<Scrap> findByUserId(User user);
}