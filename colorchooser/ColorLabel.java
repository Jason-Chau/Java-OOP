/*
Program Name:           ColorLabel
Program Author:         Jason Chau
Date Created:           11/26/17
*/
package colorchooser;

import javax.swing.JLabel;

public class ColorLabel extends JLabel implements ColorListener {
    public ColorLabel(){
        super();
        setText("HEX ");
    }
    @Override
    public void changeColor(ColorEvent ce) {
        String hexRed = Integer.toHexString(ce.getColor().getRed());
        String hexBlue = Integer.toHexString(ce.getColor().getBlue());
        String hexGreen = Integer.toHexString(ce.getColor().getGreen());
        setText("HEX " + hexRed + hexGreen +hexBlue);
    }   
}