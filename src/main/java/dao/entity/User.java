package dao.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



import javax.persistence.*;
import java.util.Set;



/**
 * Created by user on 28.09.2014.
 */
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "ROLE", nullable = false)
    private String userRole;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    @Cascade({CascadeType.ALL})
    private Set<Comment> comments;

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    @JoinColumn(name = "ARTICLE_ID")
    private Set<Article> articles;

    public User() {
    }

    public User(String name, String password, String userRole) {
        this.name = name;
        this.password = password;
        this.userRole = userRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", userRole='" + userRole + '\'' +
                ", comments=" + comments +
                ", articles=" + articles +
                '}';
    }
}
