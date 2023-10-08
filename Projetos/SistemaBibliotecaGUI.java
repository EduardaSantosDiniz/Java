
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro [Título: " + titulo + ", Autor: " + autor + "]";
    }
}

class Biblioteca {
    private List<Livro> acervo;

    public Biblioteca() {
        acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public List<Livro> listarLivros() {
        return acervo;
    }
}

public class SistemaBibliotecaGUI {
    private Biblioteca biblioteca;
    private JFrame frame;
    private DefaultListModel<String> listModel;
    private JList<String> livroList;

    public SistemaBibliotecaGUI() {
        biblioteca = new Biblioteca();
        frame = new JFrame("Sistema de Gerenciamento de Biblioteca");
        listModel = new DefaultListModel<>();
        livroList = new JList<>(listModel);

        criarJanela();
    }

    private void criarJanela() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel painel = new JPanel(new BorderLayout());
        frame.add(painel);

        JPanel botaoPainel = new JPanel();
        JButton adicionarBotao = new JButton("Adicionar Livro");
        botaoPainel.add(adicionarBotao);
        painel.add(botaoPainel, BorderLayout.NORTH);

        adicionarBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarLivro();
            }
        });

        JScrollPane listaScrollPane = new JScrollPane(livroList);
        painel.add(listaScrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void adicionarLivro() {
        String titulo = JOptionPane.showInputDialog("Título do Livro:");
        String autor = JOptionPane.showInputDialog("Autor do Livro:");

        if (titulo != null && autor != null) {
            Livro livro = new Livro(titulo, autor);
            biblioteca.adicionarLivro(livro);
            listModel.addElement(livro.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SistemaBibliotecaGUI();
            }
        });
    }
}
