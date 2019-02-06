package colorchooser;

/**
 *
 * @author 01753303
 */
public class JIntegerField extends JRegExField {
    public JIntegerField() {
        super();
        setExp("[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]");
    }
    
    public int getValue() throws NumberFormatException { 
        return Integer.parseInt(getText());
    }
}
