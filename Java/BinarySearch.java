import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,2,0,8,9,6};
        int tofindtarget = 9;
        int targetindex = binarySearch(arr, tofindtarget);
        System.out.print("Element found at index position: ");
        System.out.println(targetindex);
    }


    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                return mid;
            }
        }
        return -1;
    }
}
