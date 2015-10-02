#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long count( long S[], long m, long n )
{
    long i, j, x, y;
 
    // n + 1 rows for n = 0 case 
    long table[n+1][m];
    
    // if n = 0
    for (i=0; i<m; i++)
        table[0][i] = 1;
 
    // bottom up fill entries
    for (i = 1; i < n+1; i++)
    {
        for (j = 0; j < m; j++)
        {
            // count solutions 
            x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;
 
            // count solutions without S[j]
            y = (j >= 1)? table[i][j-1]: 0;
 
            // total
            table[i][j] = x + y;
        }
    }
    return table[n][m-1];
}

int main() {
    
    long m, n, a;
    cin >> n >> m;
    
    long arr[m];
    
    for (int i = 0; i < m; i++) {
        cin >> a;
        arr[i] = a;
    }

    printf("%ld", count(arr, m, n));
    return 0;
    
}
