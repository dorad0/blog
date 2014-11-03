package dao.entity;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by user on 29.09.2014.
 */
@Entity
@Table(name = "ARTICLE")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @Column(name = "TITLE", unique = true, nullable = false)
    private String title;

    @Column(name = "DATA")
    private String data;

    @Column(name = "PUBLICATIONDATE")
    private Date publicationDate;

//    @OneToMany
//    private List<Comment> comments;

    public Article(User user, String title, String data, Date publicationDate) {
        this.user = user;
        this.title = title;
        this.data = data;
        this.publicationDate = publicationDate;
//        this.comments = new ArrayList<>();
    }

    public Article() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public List<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<Comment> comments) {
//        this.comments = comments;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Article{" +
                "publicationDate=" + publicationDate +
                ", id=" + id +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", article='" + data + '\'' +
                '}';
    }
}
