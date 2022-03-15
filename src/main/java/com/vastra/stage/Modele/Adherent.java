/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vastra.stage.Modele;

import java.util.Objects;

/**
 *Classe qui reprensente les adherents delacooperative
 * @author jessi
 */
public class Adherent {
    
    private int id;
    private String code;
    private int codeClient;
    private String titre;
    private String nom;
    private String prenom;

    private String adresse1;
    private String adresse2;
    private int codePostal;
    private String commune;
    private String portable;
    private String fixe;
    private String mail;
    private String nomEntreprise;

    public Adherent() {
    }
    /**
     * 
     * @param id
     * @param code
     * @param codeClient
     * @param titre
     * @param nom
     * @param prenom
     * @param adresse1
     * @param adresse2
     * @param codePostal
     * @param commune
     * @param portable
     * @param fixe
     * @param mail
     * @param nomEntreprise 
     */
    public Adherent(int id, String code, int codeClient, String titre, String nom, String prenom, String adresse1, String adresse2, int codePostal, String commune, String portable, String fixe, String mail, String nomEntreprise) {
        this.id = id;
        this.code = code;
        this.codeClient = codeClient;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.commune = commune;
        this.portable = portable;
        this.fixe = fixe;
        this.mail = mail;
        this.nomEntreprise = nomEntreprise;
    }

    public Adherent(String code, int codeClient, String titre, String nom, String prenom, String adresse1, String adresse2, int codePostal, String commune, String portable, String fixe, String mail, String nomEntreprise) {
        this.code = code;
        this.codeClient = codeClient;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.commune = commune;
        this.portable = portable;
        this.fixe = fixe;
        this.mail = mail;
        this.nomEntreprise = nomEntreprise;
    }
    
    /**
     *
     * @return String
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return int
     */
    public int getCodeClient() {
        return codeClient;
    }

    /**
     *
     * @param codeClient
     */
    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    /**
     *
     * @return String
     */
    public String getTitre() {
        return titre;
    }

    /**
     *
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    public String getAdresse1() {
        return adresse1;
    }

    /**
     *
     * @param adresse1
     */
    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    /**
     *
     * @return
     */
    public String getAdresse2() {
        return adresse2;
    }

    /**
     *
     * @param adresse2
     */
    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    /**
     *
     * @return
     */
    public int getCodePostal() {
        return codePostal;
    }

    /**
     *
     * @param codePostal
     */
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    /**
     *
     * @return
     */
    public String getCommune() {
        return commune;
    }

    /**
     *
     * @param commune
     */
    public void setCommune(String commune) {
        this.commune = commune;
    }

    /**
     *
     * @return
     */
    public String getPortable() {
        return portable;
    }

    /**
     *
     * @param portable
     */
    public void setPortable(String portable) {
        this.portable = portable;
    }

    /**
     *
     * @return
     */
    public String getFixe() {
        return fixe;
    }

    /**
     *
     * @param fixe
     */
    public void setFixe(String fixe) {
        this.fixe = fixe;
    }

    /**
     *
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     *
     * @return
     */
    public String getNomEntreprise() {
        return nomEntreprise;
    }

    /**
     *
     * @param nomEntreprise
     */
    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Adherent{" + "id=" + id + ", code=" + code + ", codeClient=" + codeClient + ", titre=" + titre + ", nom=" + nom + ", prenom=" + prenom + ", adresse1=" + adresse1 + ", adresse2=" + adresse2 + ", codePostal=" + codePostal + ", commune=" + commune + ", portable=" + portable + ", fixe=" + fixe + ", mail=" + mail + ", nomEntreprise=" + nomEntreprise + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.code);
        hash = 37 * hash + this.codeClient;
        hash = 37 * hash + Objects.hashCode(this.titre);
        hash = 37 * hash + Objects.hashCode(this.nom);
        hash = 37 * hash + Objects.hashCode(this.prenom);
        hash = 37 * hash + Objects.hashCode(this.adresse1);
        hash = 37 * hash + Objects.hashCode(this.adresse2);
        hash = 37 * hash + this.codePostal;
        hash = 37 * hash + Objects.hashCode(this.commune);
        hash = 37 * hash + Objects.hashCode(this.portable);
        hash = 37 * hash + Objects.hashCode(this.fixe);
        hash = 37 * hash + Objects.hashCode(this.mail);
        hash = 37 * hash + Objects.hashCode(this.nomEntreprise);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Adherent other = (Adherent) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.codeClient != other.codeClient) {
            return false;
        }
        if (this.codePostal != other.codePostal) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.adresse1, other.adresse1)) {
            return false;
        }
        if (!Objects.equals(this.adresse2, other.adresse2)) {
            return false;
        }
        if (!Objects.equals(this.commune, other.commune)) {
            return false;
        }
        if (!Objects.equals(this.portable, other.portable)) {
            return false;
        }
        if (!Objects.equals(this.fixe, other.fixe)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        return Objects.equals(this.nomEntreprise, other.nomEntreprise);
    }
    
}
