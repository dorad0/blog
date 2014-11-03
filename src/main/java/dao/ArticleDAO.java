package dao;


import dao.entity.Article;

import java.util.List;

/**
 * Created by user on 31.10.2014.
 */
public interface ArticleDAO {
    public void addArticle(Article article);
    public void removeArticle();
    public List<Article> getArticles();
}
