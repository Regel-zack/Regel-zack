package LoginWindom;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class MyAwtLearn02 {
    /**
     * 账号登陆框
     * 最长有12列长
     */
    TextField account = new TextField("please input your account",12);

    /**
     * 密码登陆框
     * 最长有15列长
     */
    TextField password = new TextField(15);

    /**
     * 登录按钮
     */
    Button loginButton = new Button("Login");

    /**
     * 带有安全提示的文本
     */
    Label tips = new Label("Please note that we will not ask for an account password for any reason!");

    /**
     * 注册按钮
     */
    Button registeredButton = new Button("Registered");

    /**
     * 其他登陆方式按钮
     */
    Button otherAccountLogin = new Button("Other Account Login");

    public void ActionAssembled(){
        password.addActionListener(new MyActionLister());
        password.setEchoChar('*');
    }


    public Box TextAssembled(){
        // 组装账号与密码输入框
        Box accountPasswordBox = Box.createVerticalBox();
        accountPasswordBox.add(account);
        accountPasswordBox.add(Box.createVerticalStrut(10));
        accountPasswordBox.add(password);
        return accountPasswordBox;
    }

    public Box ButtonAssembled(){
        // 组装其他账号与注册按钮
        Box otherAccountBox = Box.createHorizontalBox();
        otherAccountBox.add(otherAccountLogin);
        otherAccountBox.add(registeredButton);
        return otherAccountBox;
    }
    public void init(){
        Frame frame = new Frame("Login");

        // 组装提示文本框
        frame.add(tips,BorderLayout.NORTH);

        // 组装账号与密码输入框
        frame.add(TextAssembled(),BorderLayout.CENTER);

        // 组装其他账号登陆与注册
        frame.add(ButtonAssembled(),BorderLayout.SOUTH);

        // 注册监听器
        ActionAssembled();

        frame.pack();
        frame.setVisible(true);
    }
}
