/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.vastra.stage.Servlet;

import com.vastra.stage.DAO.MaterielService;
import com.vastra.stage.Modele.Materiel;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author jessi
 */
public class createMateriel extends HttpServlet {

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
        Materiel matos = new Materiel();
        matos.setMateriel(request.getParameter("description"));
        matos.setMarque(request.getParameter("marque"));
        matos.setModel(request.getParameter("model"));
        matos.setCode(request.getParameter("code"));
        matos.setDateAchat(request.getParameter("dateAchat"));
        matos.setPrixAchat(Float.parseFloat(request.getParameter("prixAchat")));
        matos.setDureeAmortis(Integer.parseInt(request.getParameter("dureeAmortis")));
        matos.setkSocial(Float.parseFloat(request.getParameter("kSocial")));
        matos.setUniteFacturation(request.getParameter("uniteFacturation"));
        System.out.println(matos.toString());
        MaterielService bd = new MaterielService();
        boolean rep = bd.create(matos);
        System.out.println(rep);
        if(rep){
            String message = "Le materiel " + matos.getCode() + " a eté ajouté.";
            request.setAttribute("message",message);
        }
        else{
            String message = "erreur dnas l'ajout du materiel " + matos.getCode();
            request.setAttribute("message", message);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("createMateriel.jsp");
        requestDispatcher.forward(request, response);
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
