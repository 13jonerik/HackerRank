#include "Parse.h"
#include <vector>
#include <string>
#include <iostream>
#include <cstdlib>
using namespace std;

// Macro for converting Ascii value char to int value
#define toDigit(c) (c-'0');


// ToPostfix class constructor - passes in user input
ToPostfix::ToPostfix(string in) {
    input = in;
}


// Helper function for testing purposes - returns user input string
string ToPostfix::getString() {
    return input;
}


// Helper function to output expression after moving to Postfix form
void ToPostfix::getPostfixString() {
    for (int x = 0; x <= postfixExpr.size(); x++ ) {
        cout << postfixExpr[x] << ' ';
    }
}


// Check the precedence of an operator
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

/*
   Read the input expression char by char and execute the correct
   procedure based in the input. Wrapper function used to keep this private
*/
void ToPostfix::readInput() {

    char token;
    
    for (int i = 0; i < input.length(); i++) {
	token = input[i];
	    switch (token) {
	        case ' ':
  			continue; 
		case '+':
		case '*':
			execOperator(token);
			continue;
		case ')':
			execParenthesis();
			continue;
		case '(':
			operatorStack.push(token);
			continue;
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

    while (!operatorStack.empty()) {
	char temp = operatorStack.top();
	operatorStack.pop();
	postfixExpr.push_back(temp);
    }
}

// Wrapper for readInput function
void ToPostfix::readInputWrap() {
    readInput();
}


/*
   If token is an operator, check precedence and pop operators 
   of greater precedence onto postfix vector until operatorStack
   is empty, or parenthesis is encountered
*/
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

/*
   If a parenthesis is seen, pop operators to postfix vector until
   left parenthesis is encountered, and then pop the parenthesis 
*/
void ToPostfix::execParenthesis() {

    while (!operatorStack.empty() && operatorStack.top() != '(' ) {
	char temp = operatorStack.top();
	postfixExpr.push_back(temp);
	operatorStack.pop();
    }
    operatorStack.pop();
}


/*
   Use a temp stack to evaluate the expression now that the 
   input is in postfix form. If a digit is seen, then push it
   to the stack. If an operator is seen, pop two digits from 
   the stack and push the resulting value back to the stack.
   Return the result.
*/
int ToPostfix::evaluateExpr() {
    stack<int> eval;
    int left;
    int right;
    int total;

    for (int i = 0; i < postfixExpr.size(); i++ ) {
        char temp = postfixExpr[i];
	if(isdigit(temp)) {
	    int digit = toDigit(temp);
	    eval.push(digit);
	} else if (temp == '+') {
	    left = eval.top(); eval.pop();
	    right = eval.top(); eval.pop();
	    total = left + right;
	    eval.push(total);
	} else {
	    left = eval.top(); eval.pop();
	    right = eval.top(); eval.pop();
	    total = left * right;
	    eval.push(total);
	}
    }

    total = eval.top();
    return total;
}


// Wrapper function to keep evaluate function private
void ToPostfix::outputAnswer() {
    cout << "Answer: " << evaluateExpr() << endl;
}


/* Main Function */

int main() {

    string input = "";
    cout << "Enter Expression to Evaluate: ";
    getline(cin, input); 

    ToPostfix pf = ToPostfix(input);

    try {
    	pf.readInputWrap();
    	pf.outputAnswer();
    } catch (runtime_error & err) {
	cout << err.what();
    }

    return 0;
}


// Dykstra's Shunting Yard Algorithm
// Transforms Infix notation into Postfix
// notation, which is quicker and easier
// to compute





