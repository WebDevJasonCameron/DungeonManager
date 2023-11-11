package org.services;

import org.constants.keys.Keys;

import javax.xml.crypto.Data;
import java.net.ConnectException;
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
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM CUSTOMER");

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException e) {e.printStackTrace();
        }
    }
}
