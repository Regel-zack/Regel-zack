package AwtSwing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class MyBoxLayout02 {
    public void show(){
        Frame f = new Frame("123");
        f.setLayout(new BorderLayout());

        Box vbox = Box.createHorizontalBox();
        vbox.add(new Button("1011"));
        vbox.add(Box.createHorizontalGlue());
        vbox.add(new Button("1012"));
        vbox.add(Box.createHorizontalStrut(20));
        vbox.add(new Button("1013"));

        Box hbox = Box.createVerticalBox();
        hbox.add(new Button("1014"));
        hbox.add(Box.createVerticalGlue());
        hbox.add(new Button("1015"));
        hbox.add(Box.createVerticalStrut(20));
        hbox.add(new Button("1016"));


        f.add(vbox,BorderLayout.NORTH);
        f.add(hbox,BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);

    }
}
