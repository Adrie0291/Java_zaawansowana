package Day16Functional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My app :D"); // klasa reprezntuje okno GUI
        frame.setVisible(true); // domy�lnie niewidoczne, trzeba ustawi� na true
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamkni�cie okienka = zamkni�cie programu
        frame.setSize(800, 800); // rozmiar podczas zbudowania okna
        frame.setLocationRelativeTo(null); // ustawienie okna w centralnej cz�ci

        JPanel panel = new JPanel(new FlowLayout()); // definiowanie panelu wraz z layoutem
        // przygotowanie przycisku Naci�nij
        JButton button = new JButton("Naci�nij !"); // definowanie przycisku

        panel.add(button);
        // przygotowanie Licznika klikni��
        JTextField numerField = new JTextField("0", 10); // ustawia wp�ywa na szeroko�c pola wy�wietle�
        panel.add(numerField);  // dodanie do panelu licznika

        frame.add(panel);       // dodanie do okna


        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click");
                int number = Integer.parseInt(numerField.getText());
                number++;
                numerField.setText(number + "");
            }
        };
        button.addActionListener(action);

        JButton lambdaBUtton = new JButton("Lambda przycisk");
        panel.add(lambdaBUtton);
        frame.pack();

        lambdaBUtton.addActionListener((e) -> System.out.println("Hello"));


    }
}
