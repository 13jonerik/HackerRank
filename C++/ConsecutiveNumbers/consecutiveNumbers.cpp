#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {

    int t, n;
    cin >> t;
    int a;
    vector<int> list;
    int streak = 0;
    int longest = 0;
    
    for (int j = 0; j < t; j++) {
        
        cin >> n;

        streak = 1;
        longest = 1;
        
        for (int z = 0; z < n; z++) {
            cin >> a;
            list.push_back(a);
        }
        
        sort(list.begin(), list.end());
        unique(list.begin(), list.end());

        for (int i = 1; i <= list.size() + 1; i++) {
            if (list[i] == list[i-1] + 1) {
                ++streak;
            } else if (streak > longest) {
                    longest = streak;
                    streak = 1;
            }
        }
        

        cout << longest << endl;
    
        list.clear();
    }
    
    return 0;
}
