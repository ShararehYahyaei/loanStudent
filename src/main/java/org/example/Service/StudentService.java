package org.example.Service;

import org.example.Repository.StudentRepository;
import org.example.config.SessionFactoryInstance;
import org.example.entity.Student;

import java.util.Set;

public class StudentService {
    static final StudentRepository stdRepo = new StudentRepository();

    public Student signUp(Student student) {
        try (var session = SessionFactoryInstance.sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                stdRepo.saveStudent(session, student);
                return student;
            } catch (Exception e) {
                session.getTransaction().rollback();
                throw new RuntimeException(e);
            }
        }
    }

}
