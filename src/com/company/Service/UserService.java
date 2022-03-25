package com.company.Service;

import com.company.Dao.UserDao;
import com.company.Model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    void addUser( User user);

    void findWithID( int ID) throws Exception;
    void removeUser(int ID);

     void getAllUsers();
}
