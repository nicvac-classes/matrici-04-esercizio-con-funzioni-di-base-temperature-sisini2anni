//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );
    public static Random random = new Random();

    //Valori multipli di ritorno per il metodo calcolaMassimo
    public static record Max(int massimo, int rIdx, int cIdx) { }

    // Metodo per calcolare il massimo nella matrice
    public static Max calcolaMassimo( /*scrivere qui i parametri richiesti dall'esercizio*/ ) {
         public static record Max(int massimo, int rIdx, int cIdx) { }

  
    public static Max calcolaMassimo(int[][] Matrics, int rigons, int colons) 
        int rIdx = 0;
        int cIdx = 0;
        for (int i = 0; i <= rigons - 1; i = i + 1) {
            for (int j = 0; j <= colons - 1; j = j + 1) {
                
                if (M[i][j] > M[rIdx][cIdx]) {
                    rIdx = i;
                    cIdx = j;
                }
            }
        }
        int massimo = M[rIdx][cIdx];
        return new Max(massimo, rIdx, cIdx);
    }
    }

    // Metodo per calcolare la media di una colonna
    public static float calcolaMedia(int[][] Matrics, int rigons, int colons, int cIdx) 
        float s = 0;
        for (int i = 0; i <= rigons - 1; i = i + 1) {
            s = s + M[i][cIdx];
        }
        float med = s / colons;
        return med;
    }       
    

    // Metodo per riempire la matrice con valori casuali
    // Già risolto nell'esercizio precedente
    public static void riempiCasuale( int[][] Matrics, int rigons, int colons, int vmin, int valMax) {
        Random rand = new Random();
        for (int i=0; i <= rigons-1; i=i+1 ) {
            for (int j=0; j <= colons-1; j=j+1) {
                M[i][j] = vMin + rand.nextInt((valMax+1)-vMin);
            }
        }
    }

    public static void main(String args[]) {
         int G = 7;
        int h = 5;
        int[][] MG= new int[GIORNI][ORE];
        
        riempiCasuale(MG, G, h, 290, 300);
        System.out.println("Temperature registrate:");
        UtilsMatrice.visualizza(MG);
         Max risultato = calcolaMassimo(MG, G, h);
        System.out.println("La temperatura massima registrata è: " + risultato.massimo);
        System.out.println("Giorno in cui è stata registrata: " + (risultato.rIdx() + 1) + "°");
        System.out.println("Orario in cui è stata registrata" " + (risultato.cIdx() + 1) + "°");
         System.out.println("La media delle Temperature è :");
        for (int j = 0; j <= ORE - 1; j = j + 1) {
            float mediaFasciaOraria = calcolaMedia(MG, G, h, j);
            System.out.print(mediaFasciaOraria);
        }
    }
    
    
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md