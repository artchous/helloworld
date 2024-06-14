package com.openclassrooms.helloworld.controller;

import com.openclassrooms.helloworld.model.TopicComment;
import com.openclassrooms.helloworld.service.TopicCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TopicCommentController {

    @Autowired
    private TopicCommentService commentService;

    /**
     * Create - Add a new comment
     * @param comment An object comment
     * @return The comment object saved
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/createComment")
    public TopicComment createComment(@RequestBody TopicComment comment) {
        return commentService.saveComment(comment);
    }

    /**
     * Read - all comments related to a topic
     * @param topicID - The id of the related topic
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/commentsByTopic{topicID}")
    public Iterable<TopicComment> getCommentsByTopic(@PathVariable("topicID") final Long topicID) {
        return commentService.getCommentByTopicId(topicID);

    }

    /**
     * Update - update an existing comment
     * @param id The id of the comment
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/comment{id}")
    public TopicComment updateComment(@PathVariable("id") final Long id, @RequestBody TopicComment comment) {
        //Va chercher le commentaire à modifier grâce à id
        Optional<TopicComment> c = commentService.getCommentById(id);
        if (c.isPresent()) {
            TopicComment currentComment = c.get();

             // Vérifie les modifs du @param comment
             // et change les anciennes données où il y a besoin
            String commentUser = comment.getComment_user();
            if (commentUser != null) {
                currentComment.setComment_user(commentUser);
            }
            String commentContent = comment.getComment_content();
            if (commentContent != null) {
                currentComment.setComment_content(commentContent);
            }
            String commentDate = comment.getComment_date();
            if (commentDate != null) {
                currentComment.setComment_date(commentDate);
            }

            //sauvegarde les modifications
            commentService.saveComment(currentComment);
            return currentComment;
        } else {
            return null;
        }
    }

    /**
     * Delete - delete a comment
     * @param id - The id of the comment
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/comment{id}")
    public void deleteComment(@PathVariable("id") final Long id) {
        commentService.deleteComment(id);
    }


    //Pas besoin si @OneToMany fonctionne et grâce à CascadeType.ALL
    /**
     * Delete - all comments related to a topic
     * @param topicID - The id of the related topic
     */
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/commentsByTopic{topicID}")
    public void deleteCommentsByTopic(@PathVariable("topicID") final Long topicID) {
        commentService.deleteCommentByTopicId(topicID);
    }
}




