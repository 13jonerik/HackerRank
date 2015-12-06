#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    Scanner sc = new Scanner (System.in);
    int len    = sc.nextInt();
    vector<int> n;
    
    for (int i = 0; i < len; i++) {
        n.push_back(sc.nextInt());
    }
    
    sort(n.begin(), n.end());
    
    for (int j = 0; j < n.size(); j++) {
        System.out.println(n[j] + " ");
    }
    
    
    return 0;
}

