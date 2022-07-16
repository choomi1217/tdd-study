public class CalculatorMain {

    public static void main(String[] args) {

        String str = "1 + 2 + 3";

        Calculator calculator = new Calculator();

        calculator.init(str);
        calculator.calculate();
        System.out.println(calculator.result());

    }

}
