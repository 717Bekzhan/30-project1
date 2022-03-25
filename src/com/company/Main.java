package com.company;

import com.company.Dao.UserDao;
import com.company.Enum.Gender;
import com.company.Model.User;
import com.company.Service.Ipml.UserServiceIpml;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        User user1 = new User(1, "Bekzhan", 19, Gender.MAN);
        User user2 = new User(2, "Akyl", 20, Gender.MAN);
        User user3 = new User(3, "Aizhan", 22, Gender.WOMAN);
        User user4 = new User(4, "Akyl", 99, Gender.MAN);


        UserServiceIpml userServiceIpml = new UserServiceIpml();
        userServiceIpml.addUser(user1);
        userServiceIpml.addUser(user2);
        userServiceIpml.addUser(user3);
        userServiceIpml.addUser(user4);

        userServiceIpml.findWithID(6);


        userServiceIpml.removeUser(2);

        userServiceIpml.getAllUsers();
    }
}
