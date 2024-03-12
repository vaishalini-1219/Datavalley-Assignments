import java.util.*;

public class MathOperations{
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b, double c){
        return a + b + c;
    }
    
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args){
        MathOperations operations = new MathOperations();
        int sumInt = operations.add(12, 18);
        System.out.println("Sum of the two integers: " + sumInt);
        double sumDouble = operations.add(12.5, 3.4, 9.1);
        System.out.println("Sum of the three doubles: " + sumDouble);
        String concatenatedString = operations.add("Hello, ", "This is Hema");
        System.out.println("Concatenation of two strings: " + concatenatedString);
    }
}