#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int cases;
    cin >> cases;
    
    int a;
    int b;
    for (int i = 0; i < cases; i++){
        cin >> a;
        cin >> b;
        if (a == 0 || b == 0) {
            cout << "First" << endl;
        }else if (a%2 == 0 ^ b%2 == 0){
            cout << "First" << endl;
        } else {
            cout << "Second" << endl;
        }
    }
    
    return 0;
}

