package com.lw.swing.jframe;

import javax.swing.*;

public class CommonJframe extends JFrame {
    public CommonJframe() {
        this.setSize(400, 400);
//        this.setLocation(300, 200);
        this.setLocationRelativeTo(null);

        /**
         * EXIT_ON_CLOSE 窗体关闭时退出程序 :点关闭窗口时退出程序
         * DISPOSE_ON_CLOSE 程序退出时销毁窗口:点击关闭时窗口并不会销毁,而是把下面的程序走完再销毁,窗口只是不显示了而已
         * HIDE_ON_CLOSE 关闭时隐藏窗体:点关闭窗口时 不会销毁 而是直接隐藏
         * DO_NOTHING_ON_CLOSE 就是点击关闭窗口时什么也不干,窗口也不销毁
         */

        JPanel jp = new JPanel();
        JButton jb = new JButton("按钮");
//        JMenuBar jm = new JMenuBar();
        JButton button = new JButton("帮助");
//        jm.add(button);
        jp.add(button);
        jp.add(jb);
//        jp.add(jm);

        this.setContentPane(jp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
