package sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Merge Sort
 *
 * Worst : O(nlogn)
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 6, 7};

        sort(arr);
        print(arr);
    }

    private static int[] sort(int[] arr) {
        if(arr.length <= 1) {
            return arr;
        }

        int center = arr.length / 2; // 중심부

        int[] left = sort(Arrays.copyOfRange(arr, 0, center)); // 3, 6
        int[] right = sort(Arrays.copyOfRange(arr, center, arr.length));

        int lc = 0;
        int rc = 0;

        while (lc < left.length && rc < right.length) {
            if(left[lc] <= right[rc]) {
                arr[lc + rc] = left[lc];
                lc++;
            } else {
                arr[lc + rc] = right[rc];
                rc++;
            }
        }

        for(; lc < left.length; lc++) {
            arr[lc + rc] = left[lc];
        }

        for(; rc < right.length; rc++) {
            arr[lc + rc] = right[rc];
        }

        return arr;
    }

    private static void print(int[] arr) {
        System.out.println(
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(","))
        );
    }
}
