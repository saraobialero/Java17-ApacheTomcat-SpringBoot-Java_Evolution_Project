package org.evpro.bookshopV4.service.functionality;

import org.evpro.bookshopV4.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserFunctions {
    //  Administration functionality
    boolean addUserAdmin(User user) throws SQLException;
    boolean deleteUser(int id) throws SQLException;
    User getUserById(int id) throws SQLException;
    User getUserByEmail(String email) throws SQLException;
    List<User> getAllUsers() throws SQLException;

    //  User basic functionality
    void updateUserInfo(int id, String name, String surname) throws SQLException;
    void changeUserRole(int id, User.UserRole userRole) throws SQLException;
    void changePassword(int id, String email, String password) throws SQLException;
    void changeEmail(int id, String email, String password) throws SQLException;

}
