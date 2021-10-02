#include <bits/stdc++.h>
using namespace std;

void array_insertion(int array[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << "Enter the element " << i + 1 << " in the array: ";
        cin >> array[i];
        cout << endl;
    }
}

void display(int array[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << array[i] << " ";
    }
    cout << endl;
}

void insertion_from_the_end(int array[], int no_of_element, int element_to_be_inserted)
{

    array[no_of_element] = element_to_be_inserted;
}

void insertion_of_element_from_beginning(int array[], int size, int element_to_be_inserted)
{
    for (int i = element_to_be_inserted; i >= 0; i--)
    {
        array[i + 1] = array[i];
    }

    array[0]=element_to_be_inserted;
}

void insertion_of_element_at_randompos(int array[], int size, int element_to_be_inserted, int position)
{
    for (int i = size; i>= position ; i--)
    {
        array[i+1]=array[i];
    }
    array[position]= element_to_be_inserted;

}
int main()
{
    int element_end_insert;
    int choice, position, no_of_elements, element_beg_insert;
    int array[100];
    do
    {

        cout << "1. Enter the array" << endl;
        cout << "2. Insertion of the element from the end" << endl;
        cout << "3. Insertion of the element from the beginning" << endl;
        cout << "4. Insertion of the element in the random position" << endl;
        cout << "5. display the array" << endl;
        cout << "6. exit" << endl;

        cout << "Enter your choice: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
        {
            cout << "Enter the Numbers of the elements that you want to insert";
            cin >> no_of_elements;
            array_insertion(array, no_of_elements);

            break;
        }
        case 2:
        {
            cout << "Enter the element that you want to insert in the end: ";
            cin >> element_end_insert;
            insertion_from_the_end(array, no_of_elements, element_end_insert);
            no_of_elements += 1;

            break;
        }
        case 3:
        {
            cout << "Enter the element that you want to insert in the beginning: ";
            cin >> element_beg_insert;
            insertion_of_element_from_beginning(array, no_of_elements, element_beg_insert);
            no_of_elements += 1;

            break;
        }
        case 4:
        {
            cout << "Enter the position you want to insert the Value: ";
            cin >> position;
            cout << "Enter the element you want to insert in the array: ";
            cin >> element_end_insert;
            insertion_of_element_at_randompos(array, no_of_elements, element_end_insert, position);
            no_of_elements += 1;

            break;
        }
        case 5:
        {
            display(array,no_of_elements);
            break;
        }
        case 6:{
            break;
        }
        default:
            cout << "WRONG CHOICE!!!!!!!!!!!!!!!!!!!!!!";
        }
    } while (choice != 6);
}