package colorchooser;

import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author 01753303
 */
public class JRegExField extends JTextField {
    private String exp;

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
        setDocument(new RegExDocument(exp));
    }
    
    public JRegExField() {
        super();
    }
    
    public JRegExField(String exp) {
        super();
        this.exp = exp;
        //setDocument(new RegExDocument(exp)); 
    }
    
    @Override
    protected Document createDefaultModel() {
        return new RegExDocument(exp);
    }
}
