package controller.command;

import controller.manager.ConfigurationManager;
import dao.Factory;
import dao.entity.Article;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 05.11.2014.
 */
public class DeleteArticleCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        Article article = null;
        String articleTitle = request.getParameter("articleTitle");

        if (articleTitle != null && !articleTitle.isEmpty()) {
            article = Factory.getInstance().getArticleDAO().getArticle(articleTitle);

            if (article != null) {
                Factory.getInstance().getArticleDAO().deleteArticle(article);
                page = ConfigurationManager.getProperty("path.page.admin");
                request.setAttribute("articleDeleteStatus", "Deleted!");
            } else {
                request.setAttribute("errorDeleteArticleMessage",
                        "No such title.");
                page = ConfigurationManager.getProperty("path.page.admin");
            }

        } else {
            request.setAttribute("errorDeleteArticleMessage",
                    "Enter title.");
            page = ConfigurationManager.getProperty("path.page.admin");
        }
        return page;
    }
}

