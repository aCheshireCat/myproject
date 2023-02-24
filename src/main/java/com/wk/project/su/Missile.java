package com.wk.project.su;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

/**
 * @Auther weikai2
 * @Date 2023/2/2
 * @Description
 **/

@SuppressWarnings("serial")
public class Missile extends Applet implements Runnable {
    public int speed, variability, Max_Number, Max_Energy, Max_Patch,
            Max_Length, G;
    public String sound;
    private int width, height;
    private Thread thread = null;
    private BeanClassDemo bcd[];


    public static void main(String args[]) {
        Missile applet = new Missile();
        JFrame frame= new JFrame("TextAreaNew");
        frame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e)

            {
                System.exit(0);
            }
        });
        frame.getContentPane().add(
                applet, BorderLayout.CENTER);
        frame.setSize(800,400);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }


    public void init() {
        int i;
        this.setSize(400, 400);
        width = getSize().width - 1;
        height = getSize().height - 1;
        speed = 60;                        // 烟花绽放的速度
        variability = 10;
        Max_Number = 180;                    // 可发出烟花的最大数目
        Max_Energy = width + 50;
        Max_Patch = 60;                    // 最大的斑点数
        Max_Length = 180;                    // 斑点的最大距离
        G = 50;                            // 向地面弯曲的力度
        bcd = new BeanClassDemo[Max_Number];
        for (i = 0; i < Max_Number; i++)
            bcd[i] = new BeanClassDemo(width, height, G);
    }
    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
    @SuppressWarnings("deprecation")
    public void stop() {
        if (thread != null) {
            thread.stop();
            thread = null;
        }
    }
    @SuppressWarnings({ "unused", "static-access" })
    public void run() {
        int i;
        int E = (int) (Math.random() * Max_Energy * 3 / 4) + Max_Energy / 4 + 1;
        int P = (int) (Math.random() * Max_Patch * 3 / 4)    // 烟花的斑点数
                + Max_Patch / 4 + 1;
        int L = (int) (Math.random() * Max_Length * 3 / 4)    // 烟花可发射出的距离
                + Max_Length / 4 + 1;
        long S = (long) (Math.random() * 10000);
        boolean sleep;
        Graphics g = getGraphics();
        URL u = null;
        while (true) {
            try {
                thread.sleep(1000 / speed);
            } catch (InterruptedException x) {
            }
            sleep = true;
            for (i = 0; i < Max_Number; i++)
                sleep = sleep && bcd[i].sleep;
            if (sleep && Math.random() * 100 < variability) {
                E = (int) (Math.random() * Max_Energy * 3 / 4) + Max_Energy / 4
                        + 1;
                P = (int) (Math.random() * Max_Patch * 3 / 4) + Max_Patch / 4
                        + 1;
                L = (int) (Math.random() * Max_Length * 3 / 4) + Max_Length / 4
                        + 1;
                S = (long) (Math.random() * 10000);
            }
            for (i = 0; i < Max_Number; i++) {
                if (bcd[i].sleep && Math.random() * Max_Number * L < 1) {
                    bcd[i].init(E, P, L, S);
                    bcd[i].start();
                }
                bcd[i].show(g);
            }
        }
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, width + 1, height + 1);
    }
}
