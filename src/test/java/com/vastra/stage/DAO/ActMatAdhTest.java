/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vastra.stage.DAO;

import com.vastra.stage.Modele.ActMatAdh;
import java.util.List;

/**
 *
 * @author jessi
 */
public class ActMatAdhTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ActMatAdh act = new ActMatAdh("ABCD", "ABDC", 0, "ABCD", 200, 43);
        
        ActMatAdhService service = new ActMatAdhService();
        
        System.out.println("Create: " + service.create(act));
        
        act = service.findById(174);
        System.out.println("Find by if : " + act.toString() );
        act.setValeurFixe(300);
        System.out.println("modification : " + " " +service.update(act) + " " + service.findById(174).toString() );
        System.out.println("Delete : " + service.delete(act));
        List<ActMatAdh> list = service.findAll();
        for(ActMatAdh a : list){
            System.out.println(a.toString());
        }
        
    }
    
}
