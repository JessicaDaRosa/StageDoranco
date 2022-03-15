/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vastra.stage.DAO;

import com.vastra.stage.Modele.Adherent;
import java.util.List;

/**
 *
 * @author jessi
 */
public class AherentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Adherent adh;
        adh = new Adherent("ABCD", 666, "EARL", "da Rosa", "Jean", null, "Longjuemau", 91160, "Essone", null, null, "abcd@free.com", "ABCD");
        
        AdherentService adhS = new AdherentService();
        System.out.println("create : "+adhS.create(adh));
        adh = adhS.findByCode(adh.getCode());
        System.out.println("find by coce: " + adh.toString());
        adh.setFixe("&& && && && &&");
        System.out.println("Find by id "+ adh.getId()+ " : " + adhS.findById(adh.getId()));
        System.out.println("Update : " + adhS.update(adh) + " " + adhS.findById(adh.getId()).toString());
        System.out.println("delete : "+adhS.delete(adh));
        List<Adherent> list = adhS.findAll();
        for(Adherent a : list){
            System.out.println(a.toString() );
        }
        
    }
    
}
