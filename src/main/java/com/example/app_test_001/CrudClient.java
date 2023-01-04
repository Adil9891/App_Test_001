package com.example.app_test_001;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "CrudClient", value = "/CrudClient")
public class CrudClient extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        PrintWriter out = response.getWriter();
        String nom =request.getParameter("name");
        String prenom =request.getParameter("prenom");
        String cin=request.getParameter("cin");
        out.println("Bonjour1");
        out.println("p1"+request.getParameter("dateNaissance"));
        out.println("p2"+request.getParameter("dateNaissance").toString());
        String dateNaissance =request.getParameter("dateNaissance").toString();
       // String requette = "insert into client values(default,'MM44','LAAZIZI','AMINE','15/09/1993')";
        String requette = "insert into client values (DEFAULT,\'"+cin+"\',"+"\'"+nom+ "\',\'" +prenom+ "\',\'" +dateNaissance+ "\')";





       String user = "admin";
         String pwd = "azerty";


            Connection conn = null;
            try {
                String url = "jdbc:postgresql://localhost/BANQUE";
                conn = DriverManager.getConnection(url, user, pwd);

            } catch (SQLException e) {
                out.println("Erreur 1 : " + e.getMessage());
            }


        try {

            Statement st = conn.createStatement();
            st.executeQuery(requette);
            st.close();

            out.println("Ok");
        } catch (SQLException e) {
            out.println("Erreur 2 : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
