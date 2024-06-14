package com.openclassrooms.helloworld.controller;

import com.openclassrooms.helloworld.model.TopicDisplay;
import com.openclassrooms.helloworld.service.TopicDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TopicDisplayController {

    @Autowired
    private TopicDisplayService displayService;

    /**
     * Create - Add a new topic
     * @param topic An object topicDisplay
     * @return The topic object saved
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/createNewTopic")
    public TopicDisplay createTopic(@RequestBody TopicDisplay topic) {
        return displayService.saveTopic(topic);
    }

    /**
     * Read - Get one topic
     * @param id The id of the topic
     * @return A displayTopic fulfilled
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/topic{id}")
    public TopicDisplay getTopicById(@PathVariable("id") final Long id) {
        Optional<TopicDisplay> topicDisplay = displayService.getTopicById(id);
        return topicDisplay.orElse(null);
    }

    /**
     * Read - Get all topics
     * @return - An Iterable object of TopicDisplay fulfilled
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/topics")
    public Iterable<TopicDisplay> getAllTopics() {
        return displayService.getTopics();
    }

    /**
     * Update - Update an existing topic
     * @param id    - The id of the employee to update
     * @param topic - the object topic updated
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/topic{id}")
    public TopicDisplay updateTopic(@PathVariable("id") final Long id, @RequestBody TopicDisplay topic) {
        //Va chercher le topic à modifier grâce à id
        Optional<TopicDisplay> t = displayService.getTopicById(id);
        if (t.isPresent()) {
            TopicDisplay currentTopic = t.get();

             // Vérifie les modifs du @param topic
             // et change les anciennes données où il y a besoin
            String title = topic.getTitle();
            if (title != null) {
                currentTopic.setTitle(title);
            }
            String username = topic.getUsername();
            if (username != null) {
                currentTopic.setUsername(username);
            }
            String date_post = topic.getDate_post();
            if (date_post != null) {
                currentTopic.setDate_post(date_post);
            }
            String description = topic.getDescription();
            if (description != null) {
                currentTopic.setDescription(description);
            }

            //sauvegarde les modifications
            displayService.saveTopic(currentTopic);
            return currentTopic;
        } else {
            return null;
        }
    }

    /**
     * Delete - delete a topic
     * @param id - The id of the topic to delete
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/topic{id}")
    public void deleteTopic(@PathVariable("id") final Long id) {
        displayService.deleteTopic(id);
    }
}