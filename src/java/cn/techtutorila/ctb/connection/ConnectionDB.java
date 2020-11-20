package cn.techtutorila.ctb.connection;

import java.sql.*;

public class ConnectionDB {

    private static Connection con;

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinematicketbooking", "root", "almamun@123");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
