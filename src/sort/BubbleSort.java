package sort;

import java.util.Arrays;

/**
 * Bubble Sort
 *
 * Worst : O(n^2)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 6, 7};

        sort(arr);
        print(arr);
    }

    private static void sort(int[] arr) {
        int size = arr.length;
        boolean swap = true;

        int n = -1;

        while(swap) {
            swap = false;
            n = n + 1;

            for(int i = 1; i < size - n; i++) {
                if(arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                    swap = true;
                }
            }
        }
    }

    private static void print(int[] arr) {
        Arrays.stream(arr)
                .forEach(System.out::println);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
