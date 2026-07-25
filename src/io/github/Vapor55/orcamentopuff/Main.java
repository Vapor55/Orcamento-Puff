package io.github.Vapor55.orcamentopuff;

import javax.swing.*;
import java.awt.*;

public class Main {
    static void main() {
        // Window

        OrcamentoPuff window = new OrcamentoPuff();
        window.setSize(280,390);
        window.setVisible(true);

        // Input values in GUI

        JLabel text_material = new JLabel("Material");
        JTextField input_material = new JTextField(20);
        JLabel text_price = new JLabel("Preço do Material");
        JTextField input_price = new JTextField(20);
        JLabel text_part_of_material = new JLabel("Parte do Material");
        JTextField input_part_of_material = new JTextField(20);
        JButton buttom_calc = new JButton("Calcular");
        JLabel text_result = new JLabel();
        JLabel text_help = new JLabel("<html><div style='width: 200px;'>" + "Ao inserir o preço, não use decimal. Exemplo: 1370 que representa R$ 13,70." + "</div></html>");

        // Panel

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        window.add(panel);

        // Panel components

        panel.add(text_material);
        panel.add(input_material);
        panel.add(text_price);
        panel.add(input_price);
        panel.add(text_part_of_material);
        panel.add(input_part_of_material);
        panel.add(buttom_calc);
        panel.add(text_result);
        panel.add(text_help);

        // Buttom Calc event

        buttom_calc.addActionListener(_ -> {

            // Variables and Methods

            String material = input_material.getText();
            String price = input_price.getText();
            String part_of_material = input_part_of_material.getText();

            Calc calc = new Calc(material, price, part_of_material);
            String result = Double.toString(calc.Calculate());
            text_result.setText(result);
        });
    }

    public static class OrcamentoPuff extends JFrame {
        public OrcamentoPuff() {
            super("Orçamento de Puff");
        }
    }
}

class Calc {

    // String variables

    String material;
    String price;
    String part_of_material;

    // Calc method

    public Calc(String material, String price, String part_of_material) {
        this.material = material;
        this.price = price;
        this.part_of_material = part_of_material;
    }


    public double Calculate() {

        // Long variables

        long long_material = Long.parseLong(material);
        long long_price = Long.parseLong(price);
        long long_part_of_material = Long.parseLong(part_of_material);

        // Return

        return (double) (long_price / 100) / long_material * long_part_of_material;
    }
}