
package csigaverseny;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class JatekTer {
    private int tipp;
    private int korSzamolo;
    
    static Scanner sc = new Scanner(System.in);

  
    
    public void start(){
        
        
        
        System.out.println("Hany koros legyen?");
        int korMegadas = sc.nextInt();
        setKorSzamolo(korMegadas);
        System.out.println("Adjon meg tippet melyik nyer: (Piros: 1, Kek: 2, Zold: 3)");
        int tippeles = sc.nextInt();
        setTipp(tippeles);
        mozgas();
        
    }
    
    public boolean csigaGyorsit(){
        boolean gyorsito = false;
        
        return gyorsito;
    }
    public void mozgas(){
        //Peldanyositas
        Csiga cs1 = new Csiga();
        Csiga cs2 = new Csiga();
        Csiga cs3 = new Csiga();
        
        // Setter ertekek megadasa
        cs1.setCsigaSzin("Piros");
        cs1.setCsigaVersenyzo(1);
        cs1.setOsszlepes(3);
        cs2.setCsigaSzin("Kek");
        cs2.setCsigaVersenyzo(2);
        cs2.setOsszlepes(3);
        cs3.setCsigaSzin("Zold");
        cs3.setCsigaVersenyzo(3);
        cs3.setOsszlepes(3);
        
        
        Random rnd = new Random();
        for (int i = 0; i < getKorSzamolo(); i++) {
             
            cs1.setLepes(tipp);
        }
    }
    
    

    public void setTipp(int tipp) {
        this.tipp = tipp;
    }

    public void setKorSzamolo(int korSzamolo) {
        this.korSzamolo = korSzamolo;
    }

    public int getTipp() {
        return tipp;
    }

    public int getKorSzamolo() {
        return korSzamolo;
    }
    
    
    
}
