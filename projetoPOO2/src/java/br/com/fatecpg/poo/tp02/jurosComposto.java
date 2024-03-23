
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
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Servlet Juros Composto</title>");      
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"_css/_estilo.css\"/>");
            out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\"\n" +
"<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"\"></script>"
                    );
          
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
            double i = 0;
            double m = 0;
            double c = 0;
            int t = 0;
            
                c = Double.parseDouble(request.getParameter("c"));
                i = Double.parseDouble(request.getParameter("i"));
                t = Integer.parseInt(request.getParameter("t"));            
            
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
