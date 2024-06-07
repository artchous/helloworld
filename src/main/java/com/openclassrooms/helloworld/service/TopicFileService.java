package com.openclassrooms.helloworld.service;

import com.openclassrooms.helloworld.model.TopicFile;
import com.openclassrooms.helloworld.repository.TopicFileRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class TopicFileService {

    @Autowired
    private TopicFileRepository topicFileRepository;

    /** Fichier spécifique **/
    //retourne 1 fichier spécifique
    public Optional<TopicFile> getTopicFileById(Long id) {
        return topicFileRepository.findById(id);
    }

    //supprime 1 fichier spécifique
    public void deleteTopicFile(final Long id) {
        topicFileRepository.deleteById(id);
    }

    //sauvegarde 1 fichier spécifique
    public TopicFile saveTopicFile(final TopicFile topicFile) {
        return topicFileRepository.save(topicFile);
    }

    /** Fichiers lié à un topic **/
    //retourne les fichiers correspondant au topic
    public Optional<TopicFile> getTopicFilesByTopicId(Long topicId) {
        return topicFileRepository.findTopicFilesByTopicID(topicId);
    }

    //supprime tous les fichiers liés au topic
    public void deleteTopicFilesByTopicId(Long topicId) {
        topicFileRepository.deleteTopicFilesByTopicID(topicId);
    }

}
