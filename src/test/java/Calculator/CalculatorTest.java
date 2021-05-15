package Calculator;

import static org.junit.jupiter.api.Assertions.*; //assertion

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

    private Calculator obj;

    @BeforeEach
    void initEach(){ obj = new Calculator();}


    @Test
    @DisplayName("Ensure correct handling of zero")
    void test_add(){
        assertEquals(0,obj.add(""),"Add method should return 0");
        assertEquals(1, obj.add("1"),"Add method should return 1" );
        assertEquals(5, obj.add("1,4"),"Add method should return 5" );
        assertEquals(6, obj.add("1\n2,3"),"Add method should return 6" );

        assertEquals(6, obj.add("//;\n1;2;3"),"Add method should return 6" );
    }


}
