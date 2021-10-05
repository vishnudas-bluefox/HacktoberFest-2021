#include <iostream>
using namespace std;

void bubbleSort(int arr[], int n){
    bool swapped;
    for(int i = 0; i < n-1; i++){
        swapped = false;
        for(int j = 0; j < n-1; j++){
            if(arr[j] > arr[i]){
                swap(arr[j], arr[j+1]);
                swapped = true;
            }
        }
        if(swapped == false){
            break;
        }
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
    bubbleSort(arr,n);
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


// Time Complexity - O(N^2) in worst and avg. case
// O(N) in best case