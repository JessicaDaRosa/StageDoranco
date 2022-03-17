/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.vastra.stage.Servlet;

import com.vastra.stage.DAO.ActMatAdhService;
import com.vastra.stage.DAO.AdherentService;
import com.vastra.stage.DAO.MaterielService;
import com.vastra.stage.Modele.ActMatAdh;
import com.vastra.stage.Modele.Adherent;
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
public class EditerActMatEngServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditerActMatEngServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditerActMatEngServlet at " + request.getContextPath() + "</h1>");
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
        ActMatAdhService bdAct = new ActMatAdhService();
        int id = Integer.parseInt(request.getParameter("id"));
        ActMatAdh act = bdAct.findById(id);
        request.setAttribute("activite", act);
        
        AdherentService bdAdh = new AdherentService();
        List<Adherent> listAdh = bdAdh.findAllDistict();
        request.setAttribute("listAdherents",listAdh);
        
        MaterielService bdMat = new MaterielService();
        List<Materiel> listMat = bdMat.findAll();
        request.setAttribute("listMateriel", listMat);
        
        RequestDispatcher req = request.getRequestDispatcher("editerActMatAdh.jsp");
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
        ActMatAdh act = new ActMatAdh();
        act.setId(Integer.parseInt(request.getParameter("id")));
        act.setCodeMatos(request.getParameter("codeMatos"));
        act.setCodeFacturation(request.getParameter("codeFacturation"));
        act.setValeurFixe(Float.parseFloat(request.getParameter("valeurFixe")));
        act.setCodeAdherent(request.getParameter("codeAdh"));
        act.setPf(Float.parseFloat(request.getParameter("pf")));
        act.setUnite(Float.parseFloat(request.getParameter("unite")));

        ActMatAdhService bd = new ActMatAdhService();
        boolean res = bd.update(act);
        if (res) {
            String message = "Activité alterée";
            request.setAttribute("message", message);
        }
        List<ActMatAdh> list = bd.findAllDescription();
        request.setAttribute("list", list);


        RequestDispatcher req = request.getRequestDispatcher("actMatAdhDashboard.jsp");
        req.forward(request, response);
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
