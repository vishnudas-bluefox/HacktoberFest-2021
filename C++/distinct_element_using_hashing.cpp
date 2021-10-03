#include<iostream>
#include<unordered_set>
using namespace std;

int distinctElem(int a[], int n){
unordered_set<int> s;
for(int i=0;i<n;i++){
    s.insert(a[i]);
}
return s.size();
}


int main(){
int a[]={1,1,2,3,4,5,6,23,4,4,2,3,5,67};
int size=sizeof(a)/sizeof(a[0]);
cout<<"distinct elemnts = "<<distinctElem(a,size)<<endl;
    return 0;
}
