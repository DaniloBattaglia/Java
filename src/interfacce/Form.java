package interfacce;
import javax.swing.*;
import java.awt.event.*;

public class Form extends JFrame {
    public Form() {
        JTextField campoNome = new JTextField(10);
        JTextField campoCognome = new JTextField(10);
        JButton bottone = new JButton("Invia");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome:"));
        panel.add(campoNome);
        panel.add(new JLabel("Cognome:"));
        panel.add(campoCognome);
        panel.add(bottone);

        bottone.addActionListener(e -> {
            String nome = campoNome.getText();
            String cognome = campoCognome.getText();
            System.out.println("Nome: " + nome + ", Cognome: " + cognome);
        });

        this.add(panel);
        this.setSize(300, 150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

