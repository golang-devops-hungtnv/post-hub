package org.example.projection.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.example.domain.post.Post;
import org.example.domain.post_comment.PostComment;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class CommentDto {
    private Long id;
    private String owner;
    private String postId;
    private String content;
    private List<String> images;
    private Long totalLikes;
    private Long totalComments;
    private Boolean isMainComment;
    private Long mainCommentId;

    public static CommentDto fromDomain(PostComment comment) {
        return CommentDto.builder().id(comment.getId()).
                owner(comment.getOwner()).
                content(comment.getContent()).
                images(comment.getImages()).
                totalLikes(comment.getTotalLikes()).
                totalComments(comment.getTotalComments()).
                isMainComment(comment.isMainComment()).
                mainCommentId(comment.getMainCommentId()).
                build();
    }
}
