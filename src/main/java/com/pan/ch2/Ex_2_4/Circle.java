package com.pan.ch2.Ex_2_4;

// 编写一个二维坐标系中的圆类。
// 该类能够计算圆的周长和面积。
// 同时对于给定的坐标点能判断该点是否在该圆内。
// 使用一个坐标点和半径初始化圆。
// 构造一个测试类用于计算圆的周长和面积等。

public class Circle {
    private Point center;
    private double radius;

    public Circle() {

    }
    public Circle(Point p,double r) {
        this.center = p;
        this.radius = r;
    }

    public Circle(double x,double y,double r) {
        this.center = new Point(x,y);
        this.radius = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public boolean checkIn(Point p) {
        double disX = Math.pow(this.center.getX() - p.getX(),2);
        double disY = Math.pow(this.center.getY() - p.getY(),2);
        if (Math.sqrt(disX + disY) < this.radius) {
            return true;
        }else return false;
    }
}
