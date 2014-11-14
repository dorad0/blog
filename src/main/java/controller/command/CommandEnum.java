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
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    },
    DELETEUSER {
        {
            this.command = new DeleteUserCommand();
        }
    },
    DELETEARTICLE {
        {
            this.command = new DeleteArticleCommand();
        }
    },
    REGISTER {
        {
            this.command = new RegisterCommand();
        }
    },
    REGISTERPAGE {
        {
            this.command = new RegisterPageCommand();
        }
    },
    ADDCOMMENT {
        {
            this.command = new AddCommentCommand();
        }

    },
    ADDARTICLE {
        {
            this.command = new AddArticleCommand();
        }
    },
    SAVEARTICLE {
        {
            this.command = new SaveArticleCommand();
        }
    };

    ActionCommand command;
    public ActionCommand getCurrentCommand() {
        return command;
    }
}
