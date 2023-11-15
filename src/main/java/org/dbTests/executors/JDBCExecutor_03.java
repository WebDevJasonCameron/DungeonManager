package org.dbTests.executors;

import org.constants.keys.Keys;
import org.dbTests.Customer;
import org.dbTests.CustomerDAO;
import org.dbTests.DatabaseConnectionManager;
import org.dbTests.OrderDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor_03 {

    public static void main(String[] args) {

        Keys keys = new Keys();                                             //   Keeps my keys secure
        String password = keys.jdbcPassword();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "postgres", "postgres", password);

        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);        //   Used for customers

            // Update a customer entry in db
            Customer customer = customerDAO.findById(10000);
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());
            customer.setEmail("cSmash@gmail.com");
            customer = customerDAO.update(customer);
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());


        } catch (SQLException e) {e.printStackTrace();
        }
    }
}
