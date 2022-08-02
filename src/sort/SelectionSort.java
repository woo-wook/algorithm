package sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Selection Sort
 *
 * Worst : O(n^2)
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10, 6, 2, 9, 3};

        sort(arr);
        print(arr);
    }

    private static void sort(int[] arr) {
        int size = arr.length;

        for(int i = 0; i < size; i++) {
            int min = i;

            for(int j = i + 1; j < size; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            swap(arr, i, min);
        }
    }

    private static void print(int[] arr) {
        System.out.println(
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(","))
        );
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
