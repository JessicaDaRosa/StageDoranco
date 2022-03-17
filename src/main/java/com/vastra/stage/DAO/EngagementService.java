/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vastra.stage.DAO;

import com.vastra.stage.Modele.Engagement;
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
public class EngagementService implements IDao<Engagement> {

    Factory db;

    public EngagementService() {
        this.db = new Factory();
    }


    @Override
    public boolean create(Engagement eng) {
        String sql = "INSERT INTO `engagements`(Code_matériel, Code_adhérent, PF, volume) "
                + "VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            stmt.setString(1, eng.getIdMateriel());
            stmt.setString(2, eng.getCodeAdherent());
            stmt.setInt(3, eng.getPf());
            stmt.setString(4, eng.getVolume());
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(EngagementService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Engagement eng) {
        String sql = "DELETE FROM `engagements` where id = ?";
        try {
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            stmt.setInt(1, eng.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(EngagementService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Engagement eng) {
        String sql = "UPDATE `engagements` "
                + "SET Code_matériel = ?, Code_adhérent=?, PF=?, colume=? "
                + "WHERE id=?";

        try {
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            stmt.setString(1, eng.getIdMateriel());
            stmt.setString(2, eng.getCodeAdherent());
            stmt.setInt(3, eng.getPf());
            stmt.setString(4, eng.getVolume());
            return stmt.executeUpdate() == 0;

        } catch (SQLException ex) {
            Logger.getLogger(EngagementService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Engagement findById(int id) {
        String sql = "SELECT * FROM `engagements` WHERE id =?";
        Engagement eng = new Engagement();

        try {
            PreparedStatement smt = db.getConnexion().prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet res = smt.executeQuery();
            if (res.next()) {
                eng.setId(id);
                eng.setIdMateriel(res.getString("Code_matériel"));
                eng.setCodeAdherent(res.getString("Code_adhérent"));
                eng.setPf(res.getInt("PF"));
                eng.setVolume(res.getString("volume"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EngagementService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eng;

    }
    public Engagement findByCodes(String code_matos, String code_adh){
        String sql = "SELECT * FROM `engagements` WHERE Code_matériel = ? AND Code_adhérent = ?";
        Engagement eng = new Engagement();

        try {
            PreparedStatement smt = db.getConnexion().prepareStatement(sql);
            smt.setString(1, code_matos);
            smt.setString(2, code_adh);
            ResultSet res = smt.executeQuery();
            if (res.next()) {
                eng.setId(res.getInt("id"));
                eng.setIdMateriel(res.getString("Code_matériel"));
                eng.setCodeAdherent(res.getString("Code_adhérent"));
                eng.setPf(res.getInt("PF"));
                eng.setVolume(res.getString("volume"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EngagementService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eng;
    }
    
    @Override
    public List<Engagement> findAll() {
        String sql = "SELECT `id`, `Code_matériel`, `Code_adhérent`, `pf`, `volume`, `Description` FROM `engagements` e, `matériel` m WHERE e.Code_matériel = m.Code";
        ArrayList<Engagement> eng_list = new ArrayList<>();

        try {
            PreparedStatement smt = db.getConnexion().prepareStatement(sql);
            ResultSet res = smt.executeQuery();
            while (res.next()) {
                Engagement eng = new Engagement();
                eng.setId(res.getInt("id"));
                eng.setIdMateriel(res.getString("Code_matériel"));
                eng.setCodeAdherent(res.getString("Code_adhérent"));
                eng.setPf(res.getInt("PF"));
                eng.setVolume(res.getString("volume"));
                eng.setDescriptionMateriel(res.getString("Description"));
                eng_list.add(eng);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EngagementService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eng_list;
    }
    
    public List<Engagement> getPFtotalParMachine(){
        String sql = "SELECT Code_matériel, Description, sum(PF) "
                + "FROM `engagements`, `matériel` "
                + "WHERE Code_matériel = Code "
                + "GROUP  BY Code_matériel";
        ArrayList<Engagement> eng_list = new ArrayList<>();

        try {
            PreparedStatement smt = db.getConnexion().prepareStatement(sql);
            ResultSet res = smt.executeQuery();
            while (res.next()) {
                Engagement eng = new Engagement();
                eng.setId(res.getInt("id"));
                eng.setIdMateriel(res.getString("Code"));
                eng.setCodeAdherent(res.getString("Code_adhérent"));
                eng.setPf(res.getInt("PF"));
                eng.setVolume(res.getString("volume"));
                eng_list.add(eng);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EngagementService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eng_list;
    }

}
