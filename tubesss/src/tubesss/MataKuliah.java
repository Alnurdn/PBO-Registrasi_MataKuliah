/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesss;

/**
 *
 * @author Rizaldi
 */
public class MataKuliah {
    private String namaMK;
    private int sks;
    protected int maxMk = 10;
    
    public MataKuliah (String namaMK, int sks) {
        this.namaMK = namaMK;
        this.sks = sks;
    }
    
    public void setNamaMK (String namaMK) {
        this.namaMK = namaMK;
    }
    
    public void setSks (int sks) {
        this.sks = sks;
    }
    
    public int getSks() {
        return sks;
    }
    
    public String getNamaMK() {
        return namaMK;
    }
}