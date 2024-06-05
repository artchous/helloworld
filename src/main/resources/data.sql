DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS codeFragment;


CREATE TABLE employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);

CREATE TABLE codeFragment (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    code            VARCHAR(250) NOT NULL,
    language        VARCHAR(250) NOT NULL,
    lines_count     INT,
    line_number     INT
);

 
INSERT INTO employees (first_name, last_name, mail, password) VALUES
  ('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent'),
  ('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie'),
  ('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe');

INSERT INTO codeFragment (code, language, lines_count, line_number) VALUES
  ('public String toString(){
        return value;
    }','java', 3, 15),
  ('public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }', 'java', 3, 48
  );


