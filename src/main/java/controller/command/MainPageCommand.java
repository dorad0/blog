package controller.command;

import controller.manager.ConfigurationManager;
import dao.ArticleDAOImpl;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 31.10.2014.
 */
public class MainPageCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("lst", new ArticleDAOImpl().getArticles());
        String page = ConfigurationManager.getProperty("path.page.articles");
// уничтожение сессии
        return page;
    }
}
