/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akshay
 */
public class OnlineResult extends HttpServlet {

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
                        out.println("<meta charset=\"UTF-8\">\n" +
                        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                        "<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap/css/bootstrap.css\">\n" +
                        "<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap/css/main.css\">"); 
 out.println("<style>#imaginary_container{\n" +
"    margin-top:20%; /* Don't copy this */\n" +
"}\n" +
".stylish-input-group .input-group-addon{\n" +
"    background: white !important; \n" +
"}\n" +
".stylish-input-group .form-control{\n" +
"	border-right:0; \n" +
"	box-shadow:0 0 0; \n" +
"	border-color:#ccc;\n" +
"}\n" +
".stylish-input-group button{\n" +
"    border:0;\n" +
"    background:transparent;\n" +
"} </style>");
            out.println("<title>Somaiya Online Result</title>");            
            out.println("</head>");
            out.println("<body>");
            String num=request.getParameter("roll");
          
            
            out.println("<form method=\"get\" action=\"Result\"> <div class=\"container\">\n" +
"	<div class=\"row\">\n" +
"        <div class=\"col-sm-6 col-sm-offset-3\">\n" +
"            <div id=\"imaginary_container\"> \n" +
"                <div class=\"input-group stylish-input-group\">\n" +
"                    <input type=\"text\" class=\"form-control\"  placeholder=\"Enter your Roll Number here\"  id=\"roll\" name=\"roll\">\n" +
"                    <span class=\"input-group-addon\">\n" +
"                        <button type=\"submit\">\n" +
"                            <span class=\"glyphicon glyphicon-search\"></span>\n" +
"                        </button>  \n" +
"                    </span>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"	</div>\n" +
"</div></form>"); 
          
            
            
            out.println("<script src=\"./css/bootstrap/js/jquery.js\"></script>");
            out.println("<script type=\"text/javascript\" src=\"./css/bootstrap/js/bootstrap.js\"></script>");
 
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
