package org.tasks.solid.task2;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void update(User user) {
        User existingUser = findById(user.getId());
        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
        }
    }

    public void delete(int id) {
        User userToRemove = findById(id);
        if (userToRemove != null) {
            users.remove(userToRemove);
        }
    }

}
