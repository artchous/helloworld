package com.openclassrooms.helloworld.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="topicComment")
public class TopicComment {

    @Id
    private Long id;

    private String comment_user;
    private String comment_content;
    private String comment_date;
}
