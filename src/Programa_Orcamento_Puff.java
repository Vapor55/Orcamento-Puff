import javax.swing.*;

public class OrcamentoPuff extends JFrame {
    public OrcamentoPuff() {
        super("Orçamento de Puff");
    }
}

void main(String[] args) {

    // Window

    OrcamentoPuff window = new OrcamentoPuff();
    window.setSize(360,475);
    window.setVisible(true);

    // Panel
    JPanel panel = new JPanel();
    window.add(panel);

    // Others GUI components

    JLabel helloworld = new JLabel("Hello, World!");
    panel.add(helloworld);
}
