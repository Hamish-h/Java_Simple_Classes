import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculator_test {

    Calculator calculator;

    @Before
    public void before () {
        calculator = new Calculator(10, 20);
    }

    @Test
    public void add(){
        assertEquals(30, calculator.getAdd());
    }

    @Test
    public void subtract(){
        assertEquals(-10, calculator.getSubtract());
    }

    @Test
    public void multiply(){
        assertEquals(200, calculator.getMultiply());
    }

    @Test
    public void divide(){
        assertEquals(0.5, calculator.getDivide(),1.0);
    }
}