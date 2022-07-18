package try1.Calculator;

public class CalculatorMain {

    public static void main(String[] args) {

        String str = "1 + 2";

        Calculator calculator = new Calculator(str);
        calculator.calculate();
        System.out.println(calculator.result());

    }

}
