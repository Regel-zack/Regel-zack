package AwtSwing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class MyAwtLearn01 {
    Frame frame = new Frame("这里是基本组件");

    TextArea textAreaFeedback = new TextArea(5,20);

    Choice colorChoice = new Choice();

    CheckboxGroup genderCheckGroup = new CheckboxGroup();
    Checkbox male = new Checkbox("male", genderCheckGroup,true);
    Checkbox female = new Checkbox("female", genderCheckGroup,false);

    Checkbox isSoldier = new Checkbox("Is Soldier？");

    TextField textFieldInputWord = new TextField("Please enter your word!",20);
    Button buttonConfirm = new Button("I agree");

    List colorList = new List(6,true);

    /**
        组装界面方法
        无返回值
     */
    public void init(){
        // 组装底部
        Box bBox = Box.createHorizontalBox();
        bBox.add(textFieldInputWord);
        bBox.add(buttonConfirm);

        frame.add(bBox,BorderLayout.SOUTH);

        colorChoice.add("Red");
        colorChoice.add("green");
        colorChoice.add("blue");

        Box cBox = Box.createHorizontalBox();
        cBox.add(colorChoice);
        cBox.add(male);
        cBox.add(female);
        cBox.add(isSoldier);

        Box topLeft = Box.createVerticalBox();
        topLeft.add(textFieldInputWord);
        topLeft.add(cBox);

        colorList.add("Red");
        colorList.add("green");
        colorList.add("blue");

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        frame.add(top);

        frame.pack();

        frame.setVisible(true);



    }
}
