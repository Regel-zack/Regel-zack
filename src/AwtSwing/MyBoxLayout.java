package AwtSwing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class MyBoxLayout {
    public void show() {
        // 1. 基于frame 容器，创建一个BoxLayout对象，并将这个对象传入frame
        Frame frame = new Frame("My BoxLayout!");

        // 2. 把BoxLayout对象设置给frame
        frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));

        // 3. 往frame添加两个按钮组件
        frame.add(new Button("第一个"));
        frame.add(new Button("第二个"));

        frame.pack();

        frame.setVisible(true);


    }
}
