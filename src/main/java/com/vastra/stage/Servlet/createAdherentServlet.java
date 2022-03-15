/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.vastra.stage.Servlet;

import com.vastra.stage.DAO.AdherentService;
import com.vastra.stage.Modele.Adherent;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author jessi
 */
public class createAdherentServlet extends HttpServlet {

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
      Adherent adh = new Adherent();
      adh.setCode(request.getParameter("code"));
      String codeClient = request.getParameter("CodeClientCER");
      if(codeClient != null){
          adh.setCodeClient(Integer.parseInt(codeClient));
      }
      adh.setTitre(request.getParameter("titre"));
      adh.setNom(request.getParameter("nom"));
      adh.setPrenom(request.getParameter("prenom"));
      adh.setAdresse1(request.getParameter("adresse1"));
      adh.setAdresse2(request.getParameter("adresse2"));
      String codePostal = request.getParameter("CodePostal");
      if(codeClient != null){
          adh.setCodeClient(Integer.parseInt(codePostal));
      }
      adh.setCommune(request.getParameter("commune"));
      adh.setPortable(request.getParameter("portable"));
      adh.setFixe(request.getParameter("fixe"));
      adh.setMail(request.getParameter("mail"));
      adh.setNomEntreprise(request.getParameter("entreprise"));
      
      AdherentService bd = new AdherentService();
      boolean res = bd.create(adh);
      if(res){
          String message = "L'adherent code: " + adh.getCode() + " a ete ajoutée.";
          request.setAttribute("message", message);
      }
      
      RequestDispatcher req = request.getRequestDispatcher("createAdherent.jsp");
      req.forward(request, response);
      
      
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
