


CREATE TABLE student (
                         id int,
                         name varchar(255),
                         rollNo numeric,
                         email varchar(255)
);

INSERT into student (id , name, rollNo,email) values (2, 'test1', 1, 'test1@gmail.com');

delete from student where id  = 1

update student set name = ? and rollNo = ? and email = ? where id = ?


select s.*, c.name as courseName
from student s inner join course c on c.id = s.faculty;


select c.name
from student s
    inner join course_student cs on s.id = cs.student_id
inner join course c on cs.course_id = c.id where s.id=980

;