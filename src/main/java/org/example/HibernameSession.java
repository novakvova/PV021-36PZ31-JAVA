package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernameSession {
    private static SessionFactory sessionFactory;

    private HibernameSession() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                configuration.addAnnotatedClass(Category.class);
                configuration.addAnnotatedClass(Product.class);
                configuration.addAnnotatedClass(RoleEntity.class);
                configuration.addAnnotatedClass(UserEntity.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Exception!" + e);
            }
        }
        return sessionFactory;
    }
}
