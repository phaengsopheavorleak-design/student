CREATE DATABASE testdb2;
CREATE TABLE students(
        name varchar,
        gender varchar(7),
        age INT
);
INSERT INTO students (name, gender, age) VALUES
                                             ('leak', 'female', 19),
                                             ('Jane', 'female', 22);