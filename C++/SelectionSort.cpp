#include <iostream>
using namespace std;

void selectionSort(int arr[], int n){
    int mid_idx;
    for(int i = 0; i < n-1; i++){
        mid_idx = i;
        for(int j = i+1; j < n; j++){
            if(arr[j] < arr[mid_idx]){
                mid_idx = j;
            }
        }
        swap(arr[i], arr[mid_idx]);
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
    selectionSort(arr,n);
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


// Time Complexity - O(N^2) in worst, average and best case
