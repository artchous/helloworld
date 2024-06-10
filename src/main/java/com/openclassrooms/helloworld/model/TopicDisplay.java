package com.openclassrooms.helloworld.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="topic_display")
public class TopicDisplay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String username;
    private String date_post;
    private String description;

}
