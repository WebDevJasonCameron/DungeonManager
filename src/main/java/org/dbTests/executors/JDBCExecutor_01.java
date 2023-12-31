package org.dbTests.executors;

import org.constants.keys.Keys;
import org.dbTests.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCExecutor_01 {

    public static void main(String[] args) {

        Keys keys = new Keys();                                             //   Keeps my keys secure
        String password = keys.jdbcPassword();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "postgres", "postgres", password);

        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);        //   Used for customers

            // Used to create a new customer entry in the db
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



        } catch (SQLException e) {e.printStackTrace();
        }
    }
}
