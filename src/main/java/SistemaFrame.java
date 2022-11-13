import javax.swing.*;
import java.awt.*;

public class SistemaFrame extends JFrame{
    private JPanel sistemaPanel;
    private JButton calcularRaízesButton;
    private JButton classificarTriânguloButton;
    private JButton éUmRetânguloButton;
    private JButton calculadoraButton;
    private JButton formaUmTriânguloButton;
    private JButton éTriânguloRetânguloButton;
    private JButton calcularÁreaEPerímetroButton;
    private JButton áreaEPerímetroDeButton;
    private JButton distânciaEntreDoisPontosButton;

    public SistemaFrame () {
        setContentPane(sistemaPanel);

        setTitle("teste");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(56, 56, 56));

    }
}
