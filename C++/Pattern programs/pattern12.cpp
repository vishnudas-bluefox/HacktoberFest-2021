#include<stdio.h>
#include<conio.h>
#include<iostream>

using namespace std;

int main()
{
    int n,row,col;

    cout<<"Enter value of n : ";
    cin>>n;

    for(row=1;row<=2*n;row++)
    {
        int spaces;

        if(n<row)
        {
            spaces = 2*n - row;

            for(int i=1;i<=spaces;i++)
            {
                cout<<" ";
            }
            for(col=1;col<=row-n;col++)
            {
                cout<<"* ";
            }
            for(int j=1;j<=spaces;j++)
            {
                cout<<" ";
            }
            cout<<endl;
        }
        else
        {
            spaces = row - 1;

            for(int i=1;i<=spaces;i++)
            {
                cout<<" ";
            }
            for(col=1;col<=n-row+1;col++)
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
}
