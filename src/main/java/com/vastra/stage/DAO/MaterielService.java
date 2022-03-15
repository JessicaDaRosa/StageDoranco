/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vastra.stage.DAO;

import com.vastra.stage.Modele.Materiel;
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
public class MaterielService implements IDao<Materiel> {

    Factory db;

    public MaterielService() {
        db = new Factory();
    }

    @Override
    public boolean create(Materiel matos) {

        String sql = "INSERT INTO `matériel`(`Description`, `Marque`, `Modèle`,"
                + " `Code`, `Date_achat`, `Prix_achat`, `Durée_ammortis.`, `K.Social`, "
                + "`Nbr_adhér`, `Engagements`, `Unité_facturation`) "
                +"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        
        try {
            PreparedStatement smt = db.getPreparedStatement(sql);
            smt.setString(1, matos.getMateriel());
            smt.setString(2, matos.getMarque());
            smt.setString(3, matos.getModel());
            smt.setString(4, matos.getCode());
            smt.setString(5, matos.getDateAchat());
            smt.setFloat(6, matos.getPrixAchat());
            smt.setInt(7,matos.getDureeAmortis());
            smt.setFloat(8, matos.getkSocial());
            smt.setInt(9, matos.getNbAdherents());
            smt.setInt(10,matos.getEngagements());
            smt.setString(11,matos.getUniteFacturation());
            System.out.println(smt.toString());
            return smt.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(MaterielService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Materiel matos) {
        String sql = "DELETE FROM `matériel` WHERE Code = ?";
        
        PreparedStatement smt = db.getPreparedStatement(sql);
        try {
            smt.setString(1, matos.getCode());
            return smt.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(MaterielService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Materiel matos) {
        
        String sql = "UPDATE `matériel` "
                + "SET `Description`=?,`Marque`=?,"
                + "`Modèle`=?,`Date_achat`=?,"
                + "`Prix_achat`=?,`Durée_ammortis.`=?,"
                + "`K.Social`=?,`Nbr_adhér`=?,"
                + "`Engagements`=?,`Unité_facturation`=? WHERE `Code`=?";

        try {
            PreparedStatement smt = db.getPreparedStatement(sql);
            smt.setString(1, matos.getMateriel());
            smt.setString(2, matos.getMarque());
            smt.setString(3, matos.getModel());
            smt.setString(4, matos.getDateAchat());
            smt.setFloat(5, matos.getPrixAchat());
            smt.setInt(6,matos.getDureeAmortis());
            smt.setFloat(7, matos.getkSocial());
            smt.setInt(8, matos.getNbAdherents());
            smt.setInt(9,matos.getEngagements());
            smt.setString(10,matos.getUniteFacturation());
            smt.setString(11, matos.getCode());
            return smt.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(MaterielService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Materiel findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * 
     * @param code
     * @return 
     */
    public Materiel findByCode(String code){
        String sql = "SELECT * FROM `matériel` WHERE Code = ?";
        Materiel matos;
        PreparedStatement smt = db.getPreparedStatement(sql);
        try {
            smt.setString(1, code);
            ResultSet res = smt.executeQuery();
            if(res.next()){
                matos = new Materiel();
                matos.setMateriel(res.getString(1));
                matos.setMarque(res.getString(2));
                matos.setModel(res.getString(3));
                matos.setCode(res.getString(4));
                matos.setDateAchat(res.getString(5));
                matos.setPrixAchat(res.getFloat(6));
                matos.setDureeAmortis(res.getInt(7));
                matos.setkSocial(res.getFloat(8));
                matos.setNbAdherents(res.getInt(9));
                matos.setEngagements(res.getInt(10));
                matos.setUniteFacturation(res.getString("Unité_facturation"));
                return matos;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterielService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Materiel> findAll() {
        String sql = "SELECT * FROM `matériel`";
        List<Materiel> matos_list = new ArrayList<>();
        PreparedStatement smt = db.getPreparedStatement(sql);
        try {
            ResultSet res = smt.executeQuery();
            while(res.next()){
                Materiel matos = new Materiel();
                matos.setMateriel(res.getString(1));
                matos.setMarque(res.getString(2));
                matos.setModel(res.getString(3));
                matos.setCode(res.getString(4));
                matos.setDateAchat(res.getString(5));
                matos.setPrixAchat(res.getFloat(6));
                matos.setDureeAmortis(res.getInt(7));
                matos.setkSocial(res.getFloat(8));
                matos.setNbAdherents(res.getInt(9));
                matos.setEngagements(res.getInt(10));
                matos.setUniteFacturation(res.getString(11));
                matos_list.add(matos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterielService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return matos_list;
    }

}
