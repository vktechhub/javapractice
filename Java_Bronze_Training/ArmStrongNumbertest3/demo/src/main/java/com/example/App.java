package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    	public static boolean isArmstrongNumber(int number) {
		var sum = 0;		
		//save original input number
		var num = number; //use a copy to perform operations
		var digits = String.valueOf(num).length();
 
		while (num > 0) {
			var digit = num % 10;
			sum += (int) Math.pow(digit, digits);
			num /= 10;
		}
 
		if (sum == number) {
			return true;
		} else {
			return  false;
		}
		
	}
}
