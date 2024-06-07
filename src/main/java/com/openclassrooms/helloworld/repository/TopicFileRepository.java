package com.openclassrooms.helloworld.repository;

import com.openclassrooms.helloworld.model.TopicFile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicFileRepository extends CrudRepository<TopicFile, Long> {

    Optional<TopicFile> findTopicFilesByTopicID(Long topicID);

    public void deleteTopicFilesByTopicID(Long topicID);

}
