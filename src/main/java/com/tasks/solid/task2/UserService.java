package com.tasks.solid.task2;


/**
 * Are there any violations in this code?
 * If yes - describe what is it that worth changing and which improvements are possible?
 *
 * @author p.serhiienko
 */
public class UserService {
    private UserDao userDao = new UserDao();

    public void createUser(User user) {
        userDao.save(user);
    }

    public User getUserById(int id) {
        return userDao.findById(id);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUser(int id) {
        userDao.delete(id);
    }
}

/*
 *                      Violations
 * Dependency inversion principle in UserService and UserDao
 *               Are Possible improvements
 *  Add interfaces that will contain our methods in UserService and UserDao
 */
