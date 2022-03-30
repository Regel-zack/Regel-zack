package LoginWindom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Administrator
 */
public class MyActionLister implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField)e.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }
}


