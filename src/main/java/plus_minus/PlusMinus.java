package plus_minus;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    /*
     * Complete the 'problemSolving' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY v
     */

    public String plusMinus(List<Integer> v) {

        String outputTemplate = "%f\n%f\n%f";

        int zeros = 0;
        int positives = 0;
        int negatives = 0;
        float arrLength = 0;

        for (int number : v) {
            arrLength++;
            if (number == 0)
                zeros++;
            if (number > 0)
                positives++;
            if (number < 0)
                negatives++;
        }

        if (arrLength == 0)
            return "";
        return String.format(outputTemplate, positives / arrLength, negatives / arrLength, zeros / arrLength);
    }

    public String main(String inputFilePath) throws IOException {
        List<Integer> arr;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath)))) {

            arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

        }
        return plusMinus(arr);

    }

}
