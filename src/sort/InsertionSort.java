package sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Insertion Sort
 *
 * Best : Ω(n)
 * Worst : O(n^2)
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {0, 10, 6, 2, 9, 3, 1, 5};

        sort(arr);

        print(arr);
    }

    private static void sort(int[] arr) {
        int size = arr.length;

        for(int i = 1; i < size; i++) {
            int current = arr[i];
            int position = i;

            while (position > 0 && arr[position - 1] > current) {
                arr[position] = arr[position - 1];
                position = position - 1;
            }

            arr[position] = current;
        }
    }

    private static void print(int[] arr) {
        System.out.println(
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(","))
        );
    }

}
