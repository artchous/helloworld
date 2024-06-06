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

    //Normalement pas besoin de celui-là
    //retourne tous les fichiers
    public Iterable<TopicFile> getTopicFiles() {
        return topicFileRepository.findAll();
    }

    //retourne les fichiers correspondant au topic
    public Optional<TopicFile> getTopicFileById(Long numTopic) {
        return topicFileRepository.findById(numTopic);
    }

    //supprime 1 fichier
    public void deleteTopicFile(final Long id) {
        topicFileRepository.deleteById(id);
    }

    //sauvegarde 1 fichier
    public TopicFile saveTopicFile(final TopicFile topicFile) {
        return topicFileRepository.save(topicFile);
    }

}
