package org.example.domain.post_comment;

import org.example.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseEntity;


@Entity
@Table(name = "post_comments")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PostComment extends BaseEntity {
    @Column(name = "owner", nullable = false)
    private String owner;

    @Column(name = "post_id", nullable = false)
    private Long postId;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "total_likes")
    private Long totalLikes;

    @Column(name = "total_comments")
    private Long totalComments;

}
