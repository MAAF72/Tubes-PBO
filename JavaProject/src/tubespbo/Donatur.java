/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author IRFAN
 */
public class Donatur {
    private String nama;
    private String email;
    private String noHP;
    private int jumUang;
    
    public Donatur(String nama, String email, String noHP, int jumUang) {
        this.nama = nama;
        this.email = email;
        this.noHP = noHP;
        this.jumUang = jumUang;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNoHP() {
        return noHP;
    }

    public int getJumUang() {
        return jumUang;
    }

}














