/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vastra.stage.DAO;

import com.vastra.stage.Modele.Engagement;
import java.util.List;

/**
 *
 * @author jessi
 */
public class EngagementTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Engagement eng = new Engagement("ABCD", "ABCD", 300, "HA");
        EngagementService engS = new EngagementService();
        System.out.println(engS.create(eng));
        eng = engS.findByCodes(eng.getIdMateriel(), eng.getCodeAdherent());
        System.out.println(eng.toString());
//        List<Engagement> list = engS.findAll();
//        for(Engagement e : list){
//            System.out.println(e.toString());
//        }
        eng.setIdMateriel("1123");
        System.out.println(eng.toString());
        System.out.println(engS.delete(eng));
    }
    
}
