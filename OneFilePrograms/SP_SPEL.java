import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SP_SPEL {
    public static void main(String[] args) {

        SP_SPEL spelExample = new SP_SPEL();
        
        // Spring Expression Language (SpEL) 
        // Syntax: SpEL expressions are typically enclosed within 
        // #{} for dynamic expression evaluation, particularly in Spring bean definitions.
        // ${} is used for property placeholders

        System.out.println("=== Spring Expression Language (SpEL) Examples ===\n");

        // Example 1: Simple arithmetic expression
        String expression1 = "2 + 3 * 4";
        System.out.println("Expression: " + expression1);
        System.out.println("Result: " + spelExample.evaluateExpression(expression1));

        // Example 2: String concatenation
        String expression2 = "'Hello, ' + 'World!'";
        System.out.println("\nExpression: " + expression2);
        System.out.println("Result: " + spelExample.evaluateExpression(expression2));

        // Example 3: String operations
        String expression3 = "'Hello World'.substring(0, 5)";
        System.out.println("\nExpression: " + expression3);
        System.out.println("Result: " + spelExample.evaluateExpression(expression3));

        // Example 4: Ternary operator
        String expression4 = "10 > 5 ? 'Yes' : 'No'";
        System.out.println("\nExpression: " + expression4);
        System.out.println("Result: " + spelExample.evaluateExpression(expression4));

        // Example 5: Using context variables
        spelExample.evaluateWithContext();

        // Example 6: Accessing system properties
        String expression6 = "T(System).getProperty('java.home')";
        System.out.println("\nExpression: " + expression6);
        System.out.println("Java Home: " + spelExample.evaluateExpression(expression6));

        // Example 7: Method invocation
        spelExample.printHello();
    }

    /**
     * Evaluates a SpEL expression and returns the result
     */
    public Object evaluateExpression(String expressionString) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression(expressionString);
        return expression.getValue();
    }

    /**
     * Demonstrates SpEL with context variables
     */
    public void evaluateWithContext() {
        System.out.println("\n=== Using Context Variables ===");
        
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();
        
        // Set variables in context
        context.setVariable("x", 10);
        context.setVariable("name", "Vigneshkanna");
        
        // Use variables in expressions
        Expression exp1 = parser.parseExpression("#x * 2");
        System.out.println("Expression: #x * 2, where x=10");
        System.out.println("Result: " + exp1.getValue(context));
        
        Expression exp2 = parser.parseExpression("'Hello, ' + #name");
        System.out.println("\nExpression: 'Hello, ' + #name, where name='Vigneshkanna'");
        System.out.println("Result: " + exp2.getValue(context));
    }

    public void printHello() {
        System.out.println("\n=== Method Invocation ===");
        System.out.println("This is in printHello method.");
    }
}
