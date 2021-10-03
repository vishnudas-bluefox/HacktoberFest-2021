#include<iostream>
#include<unordered_set>

using namespace std;

 int doUnion(int a[], int n, int b[], int m){
unordered_set<int> s;
for(int i=0;i<n;i++){
    s.insert(a[i]);
}
for(int i=0;i<m;i++){
    s.insert(b[i]);
}
cout<<"size of aray is "<<s.size()<<endl;
return s.size();
 }

 int main(){

int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};
    int n= sizeof(a)/sizeof(a[0]);
    int m= sizeof(b)/sizeof(b[0]);
   cout<<doUnion(a,n,b,m);
    return 0;
}
