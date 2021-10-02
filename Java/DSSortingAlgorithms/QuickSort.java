package DSSortingAlgorithms;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Quicksort(arr,0,n-1);
        for (int item : arr
        ) {
            System.out.println(item);
        }

    }
// Partition Function
    public static int partition(int []arr,int low, int high) {
        int pivot = arr[low];
        int i = low+1;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
// QuickSort Function
    public static void Quicksort(int [] arr,int low ,int high) {
        if (low < high) {
            int pivot;
            pivot = partition(arr,low,high);
            Quicksort(arr,low,pivot-1);
            Quicksort(arr,pivot+1,high);
        }
    }
}
