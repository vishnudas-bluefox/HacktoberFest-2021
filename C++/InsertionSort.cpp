#include <iostream>
using namespace std;

void insertionSort(int arr[], int n){
    int key;
    for(int i = 0; i < n-1; i++){
        key = arr[i];
        int j = i-1;
        while(j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }
    //Printing before sorting
    for(int i = 0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    insertionSort(arr,n);
    //Printing after sorting
    for(int i = 0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
//Input - 
// 5
// 2 4 3 6 7

// Output - 2 3 4 6 7


// Time Complexity - O(N^2) in worst and average case.
// O(N) in best case
