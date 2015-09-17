#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

 
vector<int>dfsNum;
vector<vector<int>>AdjList;
 
void depthFirstSearch(int u) {
 
        dfsNum[u] = 1; 
    
        for(int i=0; i < AdjList[u].size(); i++) {
                int v = AdjList[u][i];
                if(!dfsNum[v]) {
                        depthFirstSearch(v);
                        dfsNum[u] += dfsNum[v];
                }
        }
}
 
 
int main() {
 
        int N, M;
        cin >> N >> M;
 
        AdjList.resize(N);
        dfsNum.assign(N,0);
 
        int u, v;
        for(int j = 0; j < M; j++) {
                cin >> u >> v;
                AdjList[u-1].push_back(v-1);
                AdjList[v-1].push_back(u-1);
        }
 
        depthFirstSearch(0);            //
 
        int count = 0;                  // Count nodes with even children
 
        for(int i=0; i < N; i++) 
                if(dfsNum[i] != N && dfsNum[i] % 2 == 0)        // if node has children and even, increment count  
                    count++; 
       
        cout << count << endl;
}
