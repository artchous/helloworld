DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS codeFragment;
DROP TABLE IF EXISTS topicDisplay;
DROP TABLE IF EXISTS topicComment;
DROP TABLE IF EXISTS topicFile;

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


CREATE TABLE topicDisplay
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    title           VARCHAR(250) NOT NULL,
    username        VARCHAR(250) NOT NULL,
    date_post       VARCHAR(250) NOT NULL,
    description     VARCHAR(250) NOT NULL,

    file_title      VARCHAR(250),
    file_type       VARCHAR(250),
    file_content    VARCHAR(250),
    file_date       VARCHAR(250),

    comment_user    VARCHAR(250),
    comment_content VARCHAR(250),
    comment_date    VARCHAR(250)
);

INSERT INTO topicDisplay (title, username, date_post, description,
                          file_title, file_type, file_content, file_date,
                          comment_user, comment_content, comment_date)
VALUES ('Essai1','Artc','23.02.24','Ca va etre long', null, null,null,null,null,null,null);

CREATE TABLE topicComment
(
    id              INT,

    comment_user    VARCHAR(250) NOT NULL,
    comment_content VARCHAR(250) NOT NULL,
    comment_date    VARCHAR(250) NOT NULL
);

CREATE TABLE topicFile
(
    id              INT,

    file_title      VARCHAR(250) NOT NULL,
    file_type       VARCHAR(250) NOT NULL,
    file_content    VARCHAR(250) NOT NULL,
    file_date       VARCHAR(250) NOT NULL
);
 




