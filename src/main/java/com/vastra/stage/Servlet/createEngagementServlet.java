/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.vastra.stage.Servlet;

import com.vastra.stage.DAO.AdherentService;
import com.vastra.stage.DAO.EngagementService;
import com.vastra.stage.DAO.MaterielService;
import com.vastra.stage.Modele.Adherent;
import com.vastra.stage.Modele.Engagement;
import com.vastra.stage.Modele.Materiel;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author jessi
 */
public class createEngagementServlet extends HttpServlet {

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
        AdherentService adhService = new AdherentService();
       List<Adherent> listAdherents = adhService.findAllDistict();
       request.setAttribute("listAdherents", listAdherents);
       
       MaterielService matService = new MaterielService();
       List<Materiel> listMateriel= matService.findAll();
       request.setAttribute("listMateriel", listMateriel);
       RequestDispatcher req = request.getRequestDispatcher("createEngagement.jsp");
       req.forward(request, response);
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
        Engagement eng = new Engagement();
        eng.setCodeAdherent(request.getParameter("codeAdh"));
        eng.setIdMateriel(request.getParameter("codeMatos"));
        eng.setPf(Integer.parseInt(request.getParameter("pf")));
        eng.setVolume(request.getParameter("volume"));

        EngagementService bd = new EngagementService();
        boolean res = bd.create(eng);
        if (res) {
            String message = "Engagement ajouté à l'adherent code: " + eng.getCodeAdherent();
            request.setAttribute("message", message);
        }
        RequestDispatcher req = request.getRequestDispatcher("createEngagement.jsp");
        req.forward(request, response);

    }

    /**
     * 
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
