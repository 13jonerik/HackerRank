#include <iostream>
using namespace std;

int height(int n) {
    if (n == 0) return 0; 
    int sum = 1;
    if (n == 1) { return sum; }
    if (n % 2 == 0) { return sum + height(n-1); }
    else { return sum + height(n-1) * 2; }
}
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << height(n)+1 << endl;
    }
}
