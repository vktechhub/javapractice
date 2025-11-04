package com.example;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


/**
* Unit test for simple App.
*/
public class AppTest {
 
    /**
     * Rigorous Test :-)
     */
	 @ParameterizedTest
	 @CsvSource({
	        "153, true",
	        "371, true",
	        "9474, true",
	        "123, false",
	        "200, false"
	    })
    public void testArmstrongMethod(int num, boolean res) {
    	
    //    assertTrue(!App.isArmstrongNumber(15));
        assertEquals(res, App.isArmstrongNumber(num));
        
    }
}