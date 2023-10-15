import java.util.Scanner; // Importa a classe Scanner do pacote java.util.

public class ReservaDeQuarto { // Declara a classe ReservaDeQuarto.
    public static void main(String[] args) { // Inicia o método principal.
        // Inicialização dos quartos
        boolean[] quartosDisponiveis = new boolean[5]; // Cria um array de boolean com 5 elementos para representar os quartos.

        // Preenche o array com o valor "true" para todos os quartos.
        for (int i = 0; i < 5; i++) {
            quartosDisponiveis[i] = true;
        }

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados.

        System.out.println("Bem-vindo à reserva de quartos!"); // Exibe uma mensagem de boas-vindas.
        while (true) { // Inicia um loop infinito.
            // Mostrar quartos disponíveis
            System.out.println("\nQuartos Disponíveis:"); // Exibe a lista de quartos disponíveis.
            for (int i = 0; i < 5; i++) {
                if (quartosDisponiveis[i]) { // Verifica se o quarto está disponível.
                    System.out.println("Quarto " + (i + 1)); // Exibe o número do quarto.
                }
            }

            // Escolher um quarto
            System.out.print("\nEscolha o quarto (1-5) ou digite 0 para sair: "); // Solicita a escolha do quarto.
            int escolha = scanner.nextInt(); // Lê a escolha do usuário.

            if (escolha == 0) { // Verifica se o usuário escolheu sair.
                System.out.println("Obrigado por usar nosso serviço de reserva de quartos. Adeus!"); // Exibe uma mensagem de despedida.
                break; // Sai do loop.
            } else if (escolha >= 1 && escolha <= 5) { // Verifica se a escolha é um número de quarto válido.
                if (quartosDisponiveis[escolha - 1]) { // Verifica se o quarto escolhido está disponível.
                    scanner.nextLine(); // Limpa a entrada de nova linha.
                    System.out.print("Digite seu nome: "); // Solicita o nome do usuário.
                    String nome = scanner.nextLine(); // Lê o nome do usuário.

                    quartosDisponiveis[escolha - 1] = false; // Marca o quarto como indisponível.

                    System.out.println("\nQuarto " + escolha + " reservado para " + nome + "."); // Exibe mensagem de reserva.
                } else {
                    System.out.println("Quarto " + escolha + " já está ocupado. Escolha outro quarto."); // Exibe mensagem de quarto ocupado.
                }
            } else {
                System.out.println("Escolha inválida. Por favor, escolha um número de quarto válido."); // Exibe mensagem de escolha inválida.
            }
        }

        scanner.close(); // Fecha o objeto Scanner.
    }
}
