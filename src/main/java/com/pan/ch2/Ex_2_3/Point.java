package com.pan.ch2.Ex_2_3;

// 编写一个二维坐标系中的矩形类。
// 该类能够计算矩形的周长，面积和对角线长。
// 同时对于给定的坐标点能够判断该点是否在该矩形内。
// 使用两个坐标点对矩形进行初始化，或者使用两个坐标的点x和y的值对矩形进行初始化。
// 构造一个测试类，用于计算矩形的周长、面积和对角线长等。

public class Point {
    private double x;
    private double y;

    public static Point origin = new Point(0,0);

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

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

        return String.format("( %f , %f )",x,y);
    }
}
