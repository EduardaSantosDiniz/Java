package Java.aprendendo;
import java.util.Scanner;

public class ReservaFacil {
    public static void main(String []args){

        boolean []quartosDisponiveis = new boolean[5];

        for (int i = 0; i <5 ; i++){
            quartosDisponiveis[i] = true;
        }

        Scanner escanear = new Scanner(System.in);
        

        System.out.println("Bem vindo a reserva  de quartos!");
    
        while (true) {
            System.out.println("\nQuartos Disponiveis");

            for (int i = 0; i < 5; i++){
                if(quartosDisponiveis[i]){
                    System.out.println("Quarto "+ (i+1));
                }
            }

            System.out.println("\nEscolha o quarto (1-5) ou digite 0 para sair: ");
            int escolha = escanear.nextInt();

            if (escolha == 0){
                System.out.println("Obrigado por usar nooso serviço de reserva!");
                break;
            }else if (escolha >= 1 && escolha <=5){
                if(quartosDisponiveis[escolha - 1]){
                    escanear.nextLine();
                    System.out.println("Digite seu nome: ");
                    String nome  = escanear.nextLine();

                    quartosDisponiveis[escolha - 1] =false;

                    System.out.println("\nQuarto " +escolha +" reservado para "+ nome +".");

                }else{
                    System.out.println("Escolha invalida, por favor escolha um numero valido");
                }
            }
            escanear.close();
        }
    
        
    }
}
