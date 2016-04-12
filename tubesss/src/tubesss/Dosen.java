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
public class Dosen extends Orang {

    
    public Dosen (String nama, String id) {
        super(nama,id);
    }

    public void setNama (String nama) {
        this.nama = nama;
    }
    
    @Override
    public void setId (String id) {
        this.id = id;
    }
    
    @Override
    public String getNama () {
        return nama;
    }
    
    public String getId () {
        return id;
    }
}