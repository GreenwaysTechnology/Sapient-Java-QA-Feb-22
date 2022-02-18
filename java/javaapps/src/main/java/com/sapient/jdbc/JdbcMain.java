package com.sapient.jdbc;

import java.sql.*;

public class JdbcMain {
    public static void connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is ready!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void selectAllUsers() {
        Connection connection = null;
        Statement selectStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is ready!");
            String connectionString = "jdbc:mysql://localhost/users?" +
                    "user=root&password=root";
            connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection is Success");
            //ExecuteQuery
            selectStatement = connection.createStatement();
            String sqlQuery = "SELECT * FROM myuser";
            ResultSet resultSet = selectStatement.executeQuery(sqlQuery);
            //process the data
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") +
                        " " + resultSet.getString("name") + " " +
                        resultSet.getString("city"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertRow() {
        Connection connection = null;
        Statement insertStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is ready!");
            String connectionString = "jdbc:mysql://localhost/users?" +
                    "user=root&password=root";
            connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection is Success");
            //ExecuteQuery
            insertStatement = connection.createStatement();
            String insertQuery = "INSERT INTO myuser (id, name, city) VALUES (2, 'ram', 'Chennai')";
            int noofRowsAffected = insertStatement.executeUpdate(insertQuery);
            if (noofRowsAffected > 0) {
                System.out.println("Users inserted");

            } else {
                System.out.println("Users not inserted");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void updateRow() {
        Connection connection = null;
        Statement updateStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is ready!");
            String connectionString = "jdbc:mysql://localhost/users?" +
                    "user=root&password=root";
            connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection is Success");
            //ExecuteQuery
            updateStatement = connection.createStatement();
            String insertQuery = "UPDATE myuser SET city = 'Delhi' WHERE id = 2";
            int noofRowsAffected = updateStatement.executeUpdate(insertQuery);
            if (noofRowsAffected > 0) {
                System.out.println("Users updated");
                selectAllUsers();
            } else {
                System.out.println("Users not update");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        //connectDatabase();
        //selectAllUsers();
        // insertRow();
//        updateRow();
        deleteRow();
    }

    private static void deleteRow() {
        Connection connection = null;
        Statement deleteStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is ready!");
            String connectionString = "jdbc:mysql://localhost/users?" +
                    "user=root&password=root";
            connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection is Success");
            //ExecuteQuery
            deleteStatement = connection.createStatement();
            String deleteQuery = "DELETE FROM myuser WHERE id = 2";
            int noofRowsAffected = deleteStatement.executeUpdate(deleteQuery);
            if (noofRowsAffected > 0) {
                System.out.println("Users deleted");
                selectAllUsers();
            } else {
                System.out.println("Users not deleted");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
