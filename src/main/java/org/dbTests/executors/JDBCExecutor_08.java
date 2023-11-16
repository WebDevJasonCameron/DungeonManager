package org.dbTests.executors;

import org.constants.keys.Keys;
import org.dbTests.CustomerDAO;
import org.dbTests.DatabaseConnectionManager;
import org.dbTests.OrderDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor_08 {

    public static void main(String[] args) {

        Keys keys = new Keys();                                             //   Keeps my keys secure
        String password = keys.jdbcPassword();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "postgres", "postgres", password);

        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);        //   Used for customers
            OrderDAO orderDAO = new OrderDAO(connection);                 //   Used for orders
            System.out.println("Paged");
            for (int i = 0; i < 3; i++) {
                System.out.println("Page number: " + i);
                customerDAO.findAllPaged(10, i).forEach(System.out::println);
                
            }



        } catch (SQLException e) {e.printStackTrace();
        }
    }
}
