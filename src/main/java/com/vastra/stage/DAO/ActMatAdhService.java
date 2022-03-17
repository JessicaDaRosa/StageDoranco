/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vastra.stage.DAO;

import com.vastra.stage.Modele.ActMatAdh;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jessi
 */
public class ActMatAdhService implements IDao<ActMatAdh> {

    Factory bd;

    public ActMatAdhService() {
        bd = new Factory();
    }

    @Override
    public boolean create(ActMatAdh act) {
        String sql = "INSERT INTO `actmateng`(Code_materiel, Code_facturation, "
                + "Valeur_fixe, Code_adherent, pf, unite) "
                + "VALUES( ?, ?, ?, ?, ?, ?)";
        PreparedStatement smt = bd.getPreparedStatement(sql);
        try {
            smt.setString(1, act.getCodeMatos());
            smt.setString(2, act.getCodeFacturation());
            smt.setFloat(3, act.getValeurFixe());
            smt.setString(4, act.getCodeAdherent());
            smt.setFloat(5, act.getPf());
            smt.setFloat(6, act.getUnite());

            return smt.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ActMatAdhService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(ActMatAdh act) {
        String sql = "DELETE FROM `actmateng` WHERE Code_materiel = ? AND Code_adherent = ? ";
        PreparedStatement smt = bd.getPreparedStatement(sql);
        try {
            smt.setString(1, act.getCodeMatos());
            smt.setString(2, act.getCodeAdherent());
            return smt.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ActMatAdhService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(ActMatAdh act) {
        String sql = "UPDATE `actmateng` "
                + "SET Code_facturation = ?, Valeur_fixe = ?, pf = ?, unite = ?, Code_materiel = ?, Code_adherent = ? "
                + "WHERE  id = ?";
        PreparedStatement smt = bd.getPreparedStatement(sql);
        try {
            smt.setString(1, act.getCodeFacturation());
            smt.setFloat(2, act.getValeurFixe());
            smt.setFloat(3, act.getPf());
            smt.setFloat(4, act.getUnite());
            smt.setString(5, act.getCodeMatos());
            smt.setString(6, act.getCodeAdherent());
            smt.setInt(7, act.getId());
            
            return smt.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ActMatAdhService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ActMatAdh findById(int id) {
        String sql = "SELECT * FROM `actmateng` WHERE id = ? ";
        PreparedStatement smt = bd.getPreparedStatement(sql);
        ActMatAdh act = new ActMatAdh();
        try {
            smt.setInt(1, id);
            ResultSet res = smt.executeQuery();
            if(res.next()){
                act.setId(res.getInt(1));
                act.setCodeMatos(res.getString(2));
                act.setCodeFacturation(res.getString(3));
                act.setValeurFixe(res.getFloat(4));
                act.setCodeAdherent(res.getString(5));
                act.setPf(res.getFloat(6));
                act.setUnite(res.getFloat(7));
                return act;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActMatAdhService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ActMatAdh> findAll() {
        String sql = "SELECT * FROM `actmateng`";
        PreparedStatement smt = bd.getPreparedStatement(sql);
        List<ActMatAdh> act_list = new ArrayList<>();
        try {
            ResultSet res = smt.executeQuery();
            while(res.next()){
                ActMatAdh act = new ActMatAdh();
                act.setId(res.getInt(1));
                act.setCodeMatos(res.getString(2));
                act.setCodeFacturation(res.getString(3));
                act.setValeurFixe(res.getFloat(4));
                act.setCodeAdherent(res.getString(5));
                act.setPf(res.getFloat(6));
                act.setUnite(res.getFloat(7));
                act_list.add(act);
            }
            return act_list;
        } catch (SQLException ex) {
            Logger.getLogger(ActMatAdhService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<ActMatAdh> findAllDescription(){
        String sql="SELECT `id`, `Code_materiel`,`Description`, `Code_facturation`, `Valeur_fixe`, `Code_adherent`, `pf`, `unite` FROM `actmateng` a, `matériel` m WHERE a.Code_materiel=m.Code";
        PreparedStatement smt = bd.getPreparedStatement(sql);
        List<ActMatAdh> act_list = new ArrayList<>();
        try {
            ResultSet res = smt.executeQuery();
            while(res.next()){
                ActMatAdh act = new ActMatAdh();
                act.setId(res.getInt(1));
                act.setCodeMatos(res.getString(2));
                act.setDescriptionMateriel(res.getString(3));
                act.setCodeFacturation(res.getString(4));
                act.setValeurFixe(res.getFloat(5));
                act.setCodeAdherent(res.getString(6));
                act.setPf(res.getFloat(7));
                act.setUnite(res.getFloat(8));
                act_list.add(act);
            }
            return act_list;
        } catch (SQLException ex) {
            Logger.getLogger(ActMatAdhService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

}
