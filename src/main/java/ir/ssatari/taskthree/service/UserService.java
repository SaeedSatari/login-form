package ir.ssatari.taskthree.service;

import ir.ssatari.taskthree.dal.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}