/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vastra.stage.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jessi
 */
public class Factory {
    private Connection connexion;
    private Statement smt;

    public Factory() {
            try {
            // TODO code application logic here
            Class c = Class.forName("com.mysql.cj.jdbc.Driver");
            Driver pilote = (Driver) c.newInstance();

            DriverManager.registerDriver(pilote);

            String protocole = "jdbc:mysql:";

            String ip = "localhost";  // dépend du contexte
            String port = "3306";  // port MySQL par défaut
            // Nom de la base ;
            String nomBase = "stage";  // dépend du contexte
            // Chaîne de connexion
            String conString = protocole + "//" + ip + ":" + port + "/" + nomBase;
            // Identifiants de connexion et mot de passe
            String nomConnexion = "root";  // dépend du contexte
            String motDePasse = "";  // dépend du contexte
            // Connexion
            connexion = DriverManager.getConnection(
                    conString, nomConnexion, motDePasse);
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnexion() {
        return connexion;
    }

    public Statement getSmt() throws SQLException {
        smt = this.connexion.createStatement();
        return smt;
    }
    public PreparedStatement getPreparedStatement(String string){
        try {
            return this.connexion.prepareStatement(string);
        } catch (SQLException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   
     
}
