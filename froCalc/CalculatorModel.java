// Name  Franol geleta
// Id ATE/5157/09



package froCalc;

public class CalculatorModel {

    private int result;
    
    public void add(int x, int y) {
        result = x+y;
    }
    
    public void subtract(int x, int y) {
        result = x-y;
    }
    
    public void multiply(int x, int y) {
        result = x*y;
    }
    
    public void divide(int x, int y) {
        result = x/y;
    }
    
    public int getResult() {
        return result;
    }
}
