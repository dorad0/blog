package dao;


import dao.entity.Article;
import dao.entity.Comment;
import dao.entity.User;

import java.util.Date;

/**
 * Created by user on 31.10.2014.
 */
public interface CommentDAO {
    public void addComment(Date publicationDate, User user, Article article, String commentData);
    public void addComment(Comment comment);
    public void deleteComment(Comment comment);

    public Comment getCommentById(Long id);
}
