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
public class Lembaga extends Penerima{
    private Lembaga[] lembaga;
    private int jumLembaga;
    
    public Lembaga(String nama){
        super(nama);
    }
    
    public void createPenerima(Lembaga l){
        lembaga[jumLembaga] = l;
        jumLembaga++;
    }
    
    public void showPenerima(){
        for(int i = 0; i<jumLembaga; i++){
            System.out.println(lembaga[i]);
        }
    }
}














