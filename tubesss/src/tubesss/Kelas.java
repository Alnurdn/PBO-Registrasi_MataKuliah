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


public class Kelas {
    private MataKuliah matakuliah;
    private Dosen dosen;
    private int jadwal;
    private String namaKelas;
    private int maxMahasiswa;
    
    public Kelas (MataKuliah matakuliah, Dosen dosen,int jadwal) {
        this.matakuliah = matakuliah;
        this.jadwal = jadwal;
        this.dosen = dosen;
    }
    
    public void setDosen (Dosen D) {
       this.dosen = D;
    }
    public Dosen getDosen () {
        return dosen;
    }
    
    public void setMataKuliah (MataKuliah Mk) {
        this.matakuliah = Mk;
    }
    
    public MataKuliah getMataKuliah() {
        return matakuliah;
    }

    public void setJadwal(int jadwal) {
        this.jadwal = jadwal;
    }

    public int getJadwal() {
        return jadwal;
    }
}