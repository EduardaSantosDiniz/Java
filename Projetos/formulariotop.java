import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulariotop {
    public static void main(String[] args) {
        // Criação da janela
        JFrame janela = new JFrame("Formulário em Java"); // Cria uma janela com título "Formulário em Java"
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento padrão ao fechar a janela
        janela.setSize(400, 300); // Define o tamanho inicial da janela

        // Painel principal
        JPanel painel = new JPanel(); // Cria um painel para organizar os componentes
        janela.add(painel); // Adiciona o painel à janela principal

        // Layout do painel (GridLayout com 7 linhas e 2 colunas)
        painel.setLayout(new GridLayout(7, 2)); // Define o layout do painel como uma grade de 7 linhas por 2 colunas

        // Rótulos
        JLabel lblNome = new JLabel("Nome:"); // Cria um rótulo para o campo "Nome"
        JLabel lblIdade = new JLabel("Idade:"); // Cria um rótulo para o campo "Idade"
        JLabel lblNumero = new JLabel("Número:"); // Cria um rótulo para o campo "Número"
        JLabel lblEstado = new JLabel("Estado:"); // Cria um rótulo para o campo "Estado"
        JLabel lblCidade = new JLabel("Cidade:"); // Cria um rótulo para o campo "Cidade"
        JLabel lblEmail = new JLabel("Email:"); // Cria um rótulo para o campo "Email"

        // Campos de texto
        JTextField campoNome = new JTextField(20); // Cria um campo de texto para o nome com 20 colunas
        JTextField campoIdade = new JTextField(20); // Cria um campo de texto para a idade com 20 colunas
        JTextField campoNumero = new JTextField(20); // Cria um campo de texto para o número com 20 colunas
        JTextField campoEstado = new JTextField(20); // Cria um campo de texto para o estado com 20 colunas
        JTextField campoCidade = new JTextField(20); // Cria um campo de texto para a cidade com 20 colunas
        JTextField campoEmail = new JTextField(20); // Cria um campo de texto para o email com 20 colunas

        // Botão
        JButton botaoEnviar = new JButton("Enviar"); // Cria um botão com o texto "Enviar"
        botaoEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ação ao clicar no botão (validação)
                String nome = campoNome.getText(); // Obtém o texto do campo de nome
                String idade = campoIdade.getText(); // Obtém o texto do campo de idade
                String numero = campoNumero.getText(); // Obtém o texto do campo de número
                String estado = campoEstado.getText(); // Obtém o texto do campo de estado
                String cidade = campoCidade.getText(); // Obtém o texto do campo de cidade
                String email = campoEmail.getText(); // Obtém o texto do campo de email

                if (nome.isEmpty() || idade.isEmpty() || numero.isEmpty() || estado.isEmpty() || cidade.isEmpty()
                        || email.isEmpty()) {
                    // Exibir mensagem de erro se algum campo obrigatório estiver vazio
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.",
                            "Informações em falta", JOptionPane.ERROR_MESSAGE);
                } else if (!idade.matches("\\d+")) {
                    // Exibir mensagem de erro se a idade não for um número válido
                    JOptionPane.showMessageDialog(null, "A idade deve ser um número válido.", "Informação incorreta",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!numero.matches("\\d+")) {
                    // Exibir mensagem de erro se o número não for um número válido
                    JOptionPane.showMessageDialog(null, "O número deve ser um número válido.", "Informação incorreta",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    // Exibir mensagem de sucesso com informações fornecidas
                    JOptionPane.showMessageDialog(null, "Formulário enviado com sucesso!\n\n" +
                            "Nome: " + nome + "\n" +
                            "Idade: " + idade + "\n" +
                            "Número: " + numero + "\n" +
                            "Estado: " + estado + "\n" +
                            "Cidade: " + cidade + "\n" +
                            "Email: " + email);
                }
            }
        });

        // Adiciona os componentes ao painel
        painel.add(lblNome);
        painel.add(campoNome);
        painel.add(lblIdade);
        painel.add(campoIdade);
        painel.add(lblNumero);
        painel.add(campoNumero);
        painel.add(lblEstado);
        painel.add(campoEstado);
        painel.add(lblCidade);
        painel.add(campoCidade);
        painel.add(lblEmail);
        painel.add(campoEmail);
        painel.add(new JLabel()); // Espaço em branco
        painel.add(botaoEnviar);

        // Torna a janela visível
        janela.setVisible(true);
    }
}
