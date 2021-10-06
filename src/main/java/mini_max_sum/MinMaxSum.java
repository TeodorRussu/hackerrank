package mini_max_sum;

import java.util.List;

class MinMaxSum {

    /*
     * Given five positive integers,
     * find the minimum and maximum values that can be calculated by summing exactly
     * four of the five integers.
     * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public String miniMaxSum(List<Integer> arr) {

        long min = arr.get(0);
        long max = arr.get(0);
        long sum = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            long number = arr.get(i);
            sum += number;

            if (min > number)
                min = number;

            if (max < number)
                max = number;
        }

        return "" + (sum - max) + " " + (sum - min);
    }

}
