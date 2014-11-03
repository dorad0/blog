package dao;


import dao.entity.Article;
import dao.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by user on 31.10.2014.
 */
public class ArticleDAOImpl implements ArticleDAO {
    @Override
    public void addArticle(Article article) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(article);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removeArticle() {

    }

    @Override
    public List<Article> getArticles() {
        List<Article> articles = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        articles = session.createCriteria(Article.class).list();
        session.getTransaction().commit();
        session.close();
        return articles;
    }
}
