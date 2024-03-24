package com.tasks.solid.task6;

/**
 * Let's imagine that we have a service that contains the following logic.
 * Is similar implementation is the best way for such logic? Do you have any suggestions regarding improvements?
 *
 * @author p.serhiienko
 */
public class UserService {
    public void registerUser(User user) {
        // validate user information
        // save user information to database
        // send welcome email to user
    }

    public void deleteUser(User user) {
        // delete user information from database
        // send goodbye email to user
    }

    public void updateUser(User user) {
        // validate updated user information
        // update user information in database
    }
}
/*               Violations
 * Dependency inversion principle
 * Single responsibility principle
 *           Are Possible improvements
 * Reducing actions in this class
 * Create interface for UserService class
 */
