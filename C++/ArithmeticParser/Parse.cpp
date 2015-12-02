#include "Parse.h"
#include <vector>
#include <string>
#include <iostream>
#include <cstdlib>
using namespace std;


ToPostfix::ToPostfix(string in) {
    input = in;
}

string ToPostfix::getString() {
    return input;
}

int ToPostfix::operatorOrder(char token) {
    enum { low, mid, high };
    
    switch (token) {		// can extend this for any other operators
	case '+':		// included 3 precedence levels for further additions
	    return mid;
	case '*':
	    return high;
	default:
	    return low;
    }
}


void ToPostfix::readInput() {

    char token;
    
    for (int i = 0; i < input.length(); i++) {
	token = input[i];
	    switch (token) {
	    
		case '+':
		case '*':
			execOperator(token);
			break;
		case ')':
			execParenthesis();
			break;
		case '(':
			operatorStack.push(token);
			break;
		default:
			int num;
			if (isdigit(token)) {
			    postfixExpr.push_back(token);
 			} else {
			    throw invalid_argument( "Invalid Character Input!" );
			    //cout << "Invalid Input!" << endl;
			}
	    }
    }	
}

void ToPostfix::execOperator(char token) {
    while (!operatorStack.empty() && operatorStack.top() != '(' ) {
	char temp = operatorStack.top();
	if (operatorOrder(temp) < operatorOrder(token)) {
	    break;
	}

	postfixExpr.push_back(temp);
	operatorStack.pop();
    }

    operatorStack.push(token);	
}

void ToPostfix::execParenthesis() {
    while (!operatorStack.empty() && operatorStack.top() != '(' ) {
	char temp = operatorStack.top();
	postfixExpr.push_back(temp);
	operatorStack.pop();
    }

    operatorStack.pop();
}

void ToPostfix::getPostfix() {
    for (int x = 0; x < postfixExpr.size(); x++ ) {
        cout << postfixExpr[x] << ' ';
    }
}


int main() {
    string input = "";
    cout << "Enter Expression to Evaluate: " << endl;
    getline(cin, input); 

    //cout << input << endl;
    ToPostfix pf = ToPostfix(input);
    cout << pf.getString();

    try {
    	pf.readInput();
    } catch (runtime_error & err) {
	cout << err.what();
    }


    /*
    for (auto c: pf.postfixExpr) {
	cout << c << ' ';
    }
    */


    pf.getPostfix();

    return 0;

}



// Dykstra's Shunting Yard Algorithm

// Followed by Tree Structure





