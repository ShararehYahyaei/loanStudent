package org.example.Service;

import org.example.Repository.StudentRepository;
import org.example.config.SessionFactoryInstance;
import org.example.entity.Student;
import org.example.validation.Validation;

import java.util.List;
import java.util.Set;

public class StudentService {
    private final static StudentRepository studentRepo = new StudentRepository();

    public Student saveStudent(Student student) {
        try (var session = SessionFactoryInstance.sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                Validation<Student> studentValidation = new Validation<>();
                Set<String> stdViolate = studentValidation.valid(student);
                if (!stdViolate.isEmpty()) {
                    stdViolate.forEach(System.out::println);
                    return null;
                }
                studentRepo.saveStudent(session, student);
                return student;
            } catch (Exception e) {
                session.getTransaction().rollback();
                throw new RuntimeException(e);
            }
        }
    }

    public Student findById(Long id) {
        try (var session = SessionFactoryInstance.sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                Student student = studentRepo.findById(session, id);
                session.getTransaction().commit();
                return student;
            } catch (Exception e) {
                session.getTransaction().rollback();
                throw new RuntimeException(e);
            }
        }
    }

    public List<Student> findAll() {
        try (var session = SessionFactoryInstance.sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                List<Student> students = studentRepo.getAllStudents(session);
                session.getTransaction().commit();
                return students;
            } catch (Exception e) {
                session.getTransaction().rollback();
                throw new RuntimeException(e);
            }
        }
    }





}
