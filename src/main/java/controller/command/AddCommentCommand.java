package controller.command;

import controller.manager.ConfigurationManager;
import dao.Factory;
import dao.entity.Article;
import dao.entity.Comment;
import dao.entity.User;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by user on 12.11.2014.
 */
public class AddCommentCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        Article article = null;
        User user;

// извлечение из запроса логина и пароля
        String userName = request.getParameter("userName");
        String articleId = request.getParameter("articleId");
        String commentData = request.getParameter("commentData");

        article = Factory.getInstance().getArticleDAO().getArticleById(Long.parseLong(articleId));
        user = Factory.getInstance().getUserDAO().getUser(userName);

    if(!commentData.isEmpty()) {
        Factory.getInstance().getCommentDAO().addComment(new Comment(new Date(), user, article, commentData));
        request.setAttribute("userName", userName);
        request.getServletContext().setAttribute("userName", userName);
        page = ConfigurationManager.getProperty("path.page.articles");
    } else {
        request.setAttribute("errorCommentDataMessage","Enter comment"
                /*MessageManager.getProperty("message.loginerror")*/);
        request.getServletContext().setAttribute("userName", userName);
        page = ConfigurationManager.getProperty("path.page.articles");
    }

        return page;
    }
}
