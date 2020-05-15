package Chapter_6_Interfaces_Lambda_Expressions_and_Inner_Classes.Interfaces_and_Callbacks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();

//              构建了一个定时器通知listener时interval毫秒已经过去了。
        var timer = new Timer(1000, listener);
//              启动计时器。一旦启动，计时器就会调用actionPerformed其侦听器。
        timer.start();

//              显示一个带有消息提示和确定按钮的对话框。对话框位于parent组件上方。如果parent为null，则对话框在屏幕上居中。
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is "
                + Instant.ofEpochMilli(event.getWhen()));
//              获取默认工具包。工具箱包含有关GUI环境的信息。
//              发出哔声。
        Toolkit.getDefaultToolkit().beep();
    }
}
//           void stop()
//
//停止计时器。一旦停止，计时器将不再调用actionPerformed其侦听器。