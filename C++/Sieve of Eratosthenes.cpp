#include <bits/stdc++.h>
using namespace std;
 
void SieveOfEratosthenes(int num)
{
    bool is_prime[num + 1];
    memset(is_prime, true, sizeof(is_prime));
 
    for (int i = 2; i * i <= num; i++)
    {
        if (is_prime[i] == true)
        {
            for (int j = i * i; j <= num; j += i)
                is_prime[j] = false;
        }
    }
 
    for (int i = 2; i <= num; i++)
        if (is_prime[i])
            cout << i << " ";
}
 
int main()
{
    int num;
    cout << "Enter the number upto which prime nos will be checked";
    cin >> num;
    cout << "Following are the prime numbers smaller than or equal to " << num << endl;
    SieveOfEratosthenes(num);
    return 0;
}