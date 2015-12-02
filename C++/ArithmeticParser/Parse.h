#include <string>
#include <stack>
#include <vector>
using namespace std;

class ToPostfix {
    public:
	ToPostfix(string input);
	// processInput();
	string getString();
        void getPostfix();	
	void readInput();
    private:
	string input;
	int operatorOrder(char token);
	void execOperator(char token);
	void execParenthesis();
	stack<char> operatorStack;
	vector<char> postfixExpr;

};




