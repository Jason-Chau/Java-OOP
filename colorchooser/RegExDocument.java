package colorchooser;

import java.util.regex.*;
import javax.swing.text.*;
/**
 *
 * @author 01753303
 */
public class RegExDocument extends PlainDocument {
    private String exp;
    private Pattern pattern;
    private Matcher matcher;
    
    public RegExDocument(String exp) {
        if (exp == null) 
            exp = "\\.*"; // accepts anything zero or more times
        this.exp = exp;
        pattern = Pattern.compile(exp);
    }
    
    public boolean validate(String str) {
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
    
    @Override
    public void insertString(int offSet, String str, AttributeSet a) throws BadLocationException { 
        StringBuilder sb = new StringBuilder(getText(0, getLength()));
        sb.insert(offSet, str); // the location where you want to insert
        if (validate(sb.toString()))
            super.insertString(offSet, str, a);
    }
}
