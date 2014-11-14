package dao;


import dao.entity.Article;
import dao.entity.User;

import java.util.List;

/**
 * Created by user on 31.10.2014.
 */
public interface ArticleDAO {
    public void addArticle(Article article);
    public Article getArticle(String title);
    public void deleteArticle(Article article);
    public Article getArticleById(Long id);
    public List<Article> getArticles();
}
