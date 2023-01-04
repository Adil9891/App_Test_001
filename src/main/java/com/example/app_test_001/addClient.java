package com.example.app_test_001;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "addClient", value = "/addClient")
public class addClient extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        PrintWriter out = response.getWriter();
        String nom =request.getParameter("nom");
        String prenom =request.getParameter("prenom");
        String cin=request.getParameter("cin");
        String dateNaissance =request.getParameter("dateNaissance");

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
            st.executeUpdate(requette);
            out.println(st.getResultSet());
            st.close();
            //response.sendRedirect("index.jsp");

            out.println("Ok");
            RequestDispatcher redirection=request.getRequestDispatcher("index.jsp");
            redirection.forward(request, response);
        } catch (SQLException e) {
            out.println("error : "+e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
