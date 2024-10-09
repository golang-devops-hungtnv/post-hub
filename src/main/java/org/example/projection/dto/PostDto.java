package org.example.projection.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.example.domain.post.Post;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class PostDto {
    private Long id;
    private String owner;
    private String content;
    private List<String> images;
    private Long totalLikes;
    private Long totalComments;

    public static PostDto fromDomain(Post post) {
        return PostDto.builder().id(post.getId()).
                owner(post.getOwner()).
                content(post.getContent()).
                images(post.getImages()).
                totalLikes(post.getTotalLikes()).
                totalComments(post.getTotalComments()).build();
    }

}
