/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import classes.Enfant;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import testing.Validation;

/**
 *
 * @author TPC
 */
public class EnfantServlet extends HttpServlet {

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
            out.println("<title>Servlet EnfantServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EnfantServlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
                HttpSession session=request.getSession();
boolean condition=true;
        String nom=request.getParameter("nc");
        String classe=request.getParameter("cl");
        String note=request.getParameter("np");
        Validation vl=new Validation();
       Enfant en=new Enfant();
       en.setClasse(classe);
       en.setNom_complet(nom);
                  session.setAttribute("message", null);

       try{
       en.setNotePrecedente(Integer.parseInt(note));
              session.setAttribute("numerique",null);

       }
       catch(NumberFormatException ex)
       {
       session.setAttribute("numerique"," la note doit etre numérique");
       condition=false;
       
       }
       if(!vl.validerNom(nom))
       {
       session.setAttribute("nom", "le nom doit contenir un espace");
       condition=false;
       }
       else
                  session.setAttribute("nom", null);

       if(!vl.validerNote(en.getNotePrecedente()))
           
       {
       session.setAttribute("note", "le note doit être positive");
       condition=false;
       }
       else
                  session.setAttribute("note", null);

       if(!vl.validerClasse(classe))
       {
       session.setAttribute("classe", "le nom  de classe est de 4 caractéres");
       condition=false;
       }
       else
              session.setAttribute("classe",null);
       if(condition)
           session.setAttribute("message", "ajouté avec succés");

       response.sendRedirect("enfant.jsp");
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
