package com.openclassrooms.helloworld.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="topicFile")
public class TopicFile {

    @Id
    private Long id;

    private String file_title;
    private String file_type;
    private String file_content;
    private String file_date;
}
