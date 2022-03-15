/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vastra.stage.DAO;

import com.vastra.stage.Modele.Adherent;
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
public class AdherentService implements IDao<Adherent> {

    Factory db;

    public AdherentService() {
        this.db = new Factory();
    }

    @Override
    public boolean create(Adherent adh) {
        try {
            String sql = "INSERT INTO `adhérents`"
                    + "( Code, Code_Client_CER, Titre, Nom, Prénom, "
                    + "Adresse_1, Adresse_2, Code_Postal, Commune, Portable, "
                    + "Fixe, Mail, Nom_Entreprise) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            stmt.setString(1, adh.getCode());
            stmt.setInt(2, adh.getCodeClient());
            stmt.setString(3, adh.getTitre());
            stmt.setString(4, adh.getNom());
            stmt.setString(5, adh.getPrenom());
            stmt.setString(6, adh.getAdresse1());
            stmt.setString(7, adh.getAdresse2());
            stmt.setInt(8, adh.getCodePostal());
            stmt.setString(9, adh.getCommune());
            stmt.setString(10, adh.getPortable());
            stmt.setString(11, adh.getFixe());
            stmt.setString(12, adh.getMail());
            stmt.setString(13, adh.getNomEntreprise());
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdherentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param adh
     * @return
     */
    @Override
    public boolean delete(Adherent adh) {
        try {
            String sql = "DELETE FROM `adhérents` WHERE id = ? ";
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            stmt.setInt(1, adh.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdherentService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     *
     * @param adh
     * @return
     */
    @Override
    public boolean update(Adherent adh) {
        try {
            String sql = "UPDATE `adhérents` "
                    + "SET Code= ?, Code_Client_CER= ?, Titre= ?, Nom= ?, "
                    + "Prénom= ?, Adresse_1= ?, Adresse_2= ?,"
                    + "Code_Postal= ?, Commune=?, Portable=?, Fixe=?, "
                    + "Mail=?, Nom_Entreprise=?"
                    + " WHERE `id`=?";
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            stmt.setString(1, adh.getCode());
            stmt.setInt(2, adh.getCodeClient());
            stmt.setString(3, adh.getTitre());
            stmt.setString(4, adh.getNom());
            stmt.setString(5, adh.getPrenom());
            stmt.setString(6, adh.getAdresse1());
            stmt.setString(7, adh.getAdresse2());
            stmt.setInt(8, adh.getCodePostal());
            stmt.setString(9, adh.getCommune());
            stmt.setString(10, adh.getPortable());
            stmt.setString(11, adh.getFixe());
            stmt.setString(12, adh.getMail());
            stmt.setString(13, adh.getNomEntreprise());
            stmt.setInt(14, adh.getId());
            return stmt.executeUpdate() > 0 ;
        } catch (SQLException ex) {
            Logger.getLogger(AdherentService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Adherent findByCode(String code) {
        Adherent adh = new Adherent();
        try {
            String sql = "SELECT * FROM `adhérents` WHERE Code = ?";
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            stmt.setString(1, code);
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                adh.setId(res.getInt("id"));
                adh.setCode(res.getString("Code"));
                adh.setCodeClient(res.getInt("Code_Client_CER"));
                adh.setTitre(res.getString("Titre"));
                adh.setNom(res.getString("Nom"));
                adh.setPrenom(res.getString("Prénom"));
                adh.setAdresse1(res.getString("Adresse_1"));
                adh.setAdresse2(res.getString("Adresse_2"));
                adh.setCodePostal(res.getInt("Code_Postal"));
                adh.setCommune(res.getString("Commune"));
                adh.setPortable(res.getString("Portable"));
                adh.setFixe(res.getString("Fixe"));
                adh.setMail(res.getString("Mail"));
                adh.setNomEntreprise(res.getString("Nom_Entreprise"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdherentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adh;
    }

    @Override
    public Adherent findById(int id) {
        Adherent adh = new Adherent();
        try {
            String sql = "SELECT * FROM `adhérents` WHERE id=?";
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                adh.setId(res.getInt("id"));
                adh.setCode(res.getString("Code"));
                adh.setCodeClient(res.getInt("Code_Client_CER"));
                adh.setTitre(res.getString("Titre"));
                adh.setNom(res.getString("Nom"));
                adh.setPrenom(res.getString("Prénom"));
                adh.setAdresse1(res.getString("Adresse_1"));
                adh.setAdresse2(res.getString("Adresse_2"));
                adh.setCodePostal(res.getInt("Code_Postal"));
                adh.setCommune(res.getString("Commune"));
                adh.setPortable(res.getString("Portable"));
                adh.setFixe(res.getString("Fixe"));
                adh.setMail(res.getString("Mail"));
                adh.setNomEntreprise(res.getString("Nom_Entreprise"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdherentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adh;
    }

    @Override
    public List<Adherent> findAll() {
        ArrayList<Adherent> adh_list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `adhérents`";
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                Adherent adh;
                adh = new Adherent();
                adh.setId(res.getInt("id"));
                adh.setCode(res.getString("Code"));
                adh.setCodeClient(res.getInt("Code_Client_CER"));
                adh.setTitre(res.getString("Titre"));
                adh.setNom(res.getString("Nom"));
                adh.setPrenom(res.getString("Prénom"));
                adh.setAdresse1(res.getString("Adresse_1"));
                adh.setAdresse2(res.getString("Adresse_2"));
                adh.setCodePostal(res.getInt("Code_Postal"));
                adh.setCommune(res.getString("Commune"));
                adh.setPortable(res.getString("Portable"));
                adh.setFixe(res.getString("Fixe"));
                adh.setMail(res.getString("Mail"));
                adh.setNomEntreprise(res.getString("Nom_Entreprise"));
                adh_list.add(adh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdherentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adh_list;
    }
    
    public List<Adherent> findAllDistict(){
        ArrayList<Adherent> adh_list = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT Code, Nom_Entreprise FROM `adhérents`";
            PreparedStatement stmt = db.getConnexion().prepareStatement(sql);
            ResultSet res = stmt.executeQuery();
            ArrayList<Adherent> temp_adh_list = new ArrayList<>();
            while(res.next()){
                Adherent adh;
                adh = new Adherent();
                adh.setCode(res.getString("Code"));
                adh.setNomEntreprise(res.getString("Nom_Entreprise"));
//                System.out.println("Code : " +res.getString("Code") + ", Nom Entreprise : " + res.getString("Nom_Entreprise") );
//                System.out.println("Code : " +adh.getCode() + ", Nom Entreprise : " + adh.getNomEntreprise() );
                temp_adh_list.add(adh);
            }
            for(Adherent a : temp_adh_list){
                adh_list.add(this.findByCode(a.getCode()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdherentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adh_list;
    }
}
