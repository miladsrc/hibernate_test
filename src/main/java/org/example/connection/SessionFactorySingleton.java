package org.example.connection;

import org.example.model.Film;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class SessionFactorySingleton {
    private SessionFactorySingleton() {
    }

    private static class LazyHolder {
        static SessionFactory INSTANCE;

        static {
            var registry = new StandardServiceRegistryBuilder ()
                    .configure ()
                    .build ();
            INSTANCE = new MetadataSources ( registry )
                    .addAnnotatedClass ( Film.class )
                    .buildMetadata ()
                    .buildSessionFactory ();
        }
    }

    public static SessionFactory getInstance() {
        return LazyHolder.INSTANCE;
    }
}