package juegodedados;

import java.util.Scanner;

public class JuegoDeDados {

    public static void main(String[] args) {
        String[] Nombres = new String[3];
        int[] Puntajes = new int[3];
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("");
        for (int i=0; i<Puntajes.length;i++) {
            System.out.println("Ingresa el nombre del jugador numero "+i);
            Nombres[i]=sc.nextLine();
            
            System.out.println("Ingresa el puntaje del jugador numero "+i);
            Puntajes[i]=sc2.nextInt();
        }
        
        int maxima=-999999;
        int posMax=-1;
        for (int i=0;i<Nombres.length;i++){
            if (Puntajes[i]>maxima) {
                maxima=Puntajes[i];
                posMax=i;
            }
        }
        System.out.println("El Puntaje maximo es de: "+maxima+" y es del jugador "+Nombres[posMax]);
    }
}
