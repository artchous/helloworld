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
    public Optional<TopicComment> getCommentById(Long id) {
        return topicCommentRepository.findById(id);
    }

    //supprime 1 commentaire spécifique
    public void deleteComment(final Long id) {
        topicCommentRepository.deleteById(id);
    }

    //sauvegarde 1 commentaire spécifique
    public TopicComment saveComment(final TopicComment topicComment) {
        return topicCommentRepository.save(topicComment);
    }


    /** Commentaires lié à un topic **/
    //retourne les commentaires correspondant au topic
    public Iterable<TopicComment> getCommentByTopicId(Long topicID) {
        return topicCommentRepository.findCommentsByTopicID(topicID);
    }

    //supprime tous les commentaires liés à un topic
    public void deleteCommentByTopicId(Long topicID) {
        topicCommentRepository.deleteCommentsByTopicID(topicID);
    }

}
