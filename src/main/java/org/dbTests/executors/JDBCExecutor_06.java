package org.dbTests.executors;

import org.constants.keys.Keys;
import org.dbTests.CustomerDAO;
import org.dbTests.DatabaseConnectionManager;
import org.dbTests.OrderDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor_06 {

    public static void main(String[] args) {

        Keys keys = new Keys();                                             //   Keeps my keys secure
        String password = keys.jdbcPassword();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "postgres", "postgres", password);

        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);        //   Used for customer
            // finding customers with a limit
            customerDAO.findAllSorted(20).forEach(System.out::println);


        } catch (SQLException e) {e.printStackTrace();
        }
    }
}
