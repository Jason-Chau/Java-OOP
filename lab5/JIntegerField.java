/*
Program Name:           JIntegerField
Program Author:         Jason Chau
Date Created:           11/8/17
*/
package lab5;

public class JIntegerField extends JRegExField{
    public JIntegerField(){
        super();
        setExp("[[0-9]\\+\\-\\*\\/\\.]*$");
    }
    public int getValue() throws NumberFormatException{
        return Integer.parseInt(getText());
    }
}