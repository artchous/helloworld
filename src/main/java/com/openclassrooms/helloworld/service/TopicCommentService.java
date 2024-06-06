package com.openclassrooms.helloworld.service;

import com.openclassrooms.helloworld.model.TopicComment;
import com.openclassrooms.helloworld.repository.TopicCommentRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class TopicCommentService {

    @Autowired
    private TopicCommentRepository topicCommentRepository;

    //Normalement pas besoin de celui-là
    //retourne tous les commentaires
    public Iterable<TopicComment> getTopicComments() {
        return topicCommentRepository.findAll();
    }

    //retourne les commentaires correspondant au topic
    public Optional<TopicComment> getTopicCommentById(Long numTopic) {
        return topicCommentRepository.findById(numTopic);
    }

    //supprime 1 commentaire
    public void deleteTopicComment(final Long id) {
        topicCommentRepository.deleteById(id);
    }

    //sauvegarde 1 commentaire
    public TopicComment saveTopicComment(final TopicComment topicComment) {
        return topicCommentRepository.save(topicComment);
    }

}
