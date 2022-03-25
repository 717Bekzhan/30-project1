package com.company.Service.Ipml;

import com.company.Dao.UserDao;
import com.company.Model.User;
import com.company.Service.UserService;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class UserServiceIpml implements UserService {
    UserDao userDao = new UserDao();

    public UserServiceIpml() {
    }

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public void findWithID(int ID) throws RuntimeException {
        Optional<User> user = userDao.getUsers().stream().filter(x -> x.getID() == ID).findAny();
        try {
            if (user.isEmpty()) {
                System.out.println("Don't have such  ID");
            } else {
                System.out.println(user);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void removeUser(int ID) {
        userDao.getUsers().removeIf(x -> x.getID() == ID);
    }

    @Override
    public void getAllUsers() {
        for (User u : userDao.getUsers()) {
            System.out.println(u);
        }

    }
}
