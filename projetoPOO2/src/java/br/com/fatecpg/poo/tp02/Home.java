/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.poo.tp02;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bran
 */
@WebServlet(name = "Home", urlPatterns = {"/home"})
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"_css/estilo.css\"/>");
            out.println("<title>Home</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>"
                    );
            
            out.println("<style>");
            
            out.println(".caixa{width:100%;height:85px;background-color:#447FFF;}"
                    + ".caixa h1{text-align:center;padding-top:20px;color:#FFF;text-shadow:2px 3px 2px gray;}"
                    + ".escolha{width:300px;margin:30px auto;}"
                    + ".escolha .btnSimples{background-color:#262063;border:3px;width:130px;height:40px;font-size:16px;color:#fff;}"
                    + ".escolha .btnComposto{background-color:#e03131;border:3px;width:130px;height:40px;font-size:16px;color:#fff;}"
                    + "footer .caixa{margin-top:30px;}");
            
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='caixa'>");
            out.println("<h1>Home</h1>");
            out.println("</div>");
            out.println("<div class='escolha'>"                    
                    +"<button type=\"button\" onclick=\"window.location.href='/projetoPOO2/jurosSimpless'\" class=\"btnSimples\">Juros Simples</button>"
                    +"<button type=\"button\" onclick=\"window.location.href='/projetoPOO2/jurosComposto'\" class=\"btnComposto\">Juros Composto</button> </div>");
            
             
                out.println("<div class=\"col-md-6 col-md-offset-3\" \"mx-auto d-block\">");
                out.println("<table class=\"table table-striped table-hover\" \"mx-auto d-block\">" );
		        out.println("<thead>");
		        out.println("<tr>");
		        out.println("<th>Nome</th>");
		        out.println("<th>Curso</th>");
		        out.println("<th>Horário</th>");
		        out.println("</tr>");
		        out.println("</thead>");
		        out.println("<tbody>");
		        out.println("<tr>");
		        out.println(" <th></th>");
		        out.println("<td>Ailton Gois</td>");
		        out.println("<td>ADS</td>");
		        out.println("<td>Noturno</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<th></th>");
                out.println("<td>André Martins</td>");
                out.println("<td>ADS</td>");
		        out.println("<td>Noturno</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<th></th>");
                out.println("<td>Brenner Goncalves</td>");
                out.println("<td>ADS</td>");
                out.println("<td>Noturno</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<th></th>");
                out.println("<td>Pedro Patrinieri</td>");
                out.println("<td>ADS</td>");
                out.println("<td>Noturno</td>");
                out.println("</tr>");
                out.println("</tbody>");
                out.println("</table>");
            
                out.println("<div id=desenho>");
                out.println("<img src=\"images/homercontador.png\" class=\"mx-auto d-block\" title=\"Homer Contador\">");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
                
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
