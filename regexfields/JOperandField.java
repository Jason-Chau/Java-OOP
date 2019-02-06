/*
Program Name:           JOperandField
Program Author:         Jason Chau
Date Created:           11/26/17
*/
package regexfields;

public class JOperandField extends JRegExFields {
    public JOperandField(){
        super();
        setExp("-?[0-9]*\\.?[0-9]*");
    }
    public Term getTerm() {
        int index;
        Double operand; 
        char operation = getText().charAt(0); // Get operand
        switch (operation){
            case '+': index = 1;
                break;
            case '-': index = 1; 
                break;
            case '*':  index = 1;
                break;
            case '/':  index = 1;
                break;
            case '=':  index = 1;
                break;
            default: index = 0;
                operation = '+';  // No operand = Add    
                break;
        }
        operand = Double.parseDouble(getText().substring(index));
        Term term = new Term(operation, operand);
        return term;
    }
}