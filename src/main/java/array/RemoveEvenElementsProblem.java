package array;

import java.util.Arrays;

public class RemoveEvenElementsProblem {
    public static int[] remove(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(element -> isOdd(element))
                .toArray();
    }

    private static boolean isOdd(int element) {
        return element % 2 != 0;
    }
}
