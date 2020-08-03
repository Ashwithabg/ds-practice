package array;

public class MergeTwoSortedArraysProblem {
    public static int[] merge(int[] first, int[] second) {
        int firstLength = first.length;
        int secondLength = second.length;
        int firstArrayIndex = 0, secondArrayIndex = 0, resultantIndex = 0;

        int[] sortedElements = new int[firstLength + secondLength];

        while (firstArrayIndex < firstLength && secondArrayIndex < secondLength) {
            if (first[firstArrayIndex] < second[secondArrayIndex]) {
                sortedElements[resultantIndex++] = first[firstArrayIndex++];
            } else {
                sortedElements[resultantIndex++] = second[secondArrayIndex++];
            }
        }

        while (firstArrayIndex < firstLength) {
            sortedElements[resultantIndex++] = first[firstArrayIndex++];
        }

        while (secondArrayIndex < secondLength) {
            sortedElements[resultantIndex++] = second[secondArrayIndex++];
        }

        return sortedElements;
    }
}
