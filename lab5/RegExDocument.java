/*
Program Name:           RegExDocument
Program Author:         Jason Chau
Date Created:           11/8/17
*/
package lab5;
import javax.swing.text.*;
import java.util.regex.*;

public class RegExDocument extends PlainDocument{
    private String exp;
    private Pattern pattern;
    private Matcher matcher;
    public RegExDocument(){
        this(null);
    }
    public RegExDocument(String exp){
        if(exp == null)
            exp = "\\.*";
        this.exp = exp;
        pattern = Pattern.compile(exp);
    }
    public boolean validate(String str){
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
        StringBuilder sb = new StringBuilder(getText(0,getLength()));
        sb.insert(offs, str);
        if(validate(sb.toString()))
            super.insertString(offs, str, a);
    }
}