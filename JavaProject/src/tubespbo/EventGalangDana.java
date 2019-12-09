/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;
import java.util.*;
/**
 *
 * @author IRFAN
 */
public class EventGalangDana {
    private List<Donasi> listDonasi = new ArrayList<>();
    
    public void createDonasi(Donasi d){
        listDonasi.add(d);
    }
    
    public void showDonasi(){
        System.out.println("Data Donasi");
        for(int i = 0; i<listDonasi.size();i++){
            System.out.println(listDonasi.get(i));
        }
    }
    
}





























