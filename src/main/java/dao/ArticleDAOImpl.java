package dao;


import dao.entity.Article;
import dao.entity.User;
import dao.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

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
    public Article getArticle(String title) {
        Article article = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        article = (Article) session.createSQLQuery("SELECT * FROM article  WHERE title = " +"'" +title +"'").addEntity(Article.class).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return article;
    }

    @Override
    public Article getArticleById(Long id) {
        Article article = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        article = (Article) session.get(Article.class, id);
        session.getTransaction().commit();
        session.close();
        return article;
    }

    @Override
    public void deleteArticle(Article article) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(article);
        session.getTransaction().commit();
        session.close();
    }


    @Override
    public List<Article> getArticles() {
        List<Article> articles = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        articles = session.createSQLQuery("SELECT * FROM ARTICLE").addEntity(Article.class).list();
        session.getTransaction().commit();
        session.close();
        return articles;
    }
}
