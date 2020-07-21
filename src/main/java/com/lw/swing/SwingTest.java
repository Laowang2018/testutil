package com.lw.swing;

import com.lw.swing.jframe.CommonJframe;

import javax.swing.*;

public class SwingTest {


    public static void main (String[] args) throws Exception{


        JFrame jf = new CommonJframe();



        for(int i=0; i<10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }



    }
}
