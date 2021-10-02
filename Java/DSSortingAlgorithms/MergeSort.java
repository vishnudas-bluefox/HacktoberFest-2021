package DSA.DSSortingAlgorithms;

import java.util.Scanner;

public class MergeSort {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int n =sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
    }

    public static void merge(int[] arr, int beg, int mid, int end){
        int i=beg;
        int j=mid+1;
        int index=0;
        int [] temp=new int[100];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[index]=arr[i];
                i++;
            }
            else{
                temp[index]=arr[j];
                j++;
            }
            index++;
        }
        if(i>mid){
            while(j<=end){
                temp[index]=arr[j];
                index++;
                j++;
            }
        }
        else{
            while(i<=mid){
                temp[index]=arr[i];
                index++;
                i++;
            }
        }
        int k=0;
    }
}
