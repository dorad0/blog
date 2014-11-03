package logic;

/**
 * Created by user on 31.10.2014.
 */
public class LoginLogic {
    private final static String ADMIN_LOGIN= "admin";
    private final static String ADMIN_PASS= "Qwe123";
    public static boolean checkLogin(String enterLogin, String enterPass) {
        return ADMIN_LOGIN.equals(enterLogin) &&
                ADMIN_PASS.equals(enterPass);
    }
}
