package com.pan.ch3.Ex_3_6;

public class SumPower {
    // 编写程序，计算1^1 + 2^2 + 3^3 + …… + 10^10
    public static final int N = 10;

    public static void main(String[] args) {
        double sum = 0.0;
        for(int i = 1; i < N; i++) {
            sum += Math.pow(i,i);
        }
        System.out.println(String.format("结果是 %.0f",sum));
    }
}
