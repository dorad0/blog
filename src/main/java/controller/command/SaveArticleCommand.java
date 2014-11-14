package controller.command;

import dao.Factory;
import dao.entity.Article;
import dao.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by user on 13.11.2014.
 */
public class SaveArticleCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = "/jsp/articles.jsp";
        String userName = request.getParameter("userName");
        String title = request.getParameter("title");
        String articleData = request.getParameter("articleData");

        User user = Factory.getInstance().getUserDAO().getUser(userName);
        Article article = new Article(user, title, articleData, new Date());
        Factory.getInstance().getArticleDAO().addArticle(article);

        request.setAttribute("userName", userName);
        return page;
    }
}
