DROP TABLE IF EXISTS employees;

DROP TABLE IF EXISTS topic_comment;
DROP TABLE IF EXISTS topic_file;
DROP TABLE IF EXISTS topic_display;

CREATE TABLE employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);

INSERT INTO employees (first_name, last_name, mail, password)
VALUES ('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent'),
       ('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie'),
       ('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe');


CREATE TABLE topic_comment
(
    id              INT AUTO_INCREMENT PRIMARY KEY,

    topicID         INT,
    comment_user    VARCHAR(400) NOT NULL,
    comment_content VARCHAR(500) NOT NULL,
    comment_date    VARCHAR(250) NOT NULL
);

INSERT INTO topic_comment (topicID, comment_user, comment_content, comment_date)
VALUES (1, 'Atlas Corrigan', 'Il faut améliorer et mettre des commentaires', '18.02.2012'),
       (1, 'Ryle Kincaid', 'Pas mal le code','12.12.2012'),
       (2, 'Mike Ross', 'On y est presque', '20.05.2011'),
       (2, 'Louis Litt', 'Ouf, cest totalement faux', '21.03.2024'),
       (3, 'Louis Litt', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut arcu aliquam, bibendum mi sit amet, sodales velit. Sed gravida ultrices porttitor. Praesent id velit nec sem egestas venenatis.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut arcu aliquam, bibendum mi sit amet, sodales velit. Sed gravida ultrices porttitor. Praesent id velit nec sem egestas venenatis.', '21.03.2024'),
       (4, 'Lupin','On y est presque', '20.05.2011'),
       (5, 'Veronica Lodge', 'Woaw incroyable', '15.02.2000')
;


CREATE TABLE topic_file
(
    id              INT AUTO_INCREMENT PRIMARY KEY,

    topicID         INT,
    file_title      VARCHAR(400) NOT NULL,
    file_type       VARCHAR(250) NOT NULL,
    file_content    VARCHAR(500) NOT NULL,
    file_date       VARCHAR(250) NOT NULL
);

INSERT INTO topic_file (topicID, file_title, file_type, file_content, file_date)
VALUES (1,'helloWorld', 'js', 'if (blabla == "my test" { '
                              ' \n //do something \n}', '15.02.2000'),
       (2,'helloWorld', 'js', 'if (blabla=blabla)' ||
                              '{//do something}', '13.02.2009'),
       (2,'hey', 'html', 'if (blabla=blabla)' ||
                              '{//do something}', '15.02.2000'),
       (3,'ficher231', 'html', 'if (blabla=blabla)' ||
                         '{//do something}', '13.02.2009'),
       (4,'helloWorld', 'js', 'if (blabla=blabla)' ||
                              '{//do something}', '12.12.2012'),
       (5,'file1', 'html', 'if (blabla=blabla)' ||
                         '{//do something}', '20.05.2011')
;


CREATE TABLE topic_display
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    title           VARCHAR(400) NOT NULL,
    username        VARCHAR(400) NOT NULL,
    date_post       VARCHAR(250) NOT NULL,
    description     VARCHAR(500) NOT NULL
);

INSERT INTO topic_display (title, username, date_post, description)
VALUES
    ('Essai1: Spring boot','Lily Bloom','23.02.24','Il me manque des infos'),
    ('Topic 2', 'Harvey Specter', '17.11.2003', 'Je ne sais pas comment améliorer'),
    ('Topic 3', 'Louis Litt', '11.12.1984', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut arcu aliquam, bibendum mi sit amet, sodales velit. Sed gravida ultrices porttitor. Praesent id velit nec sem egestas venenatis.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut arcu aliquam, bibendum mi sit amet, sodales velit. Sed gravida ultrices porttitor. Praesent id velit nec sem egestas venenatis.'),
    ('Topic 4: helloWorld', 'Dora', '28.10.1293', 'J ai besoin daide'),
    ('Topic 5', 'Anna', '28.10.1293', 'Partons à l aventure'),
    ('Topic 6', 'Mike', '28.10.1293', 'Aidez-moi :)')
;





