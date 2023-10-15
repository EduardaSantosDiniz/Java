import java.util.Scanner;

public class ReservaFacil {
    public static void main(String[] args) {
        // Inicialização dos quartos
        boolean[] quartosDisponiveis = new boolean[5];
        for (int i = 0; i < 5; i++) {
            quartosDisponiveis[i] = true;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à reserva de quartos!");
        while (true) {
            // Mostrar quartos disponíveis
            System.out.println("\nQuartos Disponíveis:");
            for (int i = 0; i < 5; i++) {
                if (quartosDisponiveis[i]) {
                    System.out.println("Quarto " + (i + 1));
                }
            }

            // Escolher um quarto
            System.out.print("\nEscolha o quarto (1-5) ou digite 0 para sair: ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Obrigado por usar nosso serviço de reserva de quartos. Adeus!");
                break;
            } else if (escolha >= 1 && escolha <= 5) {
                if (quartosDisponiveis[escolha - 1]) {
                    scanner.nextLine(); // Limpar a entrada de nova linha
                    System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();

                    quartosDisponiveis[escolha - 1] = false;

                    System.out.println("\nQuarto " + escolha + " reservado para " + nome + ".");
                } else {
                    System.out.println("Quarto " + escolha + " já está ocupado. Escolha outro quarto.");
                }
            } else {
                System.out.println("Escolha inválida. Por favor, escolha um número de quarto válido.");
            }
        }

        scanner.close();
    }
}
