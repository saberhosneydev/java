package saberhosneydev.database;

import java.sql.*;

public class MySQL {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet rs = null;

    public MySQL() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/javadb?" +
                    "user=root&password=811402");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public void insert(String query) {
        try {
            statement = connection.createStatement();
            statement.execute(query);
            System.out.println("Data Inserted");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        clear();
    }

    public ResultSet selectWhere(String query){
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        ResultSet prs = rs;
        clear();
        return prs;

    }
    public void update(String query){
        try {
            statement = connection.createStatement();
            statement.execute(query);
            System.out.println("Updated");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        clear();
    }
    public void clear() {
        //Clearing the ResultSet
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException sqlEx) {
            } // ignore

            rs = null;
        }
        //Clearing the statement
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException sqlEx) { } // ignore

            statement = null;
        }
    }

    void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException sqlEx) { }

            connection = null;
        }
    }
}
