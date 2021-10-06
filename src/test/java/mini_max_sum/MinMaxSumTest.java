package mini_max_sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MinMaxSumTest {

    MinMaxSum minMaxSum = new MinMaxSum();

    @Test
    void testSampleInput() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        String expectedOutput = "10 14";

        String result = minMaxSum.miniMaxSum(input);

        Assertions.assertThat(expectedOutput).isEqualTo(result);
    }

}