DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS codeFragment;

DROP TABLE IF EXISTS topicComment;
DROP TABLE IF EXISTS topicFile;
DROP TABLE IF EXISTS topicDisplay;

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

CREATE TABLE codeFragment (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    code            VARCHAR(250) NOT NULL,
    language        VARCHAR(250) NOT NULL,
    lines_count     INT,
    line_number     INT
);

INSERT INTO codeFragment (code, language, lines_count, line_number)
VALUES ('public String toString(){
        return value;
    }', 'java', 3, 15),
       (select first_name from employees where id= 1, select first_name from employees where id= 1, 3, 48);


CREATE TABLE topicComment
(
    id              INT AUTO_INCREMENT PRIMARY KEY,

    nTopic          INT,
    comment_user    VARCHAR(250) NOT NULL,
    comment_content VARCHAR(250) NOT NULL,
    comment_date    VARCHAR(250) NOT NULL
);

INSERT INTO topicComment (nTopic, comment_user, comment_content, comment_date)
VALUES (1, 'Atlas Corrigan', 'Il faut améliorer et mettre des ...', '18.02.2012'),
       (1, 'Ryle Kincaid', 'Pas mal le code','12.12.2012'),
       (2, 'Mike Ross', 'On y est presque', '20.05.2011'),
       (2, 'Louis Litt', 'Ouf, cest totalement faux', '21.03.2024')
;


CREATE TABLE topicFile
(
    id              INT AUTO_INCREMENT PRIMARY KEY,

    nTopic          INT,
    file_title      VARCHAR(250) NOT NULL,
    file_type       VARCHAR(250) NOT NULL,
    file_content    VARCHAR(250) NOT NULL,
    file_date       VARCHAR(250) NOT NULL
);

INSERT INTO topicFile (nTopic, file_title, file_type, file_content, file_date)
VALUES (1,'helloWorld', 'js', 'if (blabla=blabla)' ||
                              '{//do something}', '13.02.09'),
       (2,'helloWorld', 'js', 'if (blabla=blabla)' ||
                              '{//do something}', '13.02.09'),
       (2,'hey', 'html', 'if (blabla=blabla)' ||
                              '{//do something}', '13.02.09')
;


CREATE TABLE topicDisplay
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    title           VARCHAR(250) NOT NULL,
    username        VARCHAR(250) NOT NULL,
    date_post       VARCHAR(250) NOT NULL,
    description     VARCHAR(250) NOT NULL

    /**
    file_title      VARCHAR(250),
    file_type       VARCHAR(250),
    file_content    VARCHAR(250),
    file_date       VARCHAR(250),

    comment_user    VARCHAR(250),
    comment_content VARCHAR(250),
    comment_date    VARCHAR(250)

     */
);

INSERT INTO topicDisplay (title, username, date_post, description
                          /**file_title, file_type, file_content, file_date,
                          comment_user, comment_content, comment_date**/)
VALUES
    ('Essai1','Lily Bloom','23.02.24','Ca va etre long'
        /**,
        select file_title from topicFile where id= 1,
        select file_type from topicFile where id= 1,
        select file_content from topicFile where id= 1,
        select file_date from topicFile where id= 1,
        select comment_user from topicComment where id= 1,
        select comment_content from topicComment where id= 1,
        select comment_date from topicComment where id= 1**/),
    ('Topic 2', 'Harvey Specter', '17.11.2003', 'jsp'
        /** ,
        select file_title from topicFile where id=2,
        select file_type from topicFile where id=2,
        select file_content from topicFile where id=2,
        select file_date from topicFile where id=2,
        select comment_user from topicComment where id=2,
        select comment_content from topicComment where id=2,
        select comment_date from topicComment where id=2
          **/
)
;





