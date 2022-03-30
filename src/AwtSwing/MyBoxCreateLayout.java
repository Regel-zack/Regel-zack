package AwtSwing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class MyBoxCreateLayout {
    public void show() {
        Frame frame = new Frame("123");

        frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));

        Box box = Box.createHorizontalBox();
        box.add(new Button("何为"));
        box.add(new Button("1012"));

        Box box1 = Box.createVerticalBox();
        box1.add(new Button("1013"));
        box1.add(new Button("1014"));

        frame.add(box);
        frame.add(box1);

        frame.pack();

        frame.setVisible(true);
    }
}
