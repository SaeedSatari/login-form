package ir.ssatari.login.service;

import ir.ssatari.login.dal.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}