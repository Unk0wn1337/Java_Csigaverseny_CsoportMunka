
package csigaverseny;

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
        
        int csigaLepesSzamlalo1 = 0;
        int csigaLepesSzamlalo2 = 0;
        int csigaLepesSzamlalo3 = 0;
        
        Random rnd = new Random();
        for (int i = 1; i < getKorSzamolo()+1; i++) {
            cs1.setLepes(rnd.nextInt(3));
            cs2.setLepes(rnd.nextInt(3));
            cs3.setLepes(rnd.nextInt(3));
            
            csigaLepesSzamlalo1 += cs1.getLepes();
            csigaLepesSzamlalo2 += cs2.getLepes();
            csigaLepesSzamlalo3 += cs3.getLepes();
        
            System.out.println(cs1.getCsigaSzin()+" ("+cs1.getCsigaVersenyzo()+"-es versenyo) "+cs1.getLepes());
            System.out.println(cs2.getCsigaSzin()+" ("+cs2.getCsigaVersenyzo()+"-es versenyo) "+cs2.getLepes());
            System.out.println(cs3.getCsigaSzin()+" ("+cs3.getCsigaVersenyzo()+"-asversenyzo) "+cs3.getLepes());
            System.out.println("------------ Kor: "+i+" ------------");
        }
        
        if(csigaLepesSzamlalo1 > csigaLepesSzamlalo2 && csigaLepesSzamlalo1 > csigaLepesSzamlalo3){
            System.out.println("Piros csiga nyert, lepes szama:"+csigaLepesSzamlalo1);
            if(getTipp() == cs1.getCsigaVersenyzo()){
                System.out.println("Nyertel 🍺");
            } else {
                System.out.println("Te semmit nem nyertel");
            }
        } else if(csigaLepesSzamlalo2 > csigaLepesSzamlalo1 && csigaLepesSzamlalo2 > csigaLepesSzamlalo3){
            System.out.println("Kek csiga nyert, lepes szama:"+csigaLepesSzamlalo1);
            if(getTipp() == cs2.getCsigaVersenyzo()){
                System.out.println("Nyertel");
            } else {
                System.out.println("Te semmit nem nyertel ");
            }
        } else if(csigaLepesSzamlalo3 > csigaLepesSzamlalo1 && csigaLepesSzamlalo3 > csigaLepesSzamlalo2){
            System.out.println("Kek csiga nyert, lepes szama:"+csigaLepesSzamlalo1);
            if(getTipp() == cs3.getCsigaVersenyzo()){
                System.out.println("Nyertel");
            } else {
                System.out.println("Te semmit nem nyertel");
            }
        } else {
            System.out.println("Dontetlen");
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
