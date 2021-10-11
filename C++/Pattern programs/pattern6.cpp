#include<stdio.h>
#include<conio.h>
#include<iostream>

using namespace std;

int main()
{
    int n,row,col,spaces;

    cout<<"Enter value of n : ";
    cin>>n;

    for(row=1;row<=n;row++)
    {
        spaces = n-row;
        for(int i=1;i<=spaces;i++)
        {
            cout<<" ";
        }
        for(col=1;col<=row;col++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
}
