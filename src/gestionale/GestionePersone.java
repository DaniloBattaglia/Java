package gestionale;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GestionePersone extends JFrame {
    ArrayList<Persona> persone = new ArrayList<>();

    public GestionePersone() {
        JTextField nome = new JTextField(10);
        JTextField cognome = new JTextField(10);
        JTextField stipendio = new JTextField(10);
        JTextField extra = new JTextField(10);
        JComboBox<String> tipo = new JComboBox<>(new String[]{"Studente", "Professore"});
        JButton aggiungi = new JButton("Aggiungi");

        JPanel p = new JPanel();
        p.add(new JLabel("Nome:")); p.add(nome);
        p.add(new JLabel("Cognome:")); p.add(cognome);
        p.add(new JLabel("Stipendio:")); p.add(stipendio);
        p.add(new JLabel("Tipo:")); p.add(tipo);
        p.add(new JLabel("Extra:")); p.add(extra);
        p.add(aggiungi);

        aggiungi.addActionListener(e -> {
            String n = nome.getText();
            String c = cognome.getText();
            double s = Double.parseDouble(stipendio.getText());
            String x = extra.getText();

            if (tipo.getSelectedItem().equals("Studente"))
                persone.add(new Studente(n, c, s, x));
            else
                persone.add(new Professore(n, c, s, x));

            for (Persona pers : persone)
                System.out.println(pers.getNome() + " " + pers.getCognome() + " | " + pers.getDettagli());
        });

        add(p);
        setTitle("Persone");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
