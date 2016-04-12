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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Aplikasi {
    private ArrayList<Dosen> daftarDosen = new ArrayList<>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private Kelas daftarKelas;
    private ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();    
    private int nDosen = 0;
    final private int maxDosen = 100;
    final private int maxMahasiswa = 300;
    private int nMahasiswa = 0;
 
    public void addDosen (Dosen Dsn) {
        daftarDosen.add(Dsn);
    }
   
    public void addMahasiswa (Mahasiswa Mhs) {
           daftarMahasiswa.add(Mhs);
    }
    
    public Mahasiswa getMahasiswa (int id) {
        return daftarMahasiswa.get(id);
    }
    
    public void deleteMahasiswa (int id) {
        daftarMahasiswa.remove(id);
    }    
    
    public Mahasiswa searchMahasiswa (int id) {
        return daftarMahasiswa.get(id);
    }
    
    public Dosen searchDosen (int id) {
        return daftarDosen.get(id);
    }

}
