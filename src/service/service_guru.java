/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import java.util.List;
import model.Model_Guru;

/**
 *
 * @author moham
 */
public interface service_guru {
    void tambahData (Model_Guru mogu);
    void updateData (Model_Guru mogu);
    void hapusData (Model_Guru mogu);
    
    Model_Guru getById (String id);
    
    List<Model_Guru> getData();
    List<Model_Guru> getData2();
    
    List<Model_Guru> pencarian(String id);
    List<Model_Guru> pencarian2(String id);
    
    String nomor();
    String nomor2();
}
