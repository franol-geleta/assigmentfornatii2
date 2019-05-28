// Name  Franol geleta
// Id ATE/5157/09


package froCalc;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {

    int s = 0;
    private JTextField fn = new JTextField(5);
    private JButton sign = new JButton("+");
    private JTextField sn = new JTextField(5);
    private JButton calc = new JButton("Calculate");
    private JTextField sol = new JTextField(5);
    
    public CalculatorView() {
        JPanel jp = new JPanel();
        this.setDefaultCloseOperation(3);
        this.setSize(600, 300);
        
        jp.add(fn);
        jp.add(sign);
        jp.add(sn);
        jp.add(calc);
        jp.add(sol);
        this.add(jp);
    }
    
    public int getFirstNum() {
        return Integer.parseInt(fn.getText());
    }
    
    public int getSecondNum() {
        return Integer.parseInt(sn.getText());
    }
    
    public void setSol(int solution) {
        sol.setText(Integer.toString(solution));
    }
    
    void addCalculationListener(ActionListener forButton) {
        calc.addActionListener(forButton);
    }
    
    void addSignChangeListener(ActionListener forSign) {
        sign.addActionListener(forSign);
    }
    
    void displayError(String error) {
        JOptionPane.showMessageDialog(this, error);
    }
    
    public void setSign() {
        switch(s) {
            case 0:
                sign.setText("+");
                break;
            case 1:
                sign.setText("-");
                break;
            case 2:
                sign.setText("*");
                break;
            case 3:
                sign.setText("/");
                break;
        }
    }
}
