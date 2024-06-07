package com.openclassrooms.helloworld.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="topicFile")
public class TopicFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "topicID")
    private Long   topicID;

    @Column(name = "fileTitle")
    private String file_title;

    @Column(name = "fileType")
    private String file_type;

    @Column(name = "fileContent")
    private String file_content;

    @Column(name = "fileDate")
    private String file_date;
}
