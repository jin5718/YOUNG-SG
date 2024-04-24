package com.d208.AIclerk.meeting.repository;


import com.d208.AIclerk.entity.Comment;
import com.d208.AIclerk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Optional<Comment> findByIdAndUserId(Long id, Long user_id);

}
