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

    /** Commentaire spécifique **/
    //retourne 1 commentaire spécifique
    public Optional<TopicComment> getTopicCommentById(Long id) {
        return topicCommentRepository.findById(id);
    }

    //supprime 1 commentaire spécifique
    public void deleteTopicComment(final Long id) {
        topicCommentRepository.deleteById(id);
    }

    //sauvegarde 1 commentaire spécifique
    public TopicComment saveTopicComment(final TopicComment topicComment) {
        return topicCommentRepository.save(topicComment);
    }


    /** Commentaires lié à un topic **/
    //retourne les commentaires correspondant au topic
    public Optional<TopicComment> getTopicCommentByTopicId(Long topicID) {
        return topicCommentRepository.findById(topicID);
    }

    //supprime tous les commentaires liés à un topic
    public void deleteTopicCommentByTopicId(Long topicID) {
        topicCommentRepository.deleteTopicCommentsByTopicID(topicID);
    }

}
