import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassificarTrianguloFrame extends JFrame{
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
    private JPanel classificarTrianguloFrame;

    public ClassificarTrianguloFrame (JFrame sistema) {
        setContentPane(classificarTrianguloFrame);
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
                resultadoText.setText("Resultado ira aparecer aqui...");
                valorAInput.setText("");
                valorBInput.setText("");
                valorCInput.setText("");
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorA = 0;
                double valorB = 0;
                double valorC = 0;
                try {
                    valorA = Double.parseDouble(valorAInput.getText());
                    valorB = Double.parseDouble(valorBInput.getText());
                    valorC = Double.parseDouble(valorCInput.getText());
                    if (valorAInput.getText() != "" && valorBInput.getText() != "" && valorCInput.getText() != ""){
                        Sistema sistema = new Sistema();
                        try {
                            resultadoText.setText(sistema.classificaTriangulo(valorA,valorB,valorC));
                        } catch (Exception ex) {
                            throw new RuntimeException(ex.getMessage());
                        }
                    } else {
                        resultadoText.setText("Valor inválido");
                    }
                } catch (Exception ex) {
                    resultadoText.setText(ex.getMessage());
                }

                resultadoText.setSize(600,30);

            }
        });
    }
}
