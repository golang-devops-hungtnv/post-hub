package org.example.domain.post;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseEntity;

import java.util.List;

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

    @ElementCollection
    @CollectionTable(name = "images", joinColumns = @JoinColumn(name = "post_id"))
    @Column(name = "image")
    private List<String> images;

    @Column(name="total_likes", nullable = true)
    private Long totalLikes;

    @Column(name="total_comments", nullable = true)
    private Long totalComments;
}





