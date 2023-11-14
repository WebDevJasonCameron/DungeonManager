package org.dbTests;

import org.constants.keys.Keys;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCExecutor {

    public static void main(String[] args) {

        Keys keys = new Keys();                                             //   Keeps my keys secure
        String password = keys.jdbcPassword();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "postgres", "postgres", password);

        try{
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);        //   Used for customers
            OrderDAO orderDAO = new OrderDAO(connection);                 //   Used for orders

            List<Order> orders = orderDAO.getOrdersForCustomer(789);
            orders.forEach(System.out::println);



            // Reading complex order search with joins
            /**
            Order order = orderDAO.findById(1000);
            System.out.println(order);
            */

            // Delete a customer from db
            /**
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
`           */

            // Update a customer entry in db
            /**
            Customer customer = customerDAO.findById(10000);
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());
            customer.setEmail("cSmash@gmail.com");
            customer = customerDAO.update(customer);
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());
            */


            // Read a customer entry from the db
            /**
            Customer customer = customerDAO.findById(1000);
            System.out.println(customer.getFirstName() + " " + customer.getLastName());
            */


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
