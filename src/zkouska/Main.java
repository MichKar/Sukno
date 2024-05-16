package zkouska;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Osoba osoba1 = new Osoba(30, 170, "žena");
        Osoba osoba2 = new Osoba(20, 180, "muž");
        Dum dum1 = new Dum(10, 1900);
        Pes pes1 = new Pes(22, 2000);
        System.out.println("POLE");
        IPlocha[] pole = new IPlocha[4];
        pole[0] = osoba1;
        pole[1] = osoba2;
        pole[2] = dum1;
        pole[3] = pes1;
        double celkPlocha = 0;
        String retTypy = "";
        for (int i = 0; i <= 3; i++) {
            celkPlocha += pole[i].sdelPlochu();
            retTypy += (pole[i].getClass().getSimpleName() + ",  ");
        }
        Osoba[] pole3 = new Osoba[4];
        System.out.println("Celková plocha všech objektů je " + celkPlocha + ".\nJedná se o tyto objekty: " + retTypy);
        int j = 0;

        //vypsání jednoho atributu z pole
        System.out.println("Vypsání 1 atributu z 1.indexu pole, v tomto případě výška: " + ((Osoba)pole[0]).vyska);

        System.out.println("\nKOLEKCE");
        // Kolekce
        List<IPlocha> pole2 = new ArrayList<IPlocha>();
        pole2.add(osoba1);
        pole2.add(osoba2);
        pole2.add(dum1);
        pole2.add(pes1);

        double celkPlocha2 = 0;
        String retTypy2 = "";
//
        for (int i = 0; i < pole2.size(); i++) {
            celkPlocha2 += pole2.get(i).sdelPlochu();
            retTypy2 += pole2.get(i).getClass().getSimpleName() + ", ";
        }

        System.out.println("Celková plocha všech objektů je " + celkPlocha2);
        System.out.println("Jedná se o tyto objekty: " + retTypy2);

    }
}