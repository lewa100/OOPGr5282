import calc.Calculator;
import calc.iCalculable;
import decorator.Decorator;
import log.Logger;
import view.ViewCalculator;

public class App {
    public static void main(String[] args) {
        iCalculable calc = new Calculator(0, 0);

       iCalculable decorator = new Decorator(new Calculator(0, 0), new Logger());

       ViewCalculator view = new ViewCalculator(decorator);
       view.run();
    }
}
