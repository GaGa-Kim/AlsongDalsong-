package AlsongDalsong_backend.AlsongDalsong.web.dto.comment;

import AlsongDalsong_backend.AlsongDalsong.domain.comment.Comment;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * 댓글 조회 dto
 */
@Getter
public class CommentResponseDto {

    @ApiModelProperty(notes = "댓글 기본키", example = "1")
    private Long id;

    @ApiModelProperty(notes = "댓글 작성자 이메일", example = "1234@gmail.com")
    private String email; // 작성자 이메일

    @ApiModelProperty(notes = "댓글 작성자 닉네임", example = "가경")
    private String nickname; // 작성자 닉네임

    @ApiModelProperty(notes = "댓글 작성자 프로필 사진", example = "http")
    private String profile; // 프로필 사진

    @ApiModelProperty(notes = "게시글 기본키", example = "1")
    private Long postId; // 게시글 기본키

    @ApiModelProperty(notes = "내용", example = "꼭 구매하세요")
    private String content; // 내용

    public CommentResponseDto(Comment comment) {
        this.id = comment.getId();
        this.email = comment.getUserId().getEmail();
        this.nickname = comment.getUserId().getNickname();
        this.profile = comment.getUserId().getProfile();
        this.postId = comment.getPostId().getId();
        this.content = comment.getContent();
    }
}