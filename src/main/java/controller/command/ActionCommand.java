package controller.command;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by user on 31.10.2014.
 */
public interface ActionCommand {
    String execute(HttpServletRequest request);
}
