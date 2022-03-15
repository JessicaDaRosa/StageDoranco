/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vastra.stage.DAO;

import com.vastra.stage.Modele.Materiel;

/**
 *
 * @author jessi
 */
public class MaterielTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaterielService matS = new MaterielService();
        Materiel m = matS.findByCode("mas");
        System.out.println(m.toString());
        m.setModel("kasjdh");
        System.out.println(matS.update(m));
        Materiel n = matS.findByCode(m.getCode());
        System.out.println(n.toString());
        //System.out.println(matS.delete(m));
        
        }
    
}
