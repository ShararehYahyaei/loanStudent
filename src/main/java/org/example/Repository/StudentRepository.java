package org.example.Repository;

import org.example.entity.Student;
import org.hibernate.Session;

import java.util.List;

public class StudentRepository {

    public void saveStudent(Session session, Student student){
        session.persist(student);
    }

    public Student findById(Session session, Long id) {

        return (Student) session.get(Student.class, id);
    }

    public List <Student>getAllStudents(Session session) {
        return session.createQuery("from Student",Student.class).list();
    }
}
