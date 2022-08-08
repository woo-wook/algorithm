package sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Quick Sort
 *
 * Best : Ω(nlogn)
 * Worst : O(n^2)
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {0, 10, 6, 2, 9, 3, 1, 5};

        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    private static void sort(int[] arr, int left, int right) {
        if(left >= right) { // 정렬 대상 없음
            return;
        }

        int pivot = partition(arr, left, right);

        sort(arr, left, pivot - 1);
        sort(arr, pivot + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int leftCursor = left;
        int rightCursor = right;
        int pivot = arr[left];

        while (leftCursor < rightCursor) {
            while (arr[rightCursor] > pivot && leftCursor < rightCursor) {
                rightCursor--;
            }

            while (arr[leftCursor] <= pivot && leftCursor < rightCursor) {
                leftCursor++;
            }

            swap(arr, leftCursor, rightCursor);
        }

        swap(arr, left, leftCursor);

        return leftCursor;
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
