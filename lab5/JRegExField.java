/*
Program Name:           JRegExField
Program Author:         Jason Chau
Date Created:           11/8/17
*/
package lab5;
import javax.swing.*;
import javax.swing.text.*;

public class JRegExField extends JTextField {
    private String exp;
    public String getExp() {
        return exp;
    }
    public void setExp(String exp) {
        this.exp = exp;
        setDocument(new RegExDocument(exp));
    }
    public JRegExField(){
        super();
    }
    public JRegExField(String exp){
        super();
        this.exp = exp;
    }
    @Override
    protected Document createDefaultModel(){
        return new RegExDocument(exp);
    }
}
