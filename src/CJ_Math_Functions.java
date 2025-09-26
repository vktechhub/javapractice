import java.math.*;

public class CJ_Math_Functions {
    public static void main(String args[]) {

        //addition
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + " and y = " + y);
        System.out.println("x + y = " + (x+y) );

        //Subtraction
        System.out.println("y - x = " + (y-x));
        System.out.println("x - y = " + (x-y));

        //multiplication
        System.out.println("x * y = " + (x * y));

        //diviision
        System.out.println("y / x =  " + (y / x));

        //Modulus
        System.out.println("10 % 2 = " + (10 % 2));
        System.out.println("11 % 2 = " + (11 % 2));

        //Power of
        double base = 5;
        int exponent = 2;
        double result = Math.pow(base, exponent);
        System.out.println("5^2 = " + result);

        //square root
        double number = 25;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of 25 = " + squareRoot);

        //The abs() method returns the absolute (positive) value of a number.
        System.out.println(Math.abs(-4.7));

        // Round off methods
        System.out.println(Math.ceil(4.4));  // returns 5.0
        System.out.println(Math.floor(4.7)); // returns 4.0
        System.out.println(Math.round(4.4)); // returns 4
        System.out.println(Math.round(4.7)); // returns 5

        //max() and min() methods
        System.out.println(Math.max(5, 10)); // returns 10
        System.out.println(Math.min(5, 10)); // returns 5

        //Random number generation
        System.out.println(Math.random()); // returns a random number between 0.0 and 1.0
        System.out.println((int)(Math.random() * 100)); // returns a random number between 0 and 99

        //logarithm
        System.out.println(Math.log(10)); // returns the natural logarithm (base e)
        System.out.println(Math.log10(10)); // returns the base 10 logarithm

        // Odd or Even
        int num = 29;
        if(num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");    
        }

        int num2 = 44;
        if(num2 % 2 > 0) {
            System.out.println(num2 + " is Odd");
        } else {
            System.out.println(num2 + " is Even");    
        }
    }
}