package logic;

import dao.Factory;
import dao.entity.User;

/**
 * Created by user on 05.11.2014.
 */
public class RegisterLogic {
    public static boolean checkName(String userName) {
        User user = Factory.getInstance().getUserDAO().getUser(userName);
        if (user != null)
            return true;
        return false;
    }

}
