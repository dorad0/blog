package controller;

import controller.command.ActionCommand;
import controller.factory.ActionFactory;
import controller.manager.ConfigurationManager;
import controller.manager.MessageManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 03.11.2014.
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = null;
// определение команды, пришедшей из JSP
        ActionFactory client = new ActionFactory();
        ActionCommand command = client.defineCommand(req);
/*
* вызов реализованного метода execute() и передача параметров
* классу-обработчику конкретной команды
*/
        page = command.execute(req);
// метод возвращает страницу ответа
// page= null; // поэксперементировать!
        if (page != null) {
            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(page);
// вызов страницы ответа на запрос
            dispatcher.forward(req, resp);
        } else {
            req.getRequestDispatcher(page).forward(req, resp);
//установка страницы c cообщением об ошибке
            page = ConfigurationManager.getProperty("path.page.index");
            req.getSession().setAttribute("nullPage",
                    MessageManager.getProperty("message.nullpage"));
            resp.sendRedirect(req.getContextPath() + page);
        }
    }
}
