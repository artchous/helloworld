package com.openclassrooms.helloworld.repository;

import com.openclassrooms.helloworld.model.TopicDisplay;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDisplayRepository extends CrudRepository<TopicDisplay, Long> {
}
