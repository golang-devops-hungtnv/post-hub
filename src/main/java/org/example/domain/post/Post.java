package org.example.domain.post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseEntity;
@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Post extends BaseEntity {
    @Column(name = "owner", nullable = false, unique = true)
    private String owner;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name="total_likes", nullable = true)
    private Long total_likes;

    @Column(name="total_comments", nullable = true)
    private Long total_comments;
}





