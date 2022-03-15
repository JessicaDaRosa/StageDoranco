/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vastra.stage.DAO;

import java.util.List;

/**
 *
 * @author jessi
 */

public interface IDao <T> {
    boolean create (T personne);
    boolean delete (T personne);
    boolean update (T personne);
    T findById(int id);
    List<T> findAll();
}