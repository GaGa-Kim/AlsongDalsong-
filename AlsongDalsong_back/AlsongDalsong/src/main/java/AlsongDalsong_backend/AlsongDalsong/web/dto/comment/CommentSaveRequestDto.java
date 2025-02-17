package AlsongDalsong_backend.AlsongDalsong.web.dto.comment;

import AlsongDalsong_backend.AlsongDalsong.constants.Message;
import AlsongDalsong_backend.AlsongDalsong.domain.comment.Comment;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 댓글 저장 dto
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentSaveRequestDto {
    @Email(message = Message.INPUT_EMAIL)
    @ApiModelProperty(notes = "댓글 작성자 이메일", example = "1234@gmail.com", required = true)
    private String email;

    @NotNull(message = Message.INPUT_POST_ID)
    @ApiModelProperty(notes = "게시글 id", example = "1", required = true)
    private Long postId;

    @NotBlank(message = Message.INPUT_COMMENT_CONTENT)
    @ApiModelProperty(notes = "내용", example = "구매하세요", required = true)
    private String content;

    @Builder
    public CommentSaveRequestDto(String email, Long postId, String content) {
        this.email = email;
        this.postId = postId;
        this.content = content;
    }

    public Comment toEntity() {
        return Comment.builder()
                .content(content)
                .build();
    }
}