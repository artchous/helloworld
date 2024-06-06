package com.openclassrooms.helloworld.repository;

import com.openclassrooms.helloworld.model.TopicComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicCommentRepository extends CrudRepository<TopicComment, Long> {
}
