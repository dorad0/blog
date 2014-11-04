package dao;


import dao.entity.Article;
import dao.entity.User;
import logic.LoginLogic;

import java.util.List;

/**
 * Created by user on 31.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        User user = Factory.getInstance().getUserDAO().getUser("dfsdf");
    //    Factory.getInstance().getArticleDAO().addArticle(new Article(user, "title","data article", new Date()));
       // System.out.println(user.getName());
//        List<Article> articles = Factory.getInstance().getArticleDAO().getArticles();
//        for (Article article : articles) {
//            System.out.println(article.getTitle());
//        }
        System.out.println(LoginLogic.checkLogin("dfs3df", "123129"));
    }
}
