package dao;


import dao.entity.Comment;

/**
 * Created by user on 31.10.2014.
 */
public interface CommentDAO {
    public void addComment();

    public void removeComment(Comment comment);
}
