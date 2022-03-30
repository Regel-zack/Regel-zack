package FileDialogLearn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Administrator
 */
public class MyFileDialog {

    public void init(){
        Frame frame = new Frame();

        FileDialog openDialog = new FileDialog(frame,"openFile",FileDialog.LOAD);
        FileDialog saveDialog = new FileDialog(frame,"saveFile",FileDialog.SAVE);

        Button openButton = new Button("Please input you want opened file");
        Button saveButton = new Button("Please input you want saved file");

        openButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                openDialog.setVisible(true);

                String openDirectory = openDialog.getDirectory();
                String openDialogFile = openDialog.getFile();

                System.out.println("Your open directory is :" + openDirectory);
                System.out.println("Your open file's name is :" + openDialogFile);

            }

        });

        saveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                saveDialog.setVisible(true);

                String saveDirectory = saveDialog.getDirectory();
                String saveDialogFile = saveDialog.getFile();

                System.out.println("Your save directory is :" + saveDirectory);
                System.out.println("Your save file's name is :" + saveDialogFile);

            }

        });

        frame.add(openButton,BorderLayout.NORTH);
        frame.add(saveButton,BorderLayout.CENTER);

        frame.setVisible(true);
        frame.pack();

    }





}
