package dao.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * Created by user on 29.09.2014.
 */
@Entity
@Table(name = "ARTICLE")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ARTICLE_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name ="USER_ID")
//    @Cascade({CascadeType.DELETE})
    private User user;

    @Column(name = "TITLE", unique = true, nullable = false)
    private String title;

    @Column(name = "DATA")
    private String data;

    @Column(name = "PUBLICATIONDATE")
    private Date publicationDate;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "ARTICLE_ID")
    @Cascade({CascadeType.ALL})
    private Set<Comment> comments;

    public Article() {
    }

    public Article(User user, String title, String data, Date publicationDate) {
        this.user = user;
        this.title = title;
        this.data = data;
        this.publicationDate = publicationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
