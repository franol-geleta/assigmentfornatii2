// Name  Franol geleta
// Id ATE/5157/09


package froCalc;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MVC1 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        for(UIManager.LookAndFeelInfo laf: UIManager.getInstalledLookAndFeels()) {
            if(("Nimbus").equals(laf.getName())) {
                UIManager.setLookAndFeel(laf.getClassName());
            }
        }
        
        CalculatorView view = new CalculatorView();
        CalculatorModel model= new CalculatorModel();
        new CalculatorController(view,model);
        view.setVisible(true);
    }
}
