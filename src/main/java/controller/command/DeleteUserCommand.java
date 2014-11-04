package controller.command;

import controller.manager.ConfigurationManager;
import controller.manager.MessageManager;
import dao.Factory;
import dao.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 04.11.2014.
 */
public class DeleteUserCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        User user = null;
        String userName = request.getParameter("userName");

        if (userName != null) {
            user = Factory.getInstance().getUserDAO().getUser(userName);

            if (user != null) {
                Factory.getInstance().getUserDAO().deleteUser(user);
                page = ConfigurationManager.getProperty("path.page.admin");
                request.setAttribute("deleteStatus", "Deleted!");
            } else {
                request.setAttribute("errorDeleteUserMessage",
                        MessageManager.getProperty("message.deleteusererror"));
                page = ConfigurationManager.getProperty("path.page.admin");
            }

        } else {
            request.setAttribute("errorDeleteUserMessage",
                    MessageManager.getProperty("message.deleteusererror"));
            page = ConfigurationManager.getProperty("path.page.admin");
        }
        return page;
    }
}
