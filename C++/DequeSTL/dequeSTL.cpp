#include <iostream>
#include <deque> 
using namespace std;
int main() {

    ios_base::sync_with_stdio(false);
    deque<int> sub;
    int tests, size, subSize, add, t;
    cin >> tests;
    
    int max = 0;
    for (int i = 0; i < tests; i++) {
        cin >> size >> subSize;
        for (int j = 0; j < subSize; j++) {
            cin >> add;
            if (add > max) {
                max = add;
            }
            sub.push_back(add);
        }
        
        cout << max << " ";
        
        
        for (int i = 0; i < size - subSize; i++) {
            sub.pop_front();
            cin >> add;
            sub.push_back(add);
            max = sub.at(0);
            
            for (int j = 1; j < subSize; j++) {
                add = sub.at(j);
                //cout << add << "*";
                    if (add > max){
                    max = add;
                }
            }
            cout << max << " ";
        }
        
        cout << endl;
        sub.clear();
    }
    
    
    
    return 0;
}
