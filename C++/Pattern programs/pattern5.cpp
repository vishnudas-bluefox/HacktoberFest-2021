#include<stdio.h>
#include<conio.h>
#include<iostream>

using namespace std;

int main()
{
    int n,row,col,index;

    cout<<"Enter value of n : ";
    cin>>n;

    for(row=1;row<=2*n;row++)
    {
        if(row>n)
        {
            index = 2*n-row;
        }
        else
        {
            index=row;
        }
        for(col=1;col<=index;col++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
}
