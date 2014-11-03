package controller.command;

import controller.command.ActionCommand;
import controller.manager.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 31.10.2014.
 */
public class EmptyCommand implements ActionCommand {
    public String execute(HttpServletRequest request) {
/* в случае ошибки или прямого обращения к контроллеру
* переадресация на страницу ввода логина */
//       request.setAttribute("lst", Factory.getInstance().getArticleDAO().getArticles());

        String page = ConfigurationManager.getProperty("path.page.login");
        return page;
    }
}
