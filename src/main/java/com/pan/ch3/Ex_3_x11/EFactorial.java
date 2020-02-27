package com.pan.ch3.Ex_3_x11;

import java.util.Scanner;

public class EFactorial {

    public static long factorial(int n){
        if(n == 1){
            return 1L;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的个数:");
        int n = sc.nextInt();
        double e = 1.0;
        for (int i = 1; i <= n; i ++) {
            e += (double) i/factorial(i);
        }
        System.out.println(String.format("e的值为：%.5f",e));
    }
}
