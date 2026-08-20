package hard2;

import java.util.Arrays;
import java.util.Scanner;

public class Hard2 {

    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i +1) + " элемент массива");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mergeSort(arr)));;
    }

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return arr;
        }
        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);

    }
    private static int[] merge(int[] left, int[] right) {
        int[] tempArr = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                tempArr[k++] = left[i++];
            } else {
                tempArr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            tempArr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            tempArr[k] = right[j];
            k++;
            j++;
        }
        return tempArr;
    }
}
