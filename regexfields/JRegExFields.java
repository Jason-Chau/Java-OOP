/*
Program Name:           JRegExFields
Program Author:         Jason Chau
Date Created:           11/26/17
*/
package regexfields;

import javax.swing.*;
import javax.swing.text.*;

public class JRegExFields extends JTextField {
    private String exp;
    public JRegExFields() {
        super();
    }
    public JRegExFields(String exp) {
        super();    // to force some actions in the parent class
        this.exp = exp;
        // not clear if needed - may be called automatically by parent class
        setDocument(new RegExDocument(exp)); 
    }
    public String getExp() {
        return exp;
    }
    public void setExp(String exp) {
        this.exp = exp;
        setDocument(new RegExDocument(exp));
    }
    @Override
    protected Document createDefaultModel(){
        return new RegExDocument(exp);
    }
}