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
public class Personal extends Penerima {
    private String nama;
    private Personal[] personal;
    private int jumPersonal;
    
    public Personal(String nama){
        super(nama);
    }
    
    public void createPenerima(Personal p){
        personal[jumPersonal] = p;
        jumPersonal++;
    }
    
    public void showPenerima(){
        for(int i = 0; i<jumPersonal; i++){
            System.out.println(personal[i]);
        }
    }
}























