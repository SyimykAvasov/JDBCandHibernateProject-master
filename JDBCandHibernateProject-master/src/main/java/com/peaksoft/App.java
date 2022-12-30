package com.peaksoft;


import com.peaksoft.dao.UserDaoJdbcImpl;
import com.peaksoft.util.Util;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
//        userDaoJdbc.createUsersTable();
//        userDaoJdbc.dropUsersTable();
//       userDaoJdbc.createUsersTable();
      //  userDaoJdbc.saveUser("Askar","Akayev",(byte)80);
//        userDaoJdbc.removeUserById(4);
//        System.out.println(userDaoJdbc.getAllUsers());
        userDaoJdbc.cleanUsersTable();
        System.out.println(userDaoJdbc.getAllUsers());

    }
}
