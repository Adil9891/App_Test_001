package com.example.app_test_001;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Connexion {
    private final String user = "admin";
    private final String pwd = "azerty";
    public Connection connecter() {
        Connection conn = null;
        try {
            String url = "jdbc:postgresql://localhost/BANQUE";
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
        }
        return conn;
    }
}