/*
Program Name:           JIntegerField
Program Author:         Jason Chau
Date Created:           11/26/17
*/
package regexfields;

public class JIntegerField extends JRegExFields {
    public JIntegerField(){
        super();
        setExp("-?[0-9]*");
    }
    public int getValue() throws NumberFormatException {
        return Integer.parseInt(getText());
    }   
}
