package Java.aprendendo;
import java.util.Scanner;


public class ReservaFacil {
    public static void main(String []args){
        boolean [] quartosDisponiveis = new boolean[5];


        for (int i = 0; i <5; i++){
            quartosDisponiveis[i]= true;
        }
        Scanner escanear = new Scanner (System.in);

        System.out.println("Bem vindo ao nosso sistema de reserva de quartos");
        while (true){
            System.out.println("\nQuartos Disponiveis: ");
            for (int i = 0; i < 5; i++){
                if(quartosDisponiveis [i]){
                    System.out.println("Qurto "+ (i + 1));
                }
            }
            
        }
 }
}
