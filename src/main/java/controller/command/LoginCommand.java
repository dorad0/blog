package controller.command;

import controller.manager.ConfigurationManager;
import controller.manager.MessageManager;
import dao.ArticleDAOImpl;
import logic.LoginLogic;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 03.11.2014.
 */
public class LoginCommand implements ActionCommand {
    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
// извлечение из запроса логина и пароля
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);
// проверка логина и пароля
        if (LoginLogic.checkLogin(login, pass)) {
            request.setAttribute("user", login);
         //   request.setAttribute("lst", new ArticleDAOImpl().getArticles());
// определение пути к main.jsp
//            page = ConfigurationManager.getProperty("path.page.main");
            page = ConfigurationManager.getProperty("path.page.admin");
        } else {
            request.setAttribute("errorLoginPassMessage",
                    MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("path.page.login");
        }
        return page;
    }
}

