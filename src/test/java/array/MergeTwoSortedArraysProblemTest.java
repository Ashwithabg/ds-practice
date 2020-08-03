package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedArraysProblemTest {
    @Test
    public void shouldMergeTwoSortedArrays() {
        int[] numbers1 = new int[]{1, 3, 5, 7};
        int[] numbers2 = new int[]{2, 6, 8, 9};
        int[] expectedElements = new int[]{1, 2, 3, 5, 6, 7, 8, 9};

        int[] sortedElements = MergeTwoSortedArraysProblem.merge(numbers1, numbers2);

        assertArrayEquals(expectedElements, sortedElements);
    }

}