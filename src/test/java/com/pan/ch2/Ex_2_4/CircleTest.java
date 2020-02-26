package com.pan.ch2.Ex_2_4;

import org.testng.annotations.Test;

public class CircleTest {
    @Test
    public void testCircle() {
        // 编写一个二维坐标系中的圆类。
        // 该类能够计算圆的周长和面积。
        // 同时对于给定的坐标点能判断该点是否在该圆内。
        // 使用一个坐标点和半径初始化圆。
        // 构造一个测试类用于计算圆的周长和面积等。

        Point p = new Point(1,1);
        double r = 1.5;
        System.out.println(String.format("圆心的坐标为：%s",p.toString()));
        Circle c = new Circle(p,r);
        System.out.println(String.format("圆的周长为：%f",c.getPerimeter()));
        System.out.println(String.format("圆的面积为：%f",c.getArea()));
        if (c.checkIn(Point.origin)) {
            System.out.println("原点在圆中");
        }else System.out.println("原点不在圆中");
        Point p2 = new Point(-0.5,-0.5);
        if (c.checkIn(p2)) {
            System.out.println(String.format("%s在圆中",p2.toString()));
        }else System.out.println(String.format("%s不在圆中",p2.toString()));
    }
}
