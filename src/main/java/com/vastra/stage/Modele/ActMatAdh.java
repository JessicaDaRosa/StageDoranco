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
public class ActMatAdh {
    private int id;
    private String codeMatos;
    private String descriptionMateriel;
    private String codeFacturation;
    private float valeurFixe;
    private String codeAdherent;
    private float pf;
    private float unite;

    public ActMatAdh(String codeMatos, String codeFacturation, float valeurFixe, String codeAdherent, float pf, float unite) {
        this.codeMatos = codeMatos;
        this.codeFacturation = codeFacturation;
        this.valeurFixe = valeurFixe;
        this.codeAdherent = codeAdherent;
        this.pf = pf;
        this.unite = unite;
    }
    
    
    public ActMatAdh() {
    }
    
    public float getUnite() {
        return unite;
    }

    public void setUnite(float unite) {
        this.unite = unite;
    }

    public String getCodeMatos() {
        return codeMatos;
    }

    public void setCodeMatos(String codeMatos) {
        this.codeMatos = codeMatos;
    }

    public String getCodeFacturation() {
        return codeFacturation;
    }

    public void setCodeFacturation(String codeFacturation) {
        this.codeFacturation = codeFacturation;
    }

    public float getValeurFixe() {
        return valeurFixe;
    }

    public void setValeurFixe(float valeurFixe) {
        this.valeurFixe = valeurFixe;
    }

    public String getCodeAdherent() {
        return codeAdherent;
    }

    public void setCodeAdherent(String codeAdherent) {
        this.codeAdherent = codeAdherent;
    }

    public float getPf() {
        return pf;
    }

    public void setPf(float pf) {
        this.pf = pf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ActMatAdh{" + "id=" + id + ", codeMatos=" + codeMatos + ", codeFacturation=" + codeFacturation + ", valeurFixe=" + valeurFixe + ", codeAdherent=" + codeAdherent + ", pf=" + pf + ", unite=" + unite + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.codeMatos);
        hash = 97 * hash + Objects.hashCode(this.codeFacturation);
        hash = 97 * hash + Float.floatToIntBits(this.valeurFixe);
        hash = 97 * hash + Objects.hashCode(this.codeAdherent);
        hash = 97 * hash + Float.floatToIntBits(this.pf);
        hash = 97 * hash + Float.floatToIntBits(this.unite);
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
        final ActMatAdh other = (ActMatAdh) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.valeurFixe) != Float.floatToIntBits(other.valeurFixe)) {
            return false;
        }
        if (Float.floatToIntBits(this.pf) != Float.floatToIntBits(other.pf)) {
            return false;
        }
        if (Float.floatToIntBits(this.unite) != Float.floatToIntBits(other.unite)) {
            return false;
        }
        if (!Objects.equals(this.codeMatos, other.codeMatos)) {
            return false;
        }
        if (!Objects.equals(this.codeFacturation, other.codeFacturation)) {
            return false;
        }
        return Objects.equals(this.codeAdherent, other.codeAdherent);
    }

    public String getDescriptionMateriel() {
        return descriptionMateriel;
    }

    public void setDescriptionMateriel(String descriptionMateriel) {
        this.descriptionMateriel = descriptionMateriel;
    }
    
    
            
}
