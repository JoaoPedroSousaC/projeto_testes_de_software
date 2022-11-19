import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EhTrianguloFrame extends JFrame{
    private JPanel ehTrianguloFrame;
    private JButton voltarButton;
    private JTextField valorAInput;
    private JTextField valorBInput;
    private JLabel errorCText;
    private JLabel errorAText;
    private JButton calcularButton;
    private JLabel resultadoText;
    private JTextField valorCInput;
    private JLabel valorAText;
    private JLabel valorBText;
    private JLabel valorCText;
    private JLabel errorBText;

    public EhTrianguloFrame (JFrame sistema) {
        setContentPane(ehTrianguloFrame);
        setTitle("É triangulo?");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(56, 56, 56));

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistema.setVisible(true);
                setVisible(false);
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultadoText.setSize(200,30);

            }
        });
    }
}
