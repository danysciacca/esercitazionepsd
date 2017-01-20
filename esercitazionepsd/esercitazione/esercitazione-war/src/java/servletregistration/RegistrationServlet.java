/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletregistration;

import bean.GestoreLocal;
import bean.RegistrationBean;
import bean.RegistrationBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utenti.utente;

/**
 *
 * @author Daniele
 */
public class RegistrationServlet extends HttpServlet {

    @EJB
    private GestoreLocal gestore;
    @EJB
    private RegistrationBeanLocal registrationBean;
    
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
        String nome=request.getParameter("nome");
        String cognome=request.getParameter("cognome");
        String sesso=request.getParameter("sesso");
        String indirizzo=request.getParameter("indirizzo");
        String mail=request.getParameter("mail");
        String codice_fiscale=request.getParameter("codice_fiscale");
        String numero_carta_d_identita=request.getParameter("numero_carta_d_identita");
        String numero_patente=request.getParameter("numero_patente");
        
        
        
       String choice=request.getParameter("tipo");
       
       switch(choice){
           case "GO":
                registrationBean.register(new utente (nome, cognome, sesso, indirizzo, mail, codice_fiscale, numero_carta_d_identita, numero_patente));
        
                 request.getRequestDispatcher("index.html").forward(request, response);
                 break;
       
        
           case "caso2":
                gestore.operazioneBean();
                request.getRequestDispatcher("index.html").forward(request, response);
                break;
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
