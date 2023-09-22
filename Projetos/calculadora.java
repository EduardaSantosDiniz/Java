import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngineManager;
public class calculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel = new JPanel(new BorderLayout());

        final JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 40));
        panel.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.equals("=")) {
                        // Avaliar a expressão e exibir o resultado
                        try {
                            String expressao = textField.getText();
                            // Use a função eval para avaliar a expressão
                            Object resultado = new ScriptEngineManager().getEngineByName("JavaScript").eval(expressao);
                            textField.setText(resultado.toString());
                        } catch (Exception ex) {
                            textField.setText("Erro");
                        }
                    } else if (command.equals("C")) {
                        // Limpar o campo de texto
                        textField.setText("");
                    } else {
                        // Adicionar o texto do botão ao campo de texto
                        textField.setText(textField.getText() + command);
                    }
                }
            });
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
