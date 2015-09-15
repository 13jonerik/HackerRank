#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    
    int len;
    cin >> len;
    unsigned x;
    
    for (int i = 0; i < len; i++) {
        cin >> x;
        cout << ~x << endl;
    }
    return 0;
}

