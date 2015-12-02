#include <string>
#include <stack>
#include <vector>
using namespace std;

class ToPostfix {
    public:
	ToPostfix(string input);
	string getString();
        void getPostfixString();	
	void readInputWrap();
	void outputAnswer();
    private:
	string input;
	stack<char> operatorStack;
	vector<char> postfixExpr;

	int operatorOrder(char token);
	void execOperator(char token);
	void execParenthesis();
	void readInput();
	int evaluateExpr();	
	
};


