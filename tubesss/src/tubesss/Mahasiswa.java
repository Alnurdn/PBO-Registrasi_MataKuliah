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
public class Mahasiswa extends Orang {
    private final Kelas[] pilihan;
    private int nKelas;
    private final int maxKelas;
    
    public Mahasiswa (String nama, Long id) {
        super(nama,id);
        this.maxKelas = 10;
        this.nKelas = 0;
        pilihan = new Kelas[10];
    }
    
    public void tambahKelas (Kelas k) {
       for(int i=0;i<10;i++) {
        if(pilihan[i]!=null) {
            i++;
        } else {
            this.pilihan[nKelas] = k;
            nKelas++;
           }
       }
    }
    
    public void kurangKelas(Kelas id) {
       for (int i=0;i<10;i++) {
        if (pilihan[i]!=null) {
           this.pilihan[nKelas] = id;
        nKelas--;
        i--;
        }
        }
    }
    
}