
package br.com.fatecpg.poo.tp02;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author André
 */
@WebServlet(name = "jurosComposto", urlPatterns = {"/jurosComposto"})
public class jurosComposto extends HttpServlet {

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
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Juros Composto</title>");      
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>"
                    );
            out.println("<style>");
            
            out.println(".caixa{width:100%;height:85px;background-color:#447FFF;}"
                    + ".caixa h1{text-align:center;padding-top:20px;color:#FFF;text-shadow:2px 3px 2px gray;}"
                    + ".formulario{width:300px;margin:30px auto;}"
                    + ".formulario label{font-size:15px;color:gray;font-weight:600;}"
                    + ".formulario .btnEnviar{background-color:#237382;border:3px;width:130px;height:40px;font-size:16px;color:#fff;}"
                    + ".formulario .limpar{background:rgb(252,45,54);margin-left:10px;}"
                    + ".tabResultado{width:700px;margin:0 auto;}"
                    + ".tabResultado th{background:#9EC0E3;font-weight:600;color:#fff;text-shadow:1px 1px 2px gray;font-size:18px;text-align:center;}"
                    + ".tabResultado td{background:#FDFFF5;text-align:center;font-size:18px;font-weight:bolder;color:#FF715E;}"
                    + "footer .caixa{margin-top:30px;}");
            
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='caixa'>");
            out.println(" <h1>Juros Composto</h1>");
            out.println("</div>");
            
            out.println("<form method='get' class=formulario>"
                    + "<div class=\"form-group\">\n" +
"    <label>Capital:</label>\n" +
"    <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Informe o capital\" name='c'>\n" +
"  </div>"
                    + "<div class=\"form-group\">\n" +
"    <label for=\"exampleFormControlInput1\">Taxa de Juros:</label>\n" +
"    <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Informe a taxa de juros\" name='i'>\n" +
"  </div>"
                    + "<div class=\"form-group\">\n" +
"    <label for=\"exampleFormControlInput1\">Periodo:</label>\n" +
"    <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Informe o periodo em meses\" name='t'>\n" +
"  </div>"
                    + "<input type='submit' value='Calcular' class='btnEnviar'>"
                    + "<input type='reset' value='Limpar' class='btnEnviar limpar'> </form>");
            
            DecimalFormat df = new DecimalFormat("###,##0.00");
            double i =0;
            double m=0;
            double c = 0;
            int t=0;
           
            try
            {
                c = Double.parseDouble(request.getParameter("c"));
                i = Double.parseDouble(request.getParameter("i"));
                t = Integer.parseInt(request.getParameter("t"));
            }
            catch(Exception ex){/*out.println("Erro ao usar o parametro<hr>");*/}
            
            i = i/100;
            
            double aux=1;
             for(int x=0;x<t;x++){
        	aux = aux * (1 + i);        		
        	}
         
         m = c * aux;
         
            out.println(" <table class=\"table tabResultado\">\n" +
"    \n" +
"      <tr>\n" +
"        <th>Valor do Capital</th>\n" +
"        <td>R$"+df.format(c)+"</td>\n" +
"      </tr>\n" +
"      <tr>\n" +
"        <th>Taxa de Juros</th>\n" +
"        <td>"+(i * 100)+"%</td>\n" +
"      </tr>\n" +
"      <tr>\n" +
"        <th>Periodo</th>\n" +
"        <td>"+t+" meses</td>\n" +
"      </tr>\n" +
"      <tr>\n" +
"        <th>Total de Juros</th>\n" +
"        <td>R$"+df.format(m-c)+"</td>\n" +
"      </tr>"
    + " <tr>\n" +
"        <th>Montante</th>\n" +
"        <td>R$"+df.format(m)+"</td>\n" +
"      </tr>  "
        + "</table>\n" +
"</div>");
            out.println("<footer>");
            out.println("<div class='caixa'></div>");
            out.println("</footer>");
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
