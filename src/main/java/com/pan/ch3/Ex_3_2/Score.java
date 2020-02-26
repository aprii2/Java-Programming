package com.pan.ch3.Ex_3_2;

import java.util.Scanner;

public class Score {
    // 编写程序，将百分制的分数转换成优、良、中、及格和不及格
    // 程序使用标准输入输出读写数据
    public static String score2word(int grad) {
        String result = null;
        switch (grad){
            case 10:
            case 9:
                result = "优";
                break;
            case 8:
                result = "良";
                break;
            case 7:
                result = "中";
                break;
            case 6:
                result = "及格";
                break;
            default:
                result = "不及格";
        }
        return result;
    }

    public static void main(String[] args) {
        float point = 0;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入分数（0~100）：");
            point = sc.nextFloat();
        } catch (Exception e){
            System.out.println("输入数据有误！！");
            System.out.println("错误信息：" + e.getMessage());
        }
        if (point >= 0 && point <= 100) {
            System.out.println("成绩是" + score2word((int) point / 10));
        }else System.out.println("输入的成绩不正确：" + point);
    }
}
