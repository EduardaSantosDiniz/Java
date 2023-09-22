import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Reserva1 {
    private static List<Quarto> quartosDisponiveis = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Reservas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel(new BorderLayout());

        JTextArea textArea = new JTextArea();
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JButton reservarButton = new JButton("Reservar Quarto");
        reservarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeHospede = JOptionPane.showInputDialog("Digite o nome do hóspede:");
                if (nomeHospede != null && !nomeHospede.isEmpty()) {
                    Reserva reserva = fazerReserva(nomeHospede);
                    if (reserva != null) {
                        textArea.append("Reserva feita com sucesso: " + reserva + "\n");
                    } else {
                        textArea.append("Não há quartos disponíveis.\n");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um nome de hóspede válido.");
                }
            }
        });
        panel.add(reservarButton, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        // Inicialize alguns quartos disponíveis
        for (int i = 1; i <= 10; i++) {
            quartosDisponiveis.add(new Quarto(i));
        }
    }

    private static Reserva fazerReserva(String nomeHospede) {
        if (!quartosDisponiveis.isEmpty()) {
            Quarto quarto = quartosDisponiveis.remove(0);
            Reserva reserva = new Reserva(quarto);
            reserva.setNomeHospede(nomeHospede);
            return reserva;
        } else {
            return null;
        }
    }
}

class Quarto {
    private int numero;

    public Quarto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Quarto " + numero;
    }
}

class Reserva {
    private Quarto quarto;
    private String nomeHospede;

    public Reserva(Quarto quarto) {
        this.quarto = quarto;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    @Override
    public String toString() {
        return "Reserva: " + quarto + ", Hospede: " + nomeHospede;
    }
}