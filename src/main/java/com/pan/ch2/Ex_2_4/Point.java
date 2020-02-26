package com.pan.ch2.Ex_2_4;

// 编写一个二维坐标系中的圆类。
// 该类能够计算圆的周长和面积。
// 同时对于给定的坐标点能判断该点是否在该圆内。
// 使用一个坐标点和半径初始化圆。
// 构造一个测试类用于计算圆的周长和面积等。

public class Point {
    double x,y;

    public Point() {

    }
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public static Point origin = new Point(0,0);

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("( %.1f, %.1f)",this.x,this.y);
    }
}
