package com.example.app_test_001;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.lang.System.out;
@WebServlet(name = "customerList", value = "/customerList")
public class customerList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"ISO-8859-1\">\n" +
                "    <link rel=\"stylesheet\" href=\"style001.css\">\n" +
                "    <title>Formulaire JSP</title>\n" +
                "\n" +
                "</head>\n" +
                "<body>");
        out.println("<div class=\"bdy\">\n" +
                "    <div >\n" +
                "        <button class=\"btn2\" type=\"button\" href=\"index.jsp\">Création</button>\n" +
                "        <button class=\"btn2\" type=\"button\" href=\"index.jsp\">Modification</button>\n" +
                "        <button class=\"btn2\" type=\"button\" href=\"index.jsp\">Suppression</button>\n" +
                "        <button class=\"btn2\" type=\"button\" href=\"index.jsp\">Rechercher</button>\n" +
                "    </div>" +
                "<fieldset class=\"fld\">" +
                "<legend>Liste des clients</legend>");
        out.println("<table class=\"tbl\">");
        out.println("<tr >\n" +
                "                                <th>Code client</th>\n" +
                "                                <th>CIN</th>\n" +
                "                                <th>Nom</th>\n" +
                "                                <th>Prénom</th>\n" +
                "                                <th>Date de naissance</th>\n" +
                "                            </tr>");
        try {
            Connexion conn = new Connexion();
            ResultSet rs = null;
            Statement stmt = conn.connecter().createStatement();
            rs =  stmt.executeQuery("SELECT * FROM CLIENT");
            while(rs.next())
            {
                out.println("<tr>");
                for(int col=1;col<=rs.getMetaData().getColumnCount();col++)
                {
                    Object obj= rs.getObject(col);
                    out.println("<td class=\"td2\">"+ obj.toString()+"</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</fieldset>" +
                    "</div>");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}