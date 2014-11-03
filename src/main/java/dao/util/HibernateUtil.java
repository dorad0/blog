package dao.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by user on 31.10.2014.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
             sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
