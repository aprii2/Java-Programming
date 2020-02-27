package com.pan.ch3.Ex_3_x9;

import java.util.Scanner;

public class Gcd2 {
    //更相减损法
    // 1、先判断两个数是否相等，如果相等，即为最大公约数
    // 2、判断两个数是否是偶数，如果是偶数，将两者进行移位运算
    // 3、用较大的数减较小的数，将差和较小数继续重复运算，直至两数相等

    public static int getGcd2(int n,int m) {
        if (n == m) {
            System.out.println(String.format("GCD(%d,%d)",n,m));
            return n;
        }

        if((n%2 == 0) && (m%2 == 0)){
            System.out.println(String.format("GCD(%d,%d)",n>>1,m>>1));
            return 2 * getGcd2(n>>1,m>>1);
        }else{
            int max = Math.max(n,m);
            int min = Math.min(n,m);
            int difference = max - min;
            System.out.println(String.format("GCD(%d,%d)",max,min));
            System.out.println(String.format("%d - %d = %d",max,min,difference));
            return getGcd2(min,difference);
        }
    }

    public static void main(String[] args) {
        System.out.println("Please input 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = getGcd2(num1,num2);
        System.out.println(String.format("%d 和 %d 的最大公约数是：%d",num1,num2,result));
    }

}
