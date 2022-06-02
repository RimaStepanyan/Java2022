package classwork.lesson11;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();


        double result = myCalculator.plus(4,5);
        System.out.println(result);
        System.out.println(myCalculator.minus(5, 4));
    }
}
