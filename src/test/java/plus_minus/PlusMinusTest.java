package plus_minus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class PlusMinusTest {

    PlusMinus plusMinus = new PlusMinus();


    @Test
    public void testSampleInput() throws IOException {
        String expected = "0.500000\n" +
                "0.333333\n" +
                "0.166667";
        String result = plusMinus.main("src/test/java/plus_minus/input_output/sample_input");

        Assertions.assertEquals(expected, result);
    }

}