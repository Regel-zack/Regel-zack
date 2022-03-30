package menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * @author Administrator
 */
public class MyMenuLearn01 {

    Frame menuFrame = new Frame("It is a Menu!");

    MenuBar menuBar = new MenuBar();

    Menu fileMenu = new Menu("File");
    Menu editMenu = new Menu("Edit");
    Menu formatMenu = new Menu("Format");

    MenuItem autoEnter = new MenuItem("AutoEnter");
    MenuItem copy = new MenuItem("Copy");
    MenuItem paste = new MenuItem("Paste");

    MenuItem commentMenu = new MenuItem("Comment",new MenuShortcut(KeyEvent.VK_Q,true));
    MenuItem cancelCommentMenu = new MenuItem("CancelCommentMenu");

    TextArea textArea = new TextArea(5,30);

    public void init(){
        commentMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Now is :" + e.getActionCommand() + "\n");
            }
        });

        formatMenu.add(commentMenu);
        formatMenu.add(cancelCommentMenu);

        editMenu.add(autoEnter);
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.add(formatMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        menuFrame.setMenuBar(menuBar);

        menuFrame.add(textArea);

        menuFrame.pack();
        menuFrame.setVisible(true);

    }
}
