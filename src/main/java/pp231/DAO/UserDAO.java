package pp231.DAO;

import pp231.models.User;

import java.util.List;


public interface UserDAO {
    void updateUser(User user);
    void removeUserById(long id);
    User getUserById(long id);
    List<User> getAllUsers();
    void addUser(User user);
}
