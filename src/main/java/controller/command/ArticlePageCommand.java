package controller.command;

import dao.Factory;
import dao.entity.Article;
import dao.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by user on 06.11.2014.
 */
public class ArticlePageCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        String title;
        String data;
        String userName;

        title = request.getParameter("title");
        data = request.getParameter("data");
        userName = request.getParameter("userName");

        User user = Factory.getInstance().getUserDAO().getUser(userName);
        Factory.getInstance().getArticleDAO().addArticle(new Article(user, title, data, new Date()));

        return "/jsp/articles.jsp";
    }
}
