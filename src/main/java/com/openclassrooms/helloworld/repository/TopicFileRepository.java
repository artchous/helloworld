package com.openclassrooms.helloworld.repository;

import com.openclassrooms.helloworld.model.TopicFile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicFileRepository extends CrudRepository<TopicFile, Long> {
}
