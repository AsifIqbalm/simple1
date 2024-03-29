package testingpro;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;

public class CalculatorTest {
private Calculator objCalcUnderTest;

@Before
public void setUp() {
//Arrange
objCalcUnderTest = new Calculator();
}

@Test
public void testSum() { 
int a = 15; int b = 20; 
int expectedResult = 35;
//Act 
long result = objCalcUnderTest.sum(a, b);
//Assert
Assert.assertEquals(expectedResult, result);
}

@Test
public void testSubtract() {
int a = 25; int b = 20; 
int expectedResult = 5; 
long result = objCalcUnderTest.subtract(a, b);
Assert.assertEquals(expectedResult, result);
}

@Test
public void testMultiply() {
int a = 10; int b = 25;
long expectedResult = 250;
long result = objCalcUnderTest.multiply(a, b);
Assert.assertEquals(expectedResult, result);
}

@Test
public void testDivide() {
int a = 56; int b = 10; 
double expectedResult = 5.6; 
double result = objCalcUnderTest.divide(a, b);
Assert.assertEquals(expectedResult, result); 
}


}
