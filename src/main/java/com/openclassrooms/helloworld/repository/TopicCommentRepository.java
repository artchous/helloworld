package com.openclassrooms.helloworld.repository;

import com.openclassrooms.helloworld.model.TopicComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicCommentRepository extends CrudRepository<TopicComment, Long> {

    Optional<TopicComment> findTopicCommentsByTopicID(long topicID);

    public void deleteTopicCommentsByTopicID(long topicID);

}
