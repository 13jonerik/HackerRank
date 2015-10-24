#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> findFactors(int num) {
    vector<int> factors;
    for (int i = 1; i <= num; ++i){
        if (num % i == 0){
            factors.push_back(i);
        }
    }
    return factors;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n, q;
    cin >> n >> q;
    int sum = 0;
    int temp;
    
    cin >> temp;
    for (int i = 0; i < q; i++) {
        sum = 0;
        n = n * temp;
        vector<int> found = findFactors(n);
        for ( auto i = found.begin(); i != found.end(); i++ ) {
            sum+= *i;
            //cout << sum << " ";
        }
        
        cin >> temp;
        cout << sum << endl;
        //found.clear();
    }

    
    return 0;
}
