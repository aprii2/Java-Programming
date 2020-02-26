package com.pan.ch2.Ex_2_3拓;

// 编写一个二维坐标系中的矩形类。
// 该类能够计算矩形的周长，面积和对角线长。
// 同时对于给定的坐标点能够判断该点是否在该矩形内。
// 使用两个坐标点对矩形进行初始化，或者使用两个坐标的点x和y的值对矩形进行初始化。
// 构造一个测试类，用于计算矩形的周长、面积和对角线长等。

import com.pan.ch2.Ex_2_3.Point;

public class Rectangle1 {
    private Point p1,p2;
    private double len;
    private double wid;
    private double p2X;
    private double p2Y;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Rectangle1(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.len = Math.abs(p1.getX() - p2.getX());
        this.wid = Math.abs(p1.getY() - p2.getY());
    }

    public Rectangle1(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
        this.len = Math.abs(x1 - x2);
        this.wid = Math.abs(y1 - y2);
    }

    public Rectangle1(Point p, double len, double wid, int direX, int direY) {
        this.p1 = p;
        this.wid = wid;
        this.len = len;
        if(direX == 1){
            this.p2X = p.getX() + len;
        }else if(direX == -1) {
            this.p2X = p.getX() - len;
        }
        if(direY == 1){
            this.p2Y = p.getY() + wid;
        }else if (direY == -1) {
            this.p2Y = p.getY() - wid;
        }
        this.p2 = new Point(p2X,p2Y);
    }

    public double getPerimeter() {
        return 2 * (this.len + this.wid);
    }

    public  double getArea() {
        return this.len * this.wid;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.len,2) + Math.pow(this.wid,2));
    }

    public boolean checkIn(Point p3) {
        double maxX = Math.max(this.p1.getX(),this.p2.getX());
        double minX = Math.min(this.p1.getX(),this.p2.getX());
        double maxY = Math.max(this.p1.getY(),this.p2.getY());
        double minY = Math.min(this.p1.getY(),this.p2.getY());
        boolean checkX = (p3.getX() <= maxX ) && (p3.getX() >= minX);
        boolean checkY = (p3.getY() <= maxY ) && (p3.getY() >= minY);

        if (checkX && checkY){
            return true;
        }else return false;
    }

}
