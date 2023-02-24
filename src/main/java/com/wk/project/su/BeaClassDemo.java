package com.wk.project.su;

import java.awt.*;
import java.util.Random;

/**
 * @Auther weikai2
 * @Date 2023/2/10
 * @Description
 **/
public class BeaClassDemo {


    public boolean sleep = true;
    private int energy, patch, length, width, height, G, Xx, Xy, Ex[], Ey[], x,
            y, Red, Blue, Green, t;
    private Random random;
    public BeaClassDemo(int a, int b, int g) {
        width = a;
        height = b;
        G = g;
    }
    public void init(int e, int p, int l, long seed) {
        int i;

        energy = e;
        patch = p;
        length = l;
        // 创建一个带种子的随机数生成器
        random = new Random(seed);
        Ex = new int[patch];
        Ey = new int[patch];
        Red = (int) (random.nextDouble() * 128) + 128;
        Blue = (int) (random.nextDouble() * 128) + 128;
        Green = (int) (random.nextDouble() * 128) + 128;
        Xx = (int) (Math.random() * width / 2) + width / 4;
        Xy = (int) (Math.random() * height / 2) + height / 4;
        for (i = 0; i < patch; i++) {
            Ex[i] = (int) (Math.random() * energy) - energy / 2;
            Ey[i] = (int) (Math.random() * energy * 7 / 8) - energy / 8;
        }
    }
    public void start() {
        t = 0;
        sleep = false;
    }
    public void show(Graphics g) {
        if (!sleep)
            if (t < length) {
                int i, c;
                double s;
                Color color;
                c = (int) (random.nextDouble() * 64) - 32 + Red;
                if (c >= 0 && c < 256)
                    Red = c;
                c = (int) (random.nextDouble() * 64) - 32 + Blue;
                if (c >= 0 && c < 256)
                    Blue = c;
                c = (int) (random.nextDouble() * 64) - 32 + Green;
                if (c >= 0 && c < 256)
                    Green = c;
                color = new Color(Red, Blue, Green);
                for (i = 0; i < patch; i++) {
                    s = (double) t / 100;
                    x = (int) (Ex[i] * s);
                    y = (int) (Ey[i] * s - G * s * s);
                    g.setColor(color);
                    g.drawLine(Xx + x, Xy - y, Xx + x, Xy - y);
                    if (t >= length / 2) {
                        int j;
                        for (j = 0; j < 2; j++) {
                            s = (double) ((t - length / 2) * 2 + j) / 100;
                            x = (int) (Ex[i] * s);
                            y = (int) (Ey[i] * s - G * s * s);
                            g.setColor(Color.black);
                            g.drawLine(Xx + x, Xy - y, Xx + x, Xy - y);
                        }
                    }
                }
                t++;
            } else {
                sleep = true;
            }
    }
}
