package dao;


import dao.entity.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31.10.2014.
 */
public class Main {
    //    public static void main(String[] args) {
//        User user = Factory.getInstance().getUserDAO().getUser("Karp");
//        Article article = Factory.getInstance().getArticleDAO().getArticleById(4L);
////        Comment comment = new Comment(new Date(), user, article,"Data comment 3");
////        Factory.getInstance().getCommentDAO().addComment(comment);
////        Factory.getInstance().getUserDAO().deleteUser(user);
//     //    Factory.getInstance().getArticleDAO().addArticle(new Article(user, "title 2","data article 2", new Date()));
//       // System.out.println(user.getName());
////        List<Article> articles = Factory.getInstance().getArticleDAO().getArticles();
////        for (Article article : articles) {
////            System.out.println(article.getTitle());
////        }
////
//        Set<Comment> comments = article.getComments();
//        for (Comment comment : comments) {
//            System.out.println(comment.getCommentData());
//            System.out.println(comment.getUser().getName());
//        }
//    }
    public static void main(String[] args) {

//        List<Article> list = Factory.getInstance().getArticleDAO().getArticles();
//        for (Article article : list) {
//            System.out.println(article.getTitle());
//        }

           Article article = Factory.getInstance().getArticleDAO().getArticle("fdgdfg");
        System.out.println(article.getTitle());


    }
}