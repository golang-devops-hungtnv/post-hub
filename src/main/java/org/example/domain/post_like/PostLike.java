package org.example.domain.post_like;

import org.example.domain.BaseEntity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "post_likes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PostLike extends BaseEntity {
    @Column(name = "owner", nullable = false)
    private String owner;

    @Column(name = "post_id", nullable = false)
    private Long postId;
}
