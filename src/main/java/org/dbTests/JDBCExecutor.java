package org.dbTests;

import org.constants.keys.Keys;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {

    public static void main(String[] args) {

        Keys keys = new Keys();
        String password = keys.jdbcPassword();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "postgres", "postgres", password);

        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);

            // Read a customer entry from the db
            Customer customer = customerDAO.findById(1000);
            System.out.println(customer.getFirstName() + " " + customer.getLastName());

            // Used to create a new customer entry in the db
            /**
            Customer customer = new Customer();

            customer.setFirstName("Capt");
            customer.setLastName("Smash");
            customer.setEmail("smash@gmail.com");
            customer.setPhone("(555) 555-1234");
            customer.setAddress("1234 Main st");
            customer.setCity("San Antonio");
            customer.setState("TX");
            customer.setZipCode("12345");

            customerDAO.create(customer);
            */



        } catch (SQLException e) {e.printStackTrace();
        }
    }
}
