package Java.aprendendo;
import java.util.Scanner;

public class ReservaFacil {
    public static void main(String []args){
        
        boolean[]quartosDisponiveis = new boolean[5];
        for (int i = 0; i < 5; i++){
            quartosDisponiveis[i] = true;
        }
        Scanner escanear = new Scanner (System.in);

        System.out.println("Bem Vindos à reserva de quartos!");
        while (true){
            System.out.println("\nQuartos Disponíveis:");
            for (int i = 0; i <5; i++){
                if(quartosDisponiveis[i]){
                    System.out.println("Quarto "+(i + 1));
                }
            }
            System.out.println("\nEscolha o quarto (1-5) ou digite 0 para sair: ");
            int escolha = escanear.nextInt();
            
            if(escolha == 0 ){
                System.out.println("Obrigado por usar nosso serviço de reserva de quartos. Adeus!");
                break;
            }else if(escolha >=1 && escolha<=5){
                if(quartosDisponiveis[escolha - 1]){
                    escanear.nextLine();
                    System.out.println("Digite seu nome: ");
                    String nome = escanear.nextLine();

                    quartosDisponiveis[escolha - 1] = false;

                    System.out.println("\n Quarto "+ escolha + "reservado para "+nome+".");
                }else{
                    System.out.println("Quarto "+escolha+
                    "já esta ocupado. Escolha outro quarto.");
                }
            }else{
                System.out.println("Escolha inválida. Por gentileza, escolha um número válido.");
            }
        }
        escanear.close();

    }
    
}
