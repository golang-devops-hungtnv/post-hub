package org.example.domain.comment_like;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseEntity;


@Entity
@Table(name = "comment_like")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class CommentLike extends BaseEntity {
    @Column(name = "owner", nullable = false)
    private String owner;

    @Column(name = "comment_id", nullable = false)
    private Long commentId;
}
