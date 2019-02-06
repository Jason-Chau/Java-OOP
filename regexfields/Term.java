/*
Program Name:           Term
Program Author:         Jason Chau
Date Created:           11/26/17
*/
package regexfields;

public class Term {
    char operation; // Operation, a[dd], s[ubtract], m[ultiply], d[ivide]
    double operand;    
    public Term(char operation, double operand) {
        this.operation = operation;
        this.operand = operand;
    }
    public Term (Term term){
        this.operation = term.getOperation();
        this.operand = term.getOperand();
    }
    public char getOperation() {
        return operation;
    }
    public void setOperation(char operation) {
        this.operation = operation;
    }
    public double getOperand() {
        return operand;
    }
    public void setOperand(double operand) {
        this.operand = operand;
    }
}