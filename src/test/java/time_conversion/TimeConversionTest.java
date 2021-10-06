package time_conversion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

    private TimeConversion timeConversion;

    @BeforeEach
    void setUp() {
        timeConversion = new TimeConversion();
    }

    @Test
    void testInput_12_00_AM() {
        String input = "12:00:00AM";
        String expectedOutput = "00:00:00";

        String output = timeConversion.timeConversion(input);

        Assertions.assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    void testInput_12_00_PM() {
        String input = "12:00:00PM";
        String expectedOutput = "12:00:00";

        String output = timeConversion.timeConversion(input);

        Assertions.assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    void testInput_01_00_PM() {
        String input = "01:00:00PM";
        String expectedOutput = "13:00:00";

        String output = timeConversion.timeConversion(input);

        Assertions.assertThat(output).isEqualTo(expectedOutput);
    }

    @Test
    void testInput_01_00_AM() {
        String input = "01:00:00AM";
        String expectedOutput = "01:00:00";

        String output = timeConversion.timeConversion(input);

        Assertions.assertThat(output).isEqualTo(expectedOutput);
    }


}
