/*
Program Name:           JDoubleField
Program Author:         Jason Chau
Date Created:           11/26/17
*/
package regexfields;

public class JDoubleField extends JRegExFields {
    public JDoubleField(String exp) {
        super(exp);
    }
    public JDoubleField() {
        super();
        setExp("-?[0-9]*\\.?[0-9]*");
    }
}
