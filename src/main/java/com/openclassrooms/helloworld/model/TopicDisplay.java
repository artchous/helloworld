package com.openclassrooms.helloworld.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(
            //ex:si supprimer topic --> supprime comments
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            //tous les commentaires associés récupérés
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "topicID")
    private List<TopicComment> comments = new ArrayList<>();


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "topicID")
    private List<TopicFile> files = new ArrayList<>();

}
