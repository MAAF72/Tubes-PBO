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
public class Donasi {
    private String nama;
    private Donatur donatur[] = new Donatur[10];
    private Penerima penerima[] = new Penerima[10];
    private int jumDonatur = 0;
    private int jumPenerima = 0;
    
    public Donasi(String nama) {
        this.nama = nama;
        donatur = new Donatur[5];
        penerima = new Penerima[1];
    }
    
    public String getNama() {
        return nama;
    }
    
    public void addDonatur(Donatur d){
        donatur[jumDonatur] = d;
        jumDonatur++;
    }
    
    public void addPenerima(Penerima p){
        penerima[jumPenerima] = p;
        jumPenerima++;
    }
    
    public void showDonatur(){
        System.out.println("Data Donatur");
        for(int i = 0; i<jumDonatur; i++){
            System.out.println("Nama            : "+donatur[i].getNama());
            System.out.println("Email           : "+donatur[i].getEmail());
            System.out.println("Nomor HP        : "+donatur[i].getNoHP());
            System.out.println("Jumlah Uang     : "+donatur[i].getJumUang());
            System.out.println("");
        }
    }
    
    public void showPenerima(){
        System.out.println("Data Penerima");
        for(int i = 0; i<jumPenerima; i++){
            System.out.println("Nama            : "+penerima[i].getNama());
        }
        System.out.println("");
    }
}










































































