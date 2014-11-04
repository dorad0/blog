package dao;


import dao.entity.User;

/**
 * Created by user on 31.10.2014.
 */
public interface UserDAO {
    public void addUser(User user);
    public void deleteUser(User user);
    public User getUser(String name);
}
