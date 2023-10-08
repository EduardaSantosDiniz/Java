package Java.aprendendo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form{
    public static void main(String[] args) {

        // Criação da janela
        JFrame janela = new JFrame("Formulário em Java");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500,500);

        //Painel Principal
        JPanel painel = new JPanel();
        janela.add(painel);

          // Layout do painel (GridLayout com 7 linhas e 2 colunas)
          painel.setLayout(new GridLayout(7, 2));

            // Rótulos
            
    }
}


