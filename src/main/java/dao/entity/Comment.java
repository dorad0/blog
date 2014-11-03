package dao.entity;

import javax.persistence.*;
import java.util.Date;

/**
* Created by user on 29.09.2014.
*/
@Entity
@Table(name = "COMMENT")
public class Comment {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "PUBLICATIONDATE", nullable = false)
    private Date publicationDate;

    @ManyToOne
    private User user;

    @ManyToOne
    private Article article;

    @Column(name = "COMMENTDATA", nullable = false)
    private String commentData;

    public Comment() {
    }

    public Comment(Date publicationDate, User user, Article article, String commentData) {
        this.publicationDate = publicationDate;
        this.user = user;
        this.article = article;
        this.commentData = commentData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getCommentData() {
        return commentData;
    }

    public void setCommentData(String commentData) {
        this.commentData = commentData;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", publicationDate=" + publicationDate +
                ", user=" + user +
                ", article=" + article +
                ", commentData='" + commentData + '\'' +
                '}';
    }
}

