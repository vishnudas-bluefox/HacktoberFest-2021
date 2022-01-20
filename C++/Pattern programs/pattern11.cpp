#include<stdio.h>
#include<conio.h>
#include<iostream>

using namespace std;

int main()
{
    int n,row,col;

    cout<<"Enter value of n : ";
    cin>>n;

    for(row=n;row>=1;row--)
    {
        int spaces;
        spaces = n - row;

        for(int i=1;i<=spaces;i++)
        {
            cout<<" ";
        }
        for(col=1;col<=row;col++)
        {
            cout<<"* ";
        }
        for(int j=1;j<=spaces;j++)
        {
            cout<<" ";
        }
        cout<<endl;
    }
}
