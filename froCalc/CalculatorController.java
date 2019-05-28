// Name  Franol geleta
// Id ATE/5157/09



package froCalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        theView.addCalculationListener(new CalculateListener());
        theView.addSignChangeListener(new SignListener());
    }

    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            try {
                firstNumber = theView.getFirstNum();
                secondNumber = theView.getSecondNum();
                
                switch(theView.s) {
                    case 0:
                        theModel.add(firstNumber, secondNumber);
                        break;
                    case 1:
                        theModel.subtract(firstNumber, secondNumber);
                        break;
                    case 2:
                        theModel.multiply(firstNumber, secondNumber);
                        break;
                    case 3:
                        theModel.divide(firstNumber, secondNumber);
                        break;
                }
                
                theView.setSol(theModel.getResult());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayError("You Need to Enter 2 Integers");
            }
        }
    }
    
    class SignListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            theView.s++;
            if(theView.s>=4) {
                theView.s %= 4;
            }
            theView.setSign();
        }
    }
}
