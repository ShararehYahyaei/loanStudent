package org.example.Repository;

import org.example.entity.Student;
import org.hibernate.Session;

public class StudentRepository {

    public void saveStudent(Session session, Student student){
        session.persist(student);
    }
}
