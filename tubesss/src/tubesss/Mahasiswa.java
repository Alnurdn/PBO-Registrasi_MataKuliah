/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesss;

/**
 *
 * @author ANZYM
 */

import java.util.*;

public class Mahasiswa extends Orang {
    private ArrayList<Kelas> listKelas = new ArrayList<>();
    private int nKelas;
    private final int maxKelas;
    
    public Mahasiswa (String nama, String id) {
        super(nama,id);
        this.maxKelas = 10;
        this.nKelas = 0;
    }
        
    public void addKelas (Kelas k) {
        listKelas.add(k);
    }
    
    public void removeKelas(Kelas id) {
        listKelas.remove(id);
    }
}