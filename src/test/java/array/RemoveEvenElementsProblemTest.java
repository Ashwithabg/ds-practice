package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveEvenElementsProblemTest {
    @Test
    public void shouldRemoveEvenElements() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        int[] oddNumbers = RemoveEvenElementsProblem.remove(numbers);
        assertArrayEquals(new int[]{1, 3, 5}, oddNumbers);
    }
}