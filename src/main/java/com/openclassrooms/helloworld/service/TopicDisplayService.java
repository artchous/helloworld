package com.openclassrooms.helloworld.service;

import com.openclassrooms.helloworld.model.TopicDisplay;
import com.openclassrooms.helloworld.repository.TopicDisplayRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class TopicDisplayService {

    @Autowired
    private TopicDisplayRepository topicDisplayRepository;

    //retourne tous les topics
    public Iterable<TopicDisplay> getTopicDisplays() {
        return topicDisplayRepository.findAll();
    }

    //retourne 1 seul topic
    public Optional<TopicDisplay> getTopicDisplayById(final Long id) {
        return topicDisplayRepository.findById(id);
    }

    //supprime 1 topic
    public void deleteTopicDisplay(final Long id) {
        topicDisplayRepository.deleteById(id);
    }

    //sauvegarde 1 topic
    public TopicDisplay saveTopicDisplay(TopicDisplay topicDisplay) {
        return topicDisplayRepository.save(topicDisplay);
    }

}
