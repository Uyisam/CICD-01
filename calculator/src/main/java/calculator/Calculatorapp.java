package calculator;
import java.util.Scanner;

public class Calculatorapp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter (ex: 5 + 2): ");
        
        double a = s.nextDouble();
        char op = s.next().charAt(0);
        double b = s.nextDouble();

        double res = (op == '+') ? (a + b) : (op == '-') ? (a - b) : 
                     (op == '*') ? (a * b) : (op == '/') ? (a / b) : 0;

        System.out.println("Result: " + res);
    }
}