public class CJ_IfStatement{
    public static void main(String[] args) {
     
        int x = 10;

        if(x > 5) {
            System.out.println("x is greater than 5");
        } else if(x == 5) {
            System.out.println("x is not greater than 5");
        } else {
            System.out.println("x is less than 5");
        }

        // Using a ternary operator for the same logic
        // This is a short form of the same logic 
        // It is a single line statement that can be used to replace simple if-else statements (for simple conditions)
        // It is not recommended to use it for complex logic as it can reduce readability

        String result = (x > 5) ? "x is greater than 5" : (x == 5) ? "x is equal to 5" : "x is less than 5";
        System.out.println(result);
    }
}