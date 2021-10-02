package DSSortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Press 1 for sorting in ascending order and press 2 for sorting in descending order");
        int choice = sc.nextInt();

        if (choice == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (a[j] < a[i]) {
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (a[j] > a[i]) {
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }


        for (int item : a
        ) {
            System.out.println(item);
        }

    }

}
