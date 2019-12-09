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
public class PenggalangDana {
    private List<EventGalangDana> listEvent;
    
    public void createEvent(EventGalangDana e){
        listEvent.add(e);
    }
    
    public void showEvent(){
        System.out.println("Data Event");
        for(int i = 0; i < listEvent.size(); i++){
            System.out.println(listEvent.get(i));
        }
    }
}









