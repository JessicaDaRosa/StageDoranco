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
public class Engagement {
    private int id;
    private String idMateriel;
    private String codeAdherent;
    private int pf;
    private String volume;
    private String descriptionMateriel;

    public String getDescriptionMateriel() {
        return descriptionMateriel;
    }

    public void setDescriptionMateriel(String descriptionMateriel) {
        this.descriptionMateriel = descriptionMateriel;
    }
    

    /**
     *
     * @param idMateriel
     * @param codeAdherent
     * @param pf
     * @param volume
     */
    public Engagement(String idMateriel, String codeAdherent, int pf, String volume) {
        this.idMateriel = idMateriel;
        this.codeAdherent = codeAdherent;
        this.pf = pf;
        this.volume = volume;
    }
    
    /**
     *
     */
    public Engagement() {
    }
    /**
     * 
     * @param id
     * @param idMateriel
     * @param codeAdherent
     * @param pf
     * @param volume 
     */
    public Engagement(int id, String idMateriel, String codeAdherent, int pf, String volume) {
        this.id = id;
        this.idMateriel = idMateriel;
        this.codeAdherent = codeAdherent;
        this.pf = pf;
        this.volume = volume;
    }
    
    /**
     *
     * @return
     */
    public String getIdMateriel() {
        return idMateriel;
    }

    /**
     *
     * @param idMateriel
     */
    public void setIdMateriel(String idMateriel) {
        this.idMateriel = idMateriel;
    }

    /**
     *
     * @return
     */
    public String getCodeAdherent() {
        return codeAdherent;
    }

    /**
     *
     * @param codeAdherent
     */
    public void setCodeAdherent(String codeAdherent) {
        this.codeAdherent = codeAdherent;
    }

    /**
     *
     * @return
     */
    public int getPf() {
        return pf;
    }

    /**
     *
     * @param pf
     */
    public void setPf(int pf) {
        this.pf = pf;
    }

    /**
     *
     * @return
     */
    public String getVolume() {
        return volume;
    }

    /**
     *
     * @param volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
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
        return "Engagement{" + "id=" + id + ", idMateriel=" + idMateriel + ", codeAdherent=" + codeAdherent + ", pf=" + pf + ", volume=" + volume + ", descriptionMateriel=" + descriptionMateriel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.idMateriel);
        hash = 83 * hash + Objects.hashCode(this.codeAdherent);
        hash = 83 * hash + this.pf;
        hash = 83 * hash + Objects.hashCode(this.volume);
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
        final Engagement other = (Engagement) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.pf != other.pf) {
            return false;
        }
        if (!Objects.equals(this.idMateriel, other.idMateriel)) {
            return false;
        }
        if (!Objects.equals(this.codeAdherent, other.codeAdherent)) {
            return false;
        }
        return Objects.equals(this.volume, other.volume);
    }
    
    
}
