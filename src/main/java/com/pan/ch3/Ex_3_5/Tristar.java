package com.pan.ch3.Ex_3_5;

public class Tristar {
    // 编写程序，输出n行以下的图形，第i行有i个星号(*)
    public static final int N = 10;

    public static void main(String[] args) {
        int i = 1;
        while (i < Tristar.N){
            int j = 1;
            while (j <= i ) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
