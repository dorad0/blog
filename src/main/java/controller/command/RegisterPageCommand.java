package controller.command;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 06.11.2014.
 */
public class RegisterPageCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        return "/jsp/register.jsp";
    }
}
