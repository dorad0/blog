package dao;

/**
 * Created by user on 31.10.2014.
 */
public class Factory {


    private static UserDAO userDAO = null;
    private static ArticleDAO articleDAO = null;
    private static CommentDAO commentDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null) {
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }

    public ArticleDAO getArticleDAO() {
        if (articleDAO == null) {
            articleDAO = new ArticleDAOImpl();
        }
        return articleDAO;
    }

    public CommentDAO getCommentDAO() {
        if (commentDAO == null) {
            commentDAO = new CommentDAOImpl();
        }
        return commentDAO;
    }
}
