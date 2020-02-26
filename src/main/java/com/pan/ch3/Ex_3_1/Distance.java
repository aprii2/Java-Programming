package com.pan.ch3.Ex_3_1;

import javax.swing.*;

public class Distance {
    // 编写一个距离类
    // 其中有一个方法将距离的公里数转换成文字描述。
    // 假设距离为 x 公里
    // 具体分为短距离（0< x <= 500）、中距离（500 < x <= 1000）、
    // 远距离（1000 < x <= 2000）、超远距离（x > 2000）
    public static String distance2word(long dist) {
        String disWord = null;
        if (0 < dist && 500 >= dist) {
            disWord = "短距离";
        }else if (500 < dist && 1000 >= dist) {
            disWord = "中距离";
        }else if (1000 < dist && 2000 >= dist) {
            disWord = "远距离";
        }else if(dist >2000){
            disWord = "超远距离";
        }else disWord = "";
        return disWord;
    }

    public static void main(String[] args) {
        String distanceString = JOptionPane.showInputDialog("请输入距离公里数");
        long distanceValue = Long.parseLong(distanceString);
        JOptionPane.showMessageDialog(null,distance2word(distanceValue),"转换结果",JOptionPane.INFORMATION_MESSAGE);
    }
}
