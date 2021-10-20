// C++ program for recursive sorting
#include<iostream>
using namespace std;
int sort(int arr[20], int n);
int main()
{
 int i;
 int arr[20];
 int n;
 cout<<"Enter the size of the array"<<endl;
 cin>>n;
 cout<<"Enter the elements of the array"<<endl;
 for(i=0;i<n;i++)
 {
     cin>>arr[i];
 }
sort(arr,n);
cout<<"The sorted array is:"<<endl;
for(i=0;i<n;i++)
cout<<arr[i]<<"\t";
return 0;
}
int sort(int arr[20], int n)
{
    int i;
    int temp;
    if(n==1)
    return 0;
    int min=0;
    for(i=1;i<n;i++)
    if(arr[i]<arr[min])
       min=i;
      temp=arr[0];
      arr[0]=arr[min];
      arr[min]=temp;
     return sort(&arr[1],n-1);

}