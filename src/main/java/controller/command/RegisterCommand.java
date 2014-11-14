package controller.command;

import controller.manager.ConfigurationManager;
import dao.Factory;
import dao.entity.User;
import logic.RegisterLogic;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 05.11.2014.
 */
public class RegisterCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        String userName = null;
        String password = null;
        String page = null;

        userName = request.getParameter("userName");
        password = request.getParameter("password");

        if (!userName.isEmpty() && !password.isEmpty()) {
            if (!RegisterLogic.checkName(userName)) {
                request.setAttribute("userName", userName);
                User user = new User(userName, password, "user");
                Factory.getInstance().getUserDAO().addUser(user);
                page = ConfigurationManager.getProperty("path.page.articles");
            } else {
                request.setAttribute("errorRegisterMessage",
                        "Choose another name.");
//                page = ConfigurationManager.getProperty("path.page.login");
                page = "/jsp/register.jsp";
            }
        } else {
            page = "/jsp/register.jsp";
            request.setAttribute("errorRegisterMessage",
                    "Enter name and password");
        }
        return page;
    }
}
