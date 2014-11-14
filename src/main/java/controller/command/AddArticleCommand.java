package controller.command;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 13.11.2014.
 */
public class AddArticleCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = "/jsp/addArticle.jsp";
        String userName = request.getParameter("userName");
        request.setAttribute("userName", userName);
        return page;
    }
}
