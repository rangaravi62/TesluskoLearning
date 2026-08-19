package Junit;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator {

    public Integer addTwoNumbers(int a,int b){
        return a+b;
    }

    public int divideTwoNumbers(int a, int b){
        return a/b;
    }
}

// Test structure: Arrange, Act, Assert
class CalculatorTest{
    @Test // marks the method as a test case
    @DisplayName("Add Two Numbers")
    @Disabled
    void addTwoNumbersTest(){
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int result = calculator.addTwoNumbers(5,6);

        //Assert
        assertEquals(11,result);
        assertNotNull(result);
        assertNotEquals(3,result);
        assertTrue(result != 0);
        assertFalse(result == 0);

        int doubleres = calculator.divideTwoNumbers(5,2);
        assertEquals(2,doubleres);
        assertThrows(ArithmeticException.class, () -> calculator.divideTwoNumbers(1,0));

    }
}
