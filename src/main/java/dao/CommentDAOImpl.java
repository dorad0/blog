package dao;

import dao.entity.Article;
import dao.entity.Comment;
import dao.entity.User;
import dao.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by user on 04.11.2014.
 */
public class CommentDAOImpl implements CommentDAO {
    @Override
    public void addComment(Date publicationDate, User user, Article article, String commentData) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(new Comment(publicationDate, user, article, commentData));
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void addComment(Comment comment) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(comment);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteComment(Comment comment) {

    }

    @Override
    public Comment getCommentById(Long id) {
        return null;
    }
}
