package org.evpro.bookshopV4.DAO;

import org.evpro.bookshopV4.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    void save(User user);
    Optional<User> findById(int id);
    Optional<User> findByEmail(String email);
    List<User> findByRole(User.UserRole role);
    List<User> findAll();
    void deleteById(int id);
    void deleteAll();
}
