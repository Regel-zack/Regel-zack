package DialogLearn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Administrator
 */
public class MyDialog01 {
    void init(){
        Frame frame = new Frame("Dialog");

        Dialog dialog01 = new Dialog(frame, "dialog01", true);
        Dialog dialog02 = new Dialog(frame, "dialog02", false);

        dialog01.setBounds(20,30,300,200);
        dialog02.setBounds(20,30,300,200);

        Button open_dialog01 = new Button("Open dialog01");
        Button open_dialog02 = new Button("Open dialog02");

        open_dialog01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog01.setVisible(true);
            }
        });

        open_dialog02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog02.setVisible(true);
            }
        });

        frame.add(open_dialog01,BorderLayout.NORTH);
        frame.add(open_dialog02,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
