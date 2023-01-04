package com.example.app_test_001;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


/**
 * Servlet implementation class gestFormulaire
 */
@WebServlet("/gestFormulaire")
public class gestFormulaire extends HttpServlet {
    private static final long serialVersionUID = 1L;
    String leGenre="";
    String salut="";
    /**
     * Default constructor.
     */
    public gestFormulaire() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request,
            HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Enregistrement coordonnées</title></head>");
        out.println("<body padding:left=80px>");
        out.println("<h2>Enregistrement de vos coordonnées effectué</h2>");
        out.println("<hr width=75%>");
        leGenre=request.getParameter("genre");
        if(leGenre.equals("homme")){
            salut="Monsieur";
        }else {
            salut="Madame";
        }
        out.println("<b>Bonjour "+ salut+" </b><br>");
        out.println("Votre Prénom est : "+request.getParameter("prenom")+"<br>");
        out.println("Votre Nom est : "+request.getParameter("nom")+".<br>");
        out.println("Votre Date de naissance est : "
                +request.getParameter("dateNaissance")+".<br>");
        out.println("Votre Adresse mail est : "+request.getParameter("mail")+".<br>");
        out.println("Votre Site web est : "+request.getParameter("site")+".<br>");
        out.println("Votre code est : "+request.getParameter("mail")+".<br>");
        out.println("Votre pays est : "+request.getParameter("pays")+".<br>");

        // Step 4: try-with-resource statement will auto close the connection.
        out.println("</body></html>");
        }




}