package logic;

import dao.Factory;
import dao.entity.User;

/**
 * Created by user on 31.10.2014.
 */
public class LoginLogic {
//    private final static String ADMIN_LOGIN= "admin";
//    private final static String ADMIN_PASS= "Qwe123";
    public static boolean checkLogin(String enterLogin, String enterPass) /*throws Exception */{
        User user = Factory.getInstance().getUserDAO().getUser(enterLogin);
        boolean check = false;
        if (user != null) {
            return user.getName().equals(enterLogin) && user.getPassword().equals(enterPass);
        }
        else
            //throw new Exception("No user found!");
        return check;
//        return ADMIN_LOGIN.equals(enterLogin) &&
//                ADMIN_PASS.equals(enterPass);
    }
}
