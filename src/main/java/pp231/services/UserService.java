package pp231.services;

import pp231.models.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void updateUser(User user);
    void removeUserById(long id);
    User getUserById(long id);
    List<User> getAllUsers();
}
