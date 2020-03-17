package leetcode.oo.sort;

public final class Ints {

    /**
     * Array of numbers;
     */
    private final int[] array;

    /**
     * Ctor.
     *
     * @param array Array
     */
    public Ints(final int[] array) {
        this.array = array;
    }

    /**
     * Sort those numbers
     *
     * @return Sorted numbers.
     */
    public int[] mergeSorted() {
        return Ints.sort(this.array);
    }

    /**
     * Sort array.
     *
     * @param array Array to sort
     * @return Sorted array
     */
    private static int[] sort(final int[] array) {
        if (array.length == 1) {
            return array;
        }
        final int[] first = new int[array.length / 2];
        final int[] second = new int[array.length / 2];
        System.arraycopy(
                array,
                0,
                first,
                0,
                first.length
        );
        System.arraycopy(
                array,
                first.length,
                second,
                0,
                second.length
        );
        Ints.sort(first);
        Ints.sort(second);
        Ints.merge(first, second, array);
        return array;
    }

    /**
     * Merge two arrays
     *
     * @param left        Left array
     * @param right       Right array
     * @param destination Destination
     */
    private static void merge(
            final int[] left,
            final int[] right,
            final int[] destination
    ) {
        int leftIndex = 0;
        int rightIndex = 0;
        int position = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                destination[position++] = left[leftIndex++];
            } else {
                destination[position++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            destination[position++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            destination[position++] = right[rightIndex++];
        }
    }
}
