 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vastra.stage.Modele;

import java.util.Objects;

/**
 *
 * @author jessi
 */
public class Materiel {

    private String materiel;
    private String marque;
    private String model;
    private String dateAchat;
    private String code;
    private float prixAchat;
    private int dureeAmortis;
    private float kSocial;
    private int nbAdherents;
    private int engagements;
    private String uniteFacturation;
    private String codeFacturation;

    public String getCodeFacturation() {
        return codeFacturation;
    }

    public void setCodeFacturation(String codeFacturation) {
        this.codeFacturation = codeFacturation;
    }
    

    /**
     *
     * @param materiel
     * @param marque
     * @param model
     * @param dateAchat
     * @param code
     * @param prixAchat
     * @param dureeAmortis
     * @param kSocial
     * @param nbAdherents
     * @param engagements
     * @param UniteFacturation
     */
    public Materiel(String materiel, String marque, String model, String dateAchat, String code, float prixAchat, int dureeAmortis, float kSocial, int nbAdherents, int engagements, String UniteFacturation) {
        this.materiel = materiel;
        this.marque = marque;
        this.model = model;
        this.dateAchat = dateAchat;
        this.code = code;
        this.prixAchat = prixAchat;
        this.dureeAmortis = dureeAmortis;
        this.kSocial = kSocial;
        this.nbAdherents = nbAdherents;
        this.engagements = engagements;
        this.uniteFacturation = UniteFacturation;
    }

    /**
     *
     */
    public Materiel() {
    }

    /**
     *
     * @return
     */
    public String getMateriel() {
        return materiel;
    }

    /**
     *
     * @param materiel
     */
    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }

    /**
     *
     * @return
     */
    public String getMarque() {
        return marque;
    }

    /**
     *
     * @param marque
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     *
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     *
     * @return
     */
    public String getDateAchat() {
        return dateAchat;
    }

    /**
     *
     * @param dateAchat
     */
    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    /**
     *
     * @return
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
     * @return
     */
    public float getPrixAchat() {
        return prixAchat;
    }

    /**
     *
     * @param prixAchat
     */
    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    /**
     *
     * @return
     */
    public int getDureeAmortis() {
        return dureeAmortis;
    }

    /**
     *
     * @param dureeAmortis
     */
    public void setDureeAmortis(int dureeAmortis) {
        this.dureeAmortis = dureeAmortis;
    }

    /**
     *
     * @return
     */
    public float getkSocial() {
        return kSocial;
    }

    /**
     *
     * @param kSocial
     */
    public void setkSocial(float kSocial) {
        this.kSocial = kSocial;
    }

    /**
     *
     * @return
     */
    public int getNbAdherents() {
        return nbAdherents;
    }

    /**
     *
     * @param nbAdherents
     */
    public void setNbAdherents(int nbAdherents) {
        this.nbAdherents = nbAdherents;
    }

    /**
     *
     * @return
     */
    public int getEngagements() {
        return engagements;
    }

    /**
     *
     * @param engagements
     */
    public void setEngagements(int engagements) {
        this.engagements = engagements;
    }

    /**
     *
     * @return
     */
    public String getUniteFacturation() {
        return uniteFacturation;
    }

    /**
     *
     * @param uniteFacturation
     */
    public void setUniteFacturation(String uniteFacturation) {
        this.uniteFacturation = uniteFacturation;
    }

    @Override
    public String toString() {
        return "Materiel{" + "materiel=" + materiel + ", marque=" + marque + ", model=" + model + ", dateAchat=" + dateAchat + ", code=" + code + ", prixAchat=" + prixAchat + ", dureeAmortis=" + dureeAmortis + ", kSocial=" + kSocial + ", nbAdherents=" + nbAdherents + ", engagements=" + engagements + ", uniteFacturation=" + uniteFacturation + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.materiel);
        hash = 79 * hash + Objects.hashCode(this.marque);
        hash = 79 * hash + Objects.hashCode(this.model);
        hash = 79 * hash + Objects.hashCode(this.dateAchat);
        hash = 79 * hash + Objects.hashCode(this.code);
        hash = 79 * hash + Float.floatToIntBits(this.prixAchat);
        hash = 79 * hash + this.dureeAmortis;
        hash = 79 * hash + Float.floatToIntBits(this.kSocial);
        hash = 79 * hash + this.nbAdherents;
        hash = 79 * hash + this.engagements;
        hash = 79 * hash + Objects.hashCode(this.uniteFacturation);
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
        final Materiel other = (Materiel) obj;
        if (Float.floatToIntBits(this.prixAchat) != Float.floatToIntBits(other.prixAchat)) {
            return false;
        }
        if (this.dureeAmortis != other.dureeAmortis) {
            return false;
        }
        if (Float.floatToIntBits(this.kSocial) != Float.floatToIntBits(other.kSocial)) {
            return false;
        }
        if (this.nbAdherents != other.nbAdherents) {
            return false;
        }
        if (this.engagements != other.engagements) {
            return false;
        }
        if (!Objects.equals(this.materiel, other.materiel)) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.dateAchat, other.dateAchat)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return Objects.equals(this.uniteFacturation, other.uniteFacturation);
    }

}
