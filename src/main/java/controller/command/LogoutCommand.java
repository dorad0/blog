package controller.command;


import controller.manager.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 31.10.2014.
 */
public class LogoutCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.login");
// уничтожение сессии
        request.getSession().invalidate();
        return page;
    }
}
