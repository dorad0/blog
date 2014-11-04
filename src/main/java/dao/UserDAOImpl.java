package dao;


import dao.entity.User;
import dao.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

/**
 * Created by user on 31.10.2014.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public User getUser(String name) {
        User user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        user = (User) session.createCriteria(User.class).add(Expression.like("name", name)).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return user;
    }
}
