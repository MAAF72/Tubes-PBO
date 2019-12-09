/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Altair
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Donatur dntr1 = new Donatur("Irfan","irfang@gmail.com","081234568910",100000);
        Donatur dntr2 = new Donatur("Fatih","maaf@gmail.com","081234568910",50000);
        Donatur dntr3 = new Donatur("Yudhis","lyudhistira@gmail.com","081234568910",75000);
        Personal pnrm1 = new Personal("Anas");
        Lembaga pnrm2 = new Lembaga("Lembaga A");
        Donasi dns1 = new Donasi("Donasi 1");
        Donasi dns2 = new Donasi("Donasi 2");
        EventGalangDana ev1 = new EventGalangDana();
        //add
        dns1.addDonatur(dntr1);
        dns1.addDonatur(dntr2);
        dns2.addDonatur(dntr3);
        dns1.addPenerima(pnrm1);
        dns2.addPenerima(pnrm2);
        ev1.createDonasi(dns1);
        ev1.createDonasi(dns2);
        //show
        dns1.showDonatur();
        dns1.showPenerima();
        dns2.showDonatur();
        dns2.showPenerima();
        ev1.showDonasi();
    }
    
}




































