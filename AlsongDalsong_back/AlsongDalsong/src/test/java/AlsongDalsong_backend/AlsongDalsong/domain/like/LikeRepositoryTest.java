package AlsongDalsong_backend.AlsongDalsong.domain.like;

import static AlsongDalsong_backend.AlsongDalsong.TestConstants.VALID_COMMENT_ID;
import static AlsongDalsong_backend.AlsongDalsong.TestConstants.VALID_EMAIL;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import AlsongDalsong_backend.AlsongDalsong.domain.comment.Comment;
import AlsongDalsong_backend.AlsongDalsong.domain.comment.CommentRepository;
import AlsongDalsong_backend.AlsongDalsong.domain.user.User;
import AlsongDalsong_backend.AlsongDalsong.domain.user.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * 댓글 좋아요 레포지토리 테스트
 */
@DataJpaTest
class LikeRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private LikeRepository likeRepository;

    @Test
    @DisplayName("회원 아이디와 댓글 아이디로 댓글 좋아요 조회 테스트")
    void findByUserIdAndCommentId() {
        User user = userRepository.findByEmail(VALID_EMAIL);
        Comment comment = commentRepository.findById(VALID_COMMENT_ID).orElse(null);
        Like foundLike = likeRepository.findByUserIdAndCommentId(user, comment);

        assertNotNull(foundLike);
    }

    @Test
    @DisplayName("회원 아이디와 댓글 아이디로 댓글 좋아요 존재 확인 테스트")
    void existByUserIdAndCommentId() {
        User user = userRepository.findByEmail(VALID_EMAIL);
        Comment comment = commentRepository.findById(VALID_COMMENT_ID).orElse(null);
        boolean existLike = likeRepository.existsByUserIdAndCommentId(user, comment);

        assertTrue(existLike);
    }
}