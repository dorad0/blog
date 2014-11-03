package dao.entity;
import javax.persistence.*;

/**
 * Created by user on 28.09.2014.
 */
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "ROLE",nullable = false)
    private String userRole;

    public User() {

    }

    public User(String name, String password, String userRole) {
        this.name = name;
        this.password = password;
        this.userRole = userRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String isAdminType() {
        return userRole;
    }

    public void setAdminType(String adminType) {
        this.userRole = adminType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", adminType=" + userRole +
                '}';
    }
}
