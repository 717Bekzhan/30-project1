package com.company.Dao;

import com.company.Model.User;

import java.util.ArrayList;

public class UserDao {
  private   ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
