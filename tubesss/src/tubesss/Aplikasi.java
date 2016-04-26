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
    private String nama;
    private String id;
    private Kelas daftarKelas;
    private int nKelas = 0;
    private int maxKelas = 20;
    private ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();    
    final private int maxDosen = 100;
    final private int maxMahasiswa = 300;
    private int nMahasiswa = 0;
    private int nDosen = 0;
    private int nMataKuliah = 0;
    private int maxMataKuliah = 50;
    Scanner scan = new Scanner(System.in);
    
 
    public void addDosen (Dosen Dsn) {
        daftarDosen.add(Dsn);
    }
   
    public void addMahasiswa (Mahasiswa Mhs) {
        if (nMahasiswa < maxMahasiswa){
	daftarMahasiswa.add(Mhs);
        nMahasiswa++;
        } 
    }
    
    public void addKelas(Kelas K) {
        nKelas++;
    }

    public void addMataKuliah (MataKuliah mk) {
        if (nMataKuliah < maxMataKuliah) {
            daftarMataKuliah.add(mk);
            nMataKuliah++;
        }
    }
    
   
    public void deleteDosen (int id) {
		boolean found = false;
		for(int i= 0; i<nDosen; i++){
			if (daftarDosen.get(i).getId() == id){
                            found = true;
                            daftarDosen.remove(i);
                            nDosen--;
                            break;
                        } else {
                        }
		}
	}

    
    public void deleteMahasiswa (int id) {
		boolean found = false;
		for(int i= 0; i<nDosen; i++){
			if (daftarMahasiswa.get(i).getId() == id){
                            found = true;
                            daftarMahasiswa.remove(i);
                            nMahasiswa--;
                            break;
                        } else {
                        }
		}
    }
    
    public void deleteMataKuliah (String mk) {
        boolean found = false;
        for (int i=0; i< maxMataKuliah;i++) {
            if (daftarMataKuliah.get(i).getNamaMK().equals(mk)) {
                found = true;
                daftarMataKuliah.remove(i);
                nMataKuliah--;
                break;
        }
    }
    }
    
        public void deleteKelas (int kelas) {
            boolean found = false;
            for (int i=0; i<maxKelas;i++) {
                if (i == kelas) {
                    found = true;
                    nKelas--;
                }
            }
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
        nama = scan.next();
        System.out.println("Pass / Id    : ");
        id = scan.next();
        if (nama.equals("admin") && id.equals("admin")) {
            this.menuAdmin();
        } else {
            System.out.println("akun yang anda masukan Salah atau tidak terdaftar");
        }
    }

    public void loginMhs () {
        boolean cek = false;
        System.out.println("Nama : ");
        nama = scan.next();
        System.out.println("Pass / id : ");
        id = scan.next();
        if ((nama!="admin") && (id!="admin")) {
            menuMhs();
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
                    menuMataKuliah();
                } catch (Exception e) {
                    System.out.println("Data gagal ditambahkan");
                }
                break;
            case 2:
                System.out.println("Masukan nama MK yang ingin di hapus: ");
                String Mknama = scan.next();
                for (int i=0; i <maxMataKuliah;i++) {
                    if (Mknama.equals(getDaftarMataKuliah(i).getNamaMK())) {
                        deleteMataKuliah(nama);
                    }
                }
                menuMataKuliah();
                break;
            case 3:
                for (int i=0; i<nMataKuliah; i++) {
                    System.out.println("MataKuliah "+getDaftarMataKuliah(i).getNamaMK());
                    System.out.println("Sks "+getDaftarMataKuliah(i).getSks());
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
        System.out.println("1. Cari Kelas");
        System.out.println("2. Add");
        System.out.println("3. Remove");
        System.out.println("4. view");
        System.out.println("5. Kembali ke menu Utama");
        System.out.println("6. Keluar");
        System.out.println("Masukan Pilihan: ");
        int pmenuKelas = scan.nextInt();
        switch (pmenuKelas) {
            case 1:
                System.out.println("Masukan Kelas Yang dicari : IF ");
                int carikelas = scan.nextInt();
                for (int i=0; i<maxKelas;i++) {
                    if (carikelas < nKelas) {
                        System.out.println("MataKuliah : "+getDaftarMataKuliah(i).getNamaMK());
                        System.out.println("sks : "+getDaftarMataKuliah(i).getSks());
                    }
                }
            case 2:
                System.out.println("Kelas : ");
                String kelas = scan.next();
                System.out.println("Nama MataKuliah : ");
                int mk = scan.nextInt();
                System.out.println("Jadwal MataKuliah : ");
                int jadwal = scan.nextInt();
                addKelas(daftarKelas);
                menuKelas();
                break;
            case 3:
                System.out.println("Masukan Kelas yang ingin di hapus: ");
                String cariKelas = scan.next();
                deleteKelas(nKelas);
                menuKelas();
                break;
            case 4:
                System.out.println("View Kelas");
                System.out.println("Kelas IF");
                break;
            case 5:
                mainMenu();
                break;
            case 6:
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
                String namaDsn = scan.next();
                System.out.println("NIP : ");
                int nip = scan.nextInt(); 
                addDosen(new Dosen(nama,nip));
                menuDosen();
                break;
            case 2:
                System.out.println("Masukan id Dosen yang ingin di hapus: ");
                int idDsn = scan.nextInt();
                searchDosen(idDsn);
                deleteDosen(idDsn);
                menuDosen();
                break;
            case 3:
                System.out.println("Data Dosen");
                for (int i=0; i< maxDosen;i++) {
                    System.out.println("Nama Dosen : "+getDaftarDosen(i).getNama());
                    System.out.println("ID Dosen : "+getDaftarDosen(i).getId());
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
    
//        public void menuEditMahasiswa () {
//        System.out.println("Menu Mahasiswa ");
//        System.out.println("-----------------");
//        System.out.println("1. C");
//        System.out.println("2. Remove");
//        System.out.println("3. view");
//        System.out.println("4. Kembali ke menu Utama");
//        System.out.println("5. Keluar");
//        System.out.println("Masukan Pilihan: ");
//        int pmenuMhs = scan.nextInt();
//        switch (pmenuMhs) {
//            case 1:
//                System.out.println("Nama Mahasiswa : ");
//                String nama = scan.next();
//                System.out.println("NIM : ");
//                int nim = scan.nextInt(); 
//                addMahasiswa(new Mahasiswa(nama,nim));
//                break;
//            case 2:
//                System.out.println("Masukan nama Mahasiwa yang ingin di hapus: ");
//                String cMK = scan.next();
//               
//                break;
//            case 3:
//                System.out.println("Data Mahasiswa");
//                for (Dosen D : dosen) {
//                    System.out.println("NIP Mahasiswa : "+getDaftarMataKuliah(nim));
//                }
//                break;
//            case 4:
//                mainMenu();
//                break;
//            case 5:
//                System.exit(0);
//                break;
//        }
//    }
     
    public void menuAdmin() {
        System.out.println(" ======================");
        System.out.println("      MENU ADMIN      ");
        System.out.println(" ======================");
        System.out.println("1. Kelola MataKuliah    |");
        System.out.println("2. Kelola Kelas ");
        System.out.println("3. Kelola Dosen ");
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
            case 8:
                mainMenu();
                break;
            case 9:
                System.exit(0);
        }
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
        int pmenuMhs = scan.nextInt();
        switch (pmenuMhs) {
            case 1:
                System.out.println("Kelas : IF ");
                int namaKelas = scan.nextInt();
                System.out.println("MataKuliah : ");
                String namaMk = scan.next();
                try {
                   if (namaMk.equals(getDaftarMataKuliah(nKelas).getNamaMK())) {
                    this.addMataKuliah(new MataKuliah(namaMk));
                    addKelas(daftarKelas);
                   }
                    System.out.println("Data sukses ditambahkan");
                } catch (Exception e) {
                    System.out.println("Data gagal ditambahkan");
                }
                break;
            case 2:
                deleteMahasiswa(nKelas);
                break;
            case 3:
                    System.out.println("Nama : "+nama);
                    System.out.println("Id   : "+id);
                    System.out.println("Kelas :"+nKelas);
                    for (int i=0; i< nMataKuliah;i++) {
                        System.out.println("MataKuliah : "+getDaftarMataKuliah(i).getNamaMK());
                        System.out.println("sks : "+getDaftarMataKuliah(i).getSks());
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

