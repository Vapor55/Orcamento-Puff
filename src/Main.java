import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public static class OrcamentoPuff extends JFrame {
    public OrcamentoPuff() {
        super("Orçamento de Puff");
    }
}

void main() {

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

    // Buttom Calc event

    buttom_calc.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            // Variables and Methods

            String material = input_material.getText();
            String price = input_price.getText();
            String part_of_material = input_part_of_material.getText();

            Calc calc = new Calc(material, price, part_of_material);
            String result = Integer.toString(calc.Calculate());
            text_result.setText(result);
        }
    });
}

static class Calc {

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


    public int Calculate() {

        // Int variables

        int int_material = Integer.parseInt(material);
        int int_price = Integer.parseInt(price);
        int int_part_of_material = Integer.parseInt(part_of_material);

        // Return variable

        return int_price / int_material * int_part_of_material;
    }
}