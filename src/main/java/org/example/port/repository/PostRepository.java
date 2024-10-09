package org.example.port.repository;

import org.example.domain.post.Post;
import org.example.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findByPostId(String postId);

    List<Post> findByOwnerId(Long ownerId);

    List<Post> findByOwnerIdOrderByCreatedAtDesc(Long ownerId);

    List<Post> findByOwnerIdAndCreatedAtBetween(Long ownerId, Data startDate, Date endDate);

}
