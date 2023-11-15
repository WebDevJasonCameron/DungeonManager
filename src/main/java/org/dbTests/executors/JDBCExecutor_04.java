package org.dbTests.executors;

import org.constants.keys.Keys;
import org.dbTests.Customer;
import org.dbTests.CustomerDAO;
import org.dbTests.DatabaseConnectionManager;
import org.dbTests.OrderDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor_04 {

    public static void main(String[] args) {

        Keys keys = new Keys();                                             //   Keeps my keys secure
        String password = keys.jdbcPassword();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "postgres", "postgres", password);

        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);        //   Used for customers

            // Delete a customer from db
            // First adding customer to db
            Customer customer = new Customer();
            customer.setFirstName("John");
            customer.setLastName("Adams");
            customer.setEmail("jadams@wh.com");
            customer.setPhone("(555) 555-9876");
            customer.setAddress("1234 Main st");
            customer.setCity("Arlington");
            customer.setState("VA");
            customer.setZipCode("12345");

            Customer dbCustomer = customerDAO.create(customer);
            dbCustomer = customerDAO.findById(dbCustomer.getId());
            System.out.println(dbCustomer);

            // Updating
            dbCustomer.setEmail("johnAdams@mail.gov");
            dbCustomer = customerDAO.update(dbCustomer);
            System.out.println(dbCustomer);

            // Deleting
            String deletedCustomerName = dbCustomer.getFirstName() + " " + dbCustomer.getLastName();
            customerDAO.delete(dbCustomer.getId());
            System.out.println("Deleted: " + deletedCustomerName);


        } catch (SQLException e) {e.printStackTrace();
        }
    }
}
