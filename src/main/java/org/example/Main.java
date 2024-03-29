package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Configuration configuration = new Configuration();
        configuration.configure();

        try(SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession()) {
            System.out.println("OK");
        };
    }
}