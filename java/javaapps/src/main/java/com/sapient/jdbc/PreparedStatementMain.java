package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementMain {

    public static void main(String[] args) {
        updateRow();
    }

    private static void updateRow() {
        Connection connection = null;
        PreparedStatement updateStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is ready!");
            String connectionString = "jdbc:mysql://localhost/users?" +
                    "user=root&password=root";
            connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection is Success");
            //ExecuteQuery
            String updateQuery = "UPDATE myuser SET city=? WHERE id=?".trim();
            updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setString(1, "Pune");
           updateStatement.setInt(2, 1);
            int noofRowsAffected = updateStatement.executeUpdate();
            if (noofRowsAffected > 0) {
                System.out.println("Users updated");
            } else {
                System.out.println("Users not update");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException sqlException) {
            //System.out.println(sqlException.getMessage());
            sqlException.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
