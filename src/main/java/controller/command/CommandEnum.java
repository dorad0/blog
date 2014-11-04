package controller.command;

/**
 * Created by user on 31.10.2014.
 */
public enum CommandEnum {
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    MAINPAGE {
        {
            this.command = new MainPageCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    },
    DELETEUSER {
        {
            this.command = new DeleteUserCommand();
        }
    };
    ActionCommand command;
    public ActionCommand getCurrentCommand() {
        return command;
    }
}
