package pp231.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pp231.models.User;

import pp231.DAO.UserDAO;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDAO userDao;
    @Autowired
    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }
    @Transactional
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
