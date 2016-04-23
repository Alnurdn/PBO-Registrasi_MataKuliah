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
    private int nKelas;
    private ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();    
    final private int maxDosen = 100;
    final private int maxMahasiswa = 300;
    private int nMahasiswa = 0;
    Scanner scan = new Scanner(System.in);
 
    public void addDosen (Dosen Dsn) {
        daftarDosen.add(Dsn);
    }
   
    public void addMahasiswa (Mahasiswa Mhs) {
           daftarMahasiswa.add(Mhs);
    }

    public void addMataKuliah (MataKuliah MK) {
        daftarMataKuliah.add(MK);
    }
    
    public void addKelas () {
       nKelas++;
    }
   
    public void removeDosen (Dosen Dsn) {
        daftarDosen.remove(Dsn);
    }
    
    public void removeMahasiswa (Mahasiswa Mhs) {
        daftarDosen.remove(Mhs);
    }
    
    public void removeMataKuliah (MataKuliah Mk) {
        daftarMataKuliah.remove(Mk);
    }
    
    public void removeKelas () {
        nKelas--;
    }
    
    public Mahasiswa getMahasiswa (int id) {
        return daftarMahasiswa.get(id);
    }

    public MataKuliah getDaftarMataKuliah(int mk) {
        return daftarMataKuliah.get(mk);
    }
    public Dosen getDaftarDosen (int D) {
        return daftarDosen.get(D);
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
    
    public MataKuliah searchMataKuliah (int id) {
        return daftarMataKuliah.get(id);
    }

    public void mainMenu() {
        System.out.println("=== SELAMAT DATANG DI APLIKASI REGISTRASI MATAKULIAH ===\n");
        System.out.println("Silahkan Login menurut Akun yang ada miliki");
        System.out.println("");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukan menu : ");
        int pilihmenu = scan.nextInt();
        switch (pilihmenu) {
            case 1:
                loginAdmin();
                break;
            case 2:
                loginMhs();
                break;
        }
    }
        
    public void loginAdmin() {
        System.out.println("Nama        : ");
        String nama = scan.next();
        System.out.println("Pass / Id    : ");
        String id = scan.next();
        if (nama.equals("admin") && id.equals("admin")) {
            this.menuAdmin();
        } else {
            System.out.println("akun yang anda masukan Salah atau tidak terdaftar");
        }
    }

    public void loginMhs () {
        boolean cek = false;
        Pelanggan p = null;
        System.out.println("Nama : ");
        String nama = in.next();
        System.out.println("Pass / id : ");
        String id = in.next();
        if ((nama!="admin") && (id!=admin)) {
            menuMhs();
        }   
    public void menuMhs() {
        System.out.println(" ======================");
        System.out.println("      MENU MAHASISWA      ");
        System.out.println(" ======================");
        System.out.println("1. ADD Kelas ");
        System.out.println("2. REMOVE Kelas");
        System.out.println("3. VIEW Kelas");
        System.out.println("4. Logout ");
        System.out.println("5. Exit  ");
        System.out.println(" ======================");
        System.out.print("   Masukkan Pilihan :  ");
        int pmenuadmin = scan.nextInt();
        switch (pmenuadmin) {
            case 1:
                System.out.println("Kelas : ");
                int namaKelas = scan.next();
                System.out.println("MataKuliah : ");
                String namaMk = scan.next();
                try {
                    this.addMataKuliah(new MataKuliah(namaMk,sks));
                    System.out.println("Data sukses ditambahkan");
                } catch (Exception e) {
                    System.out.println("Data gagal ditambahkan");
                }
                break;
            case 2:
                removeKelas();
                break;
            case 3:
                System.out.println("Mata Kuliah" +daftarKelas.getMataKuliah());
                System.out.println("Jadwal "+daftarKelas.getJadwal());
                break;
            case 4:
                menuMahasiswa();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    
    public void menuAdmin() {
        System.out.println(" ======================");
        System.out.println("      MENU ADMIN      ");
        System.out.println(" ======================");
        System.out.println("1. Kelola MataKuliah    |");
        System.out.println("2. Kelola Kelas ");
        System.out.println("3. Kelola Dosen ");
        System.out.println("4. Kelola Mahasiswa ");
        System.out.println("8. Logout ");
        System.out.println("9. Exit  ");
        System.out.println(" ======================");
        System.out.print("   Masukkan Pilihan :  ");
        int pmenuadmin = scan.nextInt();
        switch (pmenuadmin) {
            case 1:
                menuMataKuliah();
                break;
            case 2:
                menuKelas();
                break;
            case 3:
                menuDosen();
                break;
            case 4:
                menuMahasiswa();
                break;
        }
        
    }
    public void menuMataKuliah() {
        System.out.println("Menu MataKuliah ");
        System.out.println("-----------------");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. view");
        System.out.println("4. Kembali ke menu Utama");
        System.out.println("5. Keluar");
        System.out.println("Masukan Pilihan: ");
        int pmenuMataKuliah = scan.nextInt();
        switch (pmenuMataKuliah) {
            case 1:
                System.out.println("Nama MataKuliah : ");
                String namaMk = scan.next();
                System.out.println("jumlah sks : ");
                int sks = scan.nextInt();
                try {
                    this.addMataKuliah(new MataKuliah(namaMk,sks));
                    System.out.println("Data sukses ditambahkan");
                } catch (Exception e) {
                    System.out.println("Data gagal ditambahkan");
                }
                break;
            case 2:
                System.out.println("Masukan nama MK yang ingin di hapus: ");
                String cMK = scan.next();
                if (cMK == searchMataKuliah(sks)) {
                    
                }
                break;
            case 3:
                System.out.println("Data MataKuliah");
                for (MataKuliah mk : matakuliah) {
                    System.out.println("Nama MataKuliah : "+getDaftarMataKuliah());
                    getDaftarMataKuliah(sks);
                }
                break;
            case 4:
                mainMenu();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    
    public void menuKelas () {
        System.out.println("Menu Kelas ");
        System.out.println("-----------------");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. view");
        System.out.println("4. Kembali ke menu Utama");
        System.out.println("5. Keluar");
        System.out.println("Masukan Pilihan: ");
        int pmenuKelas = scan.nextInt();
        switch (pmenuKelas) {
            case 1:
                System.out.println("Kelas : ");
                String kelas = scan.next();
                System.out.println("Nama MataKuliah : ");
                int mk = scan.nextInt();
                System.out.println("Jadwal MataKuliah : ");
                int jadwal = scan.nextInt(); 
                addKelas();
                break;
            case 2:
                System.out.println("Masukan nama MK yang ingin di hapus: ");
                String cMK = scan.next();
                if (cMK == searchMataKuliah(sks)) {
                    
                }
                break;
            case 3:
                System.out.println("Data MataKuliah");
                for (MataKuliah mk : matakuliah) {
                    System.out.println("Nama MataKuliah : "+getDaftarMataKuliah());
                    getDaftarMataKuliah(sks);
                }
                break;
            case 4:
                mainMenu();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    public void menuDosen () {
        System.out.println("Menu Dosen ");
        System.out.println("-----------------");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. view");
        System.out.println("4. Kembali ke menu Utama");
        System.out.println("5. Keluar");
        System.out.println("Masukan Pilihan: ");
        int pmenuDosen = scan.nextInt();
        switch (pmenuDosen) {
            case 1:
                System.out.println("Nama Dosen : ");
                String nama = scan.next();
                System.out.println("NIP : ");
                int nip = scan.nextInt(); 
                addDosen(new Dosen(nama,nip));
                break;
            case 2:
                System.out.println("Masukan nama Dosen yang ingin di hapus: ");
                String cMK = scan.next();
                for (Dosen D : dosen) {
                    removeDosen(D);
                }
                break;
            case 3:
                System.out.println("Data MataKuliah");
                for (Dosen D : dosen) {
                    System.out.println("NIP Dosen : "+getDaftarDosen(D));
                    getDaftarMataKuliah(sks);
                }
                break;
            case 4:
                mainMenu();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    
        public void menuMahasiswa () {
        System.out.println("Menu Mahasiswa ");
        System.out.println("-----------------");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. view");
        System.out.println("4. Kembali ke menu Utama");
        System.out.println("5. Keluar");
        System.out.println("Masukan Pilihan: ");
        int pmenuMhs = scan.nextInt();
        switch (pmenuMhs) {
            case 1:
                System.out.println("Nama Mahasiswa : ");
                String nama = scan.next();
                System.out.println("NIM : ");
                int nim = scan.nextInt(); 
                addMahasiswa(new Mahasiswa(nama,nim));
                break;
            case 2:
                System.out.println("Masukan nama Mahasiwa yang ingin di hapus: ");
                String cMK = scan.next();
                for (Dosen D : dosen) {
                    removeDosen(D);
                }
                break;
            case 3:
                System.out.println("Data Mahasiswa");
                for (Dosen D : dosen) {
                    System.out.println("NIP Mahasiswa : "+getDaftarMataKuliah(nim));
                }
                break;
            case 4:
                mainMenu();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
        
}
