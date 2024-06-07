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
    @PostMapping("/comment")
    public TopicComment createComment(@RequestBody TopicComment comment) {
        return commentService.saveTopicComment(comment);
    }

    /**
     * Read - Get one specific comment
     * @param id The id of the comment
     */
    @GetMapping("/topic{topicID}/comment{id}")
    public TopicComment getComment(@PathVariable("id") final Long id) {
        Optional<TopicComment> topicComment = commentService.getTopicCommentById(id);
        return topicComment.orElse(null);
    }

    /**
     * Update - update an existing comment
     * @param id The id of the comment
     */
    @PutMapping("/topic{topicID}/comment{id}")
    public TopicComment updateComment(@PathVariable("id") final Long id, @RequestBody TopicComment comment) {
        //Va chercher le commentaire à modifier grâce à id
        Optional<TopicComment> c = commentService.getTopicCommentById(id);
        if (c.isPresent()) {
            TopicComment currentComment = c.get();

            /**
             * Vérifie les modifs du @param comment
             * et change les anciennes données où il y a besoin
             */
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
            commentService.saveTopicComment(currentComment);
            return currentComment;
        } else {
            return null;
        }
    }

    /**
     * Delete - delete a comment
     * @param id - The id of the comment
     */
    @DeleteMapping("/topic{topicID}/comment{id}")
    public void deleteComment(@PathVariable("id") final Long id) {
        commentService.deleteTopicComment(id);
    }

    /**
     * Read - all comments related to a topic
     * @param topicID - The id of the related topic
     */
    @GetMapping("/topic{topicID}/comments")
    public Optional<TopicComment> getAllCommentsForTopic(@PathVariable("topicID") final Long topicID) {
        return commentService.getTopicCommentByTopicId(topicID);
    }

    /**
     * Delete - all comments related to a topic
     * @param topicID - The id of the related topic
     */
    @DeleteMapping("/topic{topicID}/comments")
    public void deleteAllCommentsForTopic(@PathVariable("topicID") final Long topicID) {
        commentService.deleteTopicCommentByTopicId(topicID);
    }
}




