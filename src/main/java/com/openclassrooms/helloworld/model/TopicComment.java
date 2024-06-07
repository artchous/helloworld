package com.openclassrooms.helloworld.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="topicComment")
public class TopicComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "topicID")
    private Long   topicID;

    @Column(name = "commentUser")
    private String comment_user;

    @Column(name = "commentContent")
    private String comment_content;

    @Column(name = "commentDate")
    private String comment_date;
}
