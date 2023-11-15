package org.dbTests.executors;

import org.constants.keys.Keys;
import org.dbTests.CustomerDAO;
import org.dbTests.DatabaseConnectionManager;
import org.dbTests.Order;
import org.dbTests.OrderDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor_05 {

    public static void main(String[] args) {

        Keys keys = new Keys();                                             //   Keeps my keys secure
        String password = keys.jdbcPassword();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "postgres", "postgres", password);

        try{
            Connection connection = dcm.getConnection();
            OrderDAO orderDAO = new OrderDAO(connection);                 //   Used for orders

            // Reading complex order search with joins
            Order order = orderDAO.findById(1000);
            System.out.println(order);

        } catch (SQLException e) {e.printStackTrace();
        }
    }
}
