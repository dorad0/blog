package controller.command;

import controller.manager.ConfigurationManager;
import controller.manager.MessageManager;
import logic.LoginLogic;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 03.11.2014.
 */
public class LoginCommand implements ActionCommand {


    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
// извлечение из запроса логина и пароля
        String login = request.getParameter("login");
        String pass = request.getParameter("password");
// проверка логина и пароля
        if (LoginLogic.checkLogin(login, pass)) {
            if (LoginLogic.checkAdminStatus(login)) {
                page = "/jsp/admin.jsp";
            } else {
                request.setAttribute("userName", login);
                //   request.setAttribute("lst", new ArticleDAOImpl().getArticles());
// определение пути к main.jsp
//            page = ConfigurationManager.getProperty("path.page.main");
                page = ConfigurationManager.getProperty("path.page.articles");
            }
        } else {
            request.setAttribute("errorLoginPassMessage",
                    MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("path.page.login");
        }
        return page;
    }
}

