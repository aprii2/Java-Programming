package com.pan.ch2.Ex_2_3拓;


import com.pan.ch2.Ex_2_3.Point;
import org.testng.annotations.Test;

public class Rectangle1Test {
    // 编写一个二维坐标系中的矩形类。
    // 该类能够计算矩形的周长，面积和对角线长。
    // 同时对于给定的坐标点能够判断该点是否在该矩形内。
    // 使用两个坐标点对矩形进行初始化，或者使用两个坐标的点x和y的值对矩形进行初始化。
    // 构造一个测试类，用于计算矩形的周长、面积和对角线长等。
    // 在Ex_2_3的基础上对矩形类增加一个构造函数，
    // 能够用一个坐标点、矩形长度、矩形宽度以及方向（包括x方向和y方向，其值为1或-1）构造一个实例。
    @Test
    public void testRectangle1() {

        Point p1 = new Point(-1,-1);
//        Point p2 = new Point(2,3);
//        Rectangle1 r = new Rectangle1(p1,p2);
        Rectangle1 r = new Rectangle1(p1,3,5,1,-1);
//        Rectangle r = new Rectangle(-1,-1,2,3);
        System.out.println(String.format("p1的坐标是：%s",p1.toString()));
//        System.out.println(String.format("p2的坐标是：%s",p2.toString()));

        System.out.println(String.format("矩形的周长是：%.1f",r.getPerimeter()));
        System.out.println(String.format("矩形的面积是：%.1f",r.getArea()));
        System.out.println(String.format("矩形的对角线长是：%.1f",r.getDiagonal()));
        if (r.checkIn(Point.origin)) {
            System.out.println(String.format("原点在矩形内"));
        }else System.out.println(String.format("原点不在矩形中"));
        Point p3 = new Point(-1.5,-1.5);
        if (r.checkIn(p3)) {
            System.out.println(String.format("该点在矩形内"));
        } else System.out.println(String.format("该点%s不在矩形内", p3.toString()));


    }
}
