package org.example.config;

import org.example.entity.KartBankiDetails;
import org.example.entity.Loan;
import org.example.entity.Student;
import org.example.entity.University;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryInstance {
    public static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Student.class)
                    .addAnnotatedClass(KartBankiDetails.class)
                    .addAnnotatedClass(Loan.class)
                    .addAnnotatedClass(University.class)
                    .buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);

        }

    }
}
