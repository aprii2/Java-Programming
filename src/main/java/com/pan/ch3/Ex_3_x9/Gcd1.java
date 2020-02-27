package com.pan.ch3.Ex_3_x9;

import java.util.Scanner;

public class Gcd1 {
    // 计算输入的两个整数的最大公约数
    // Stein算法

    public static int getGcd1(int m,int n){
        int difference;

        // 判断两个数是否相等，如果相等，则返回最终结果。
        if(m == n ){
            System.out.println(String.format("GCD(%d,%d)",m,m));
            return m;
        }
        // 判断两个数是否为0
        if(m == 0){
            System.out.println(String.format("GCD(%d,0)",n,0));
            return n;
        }
        else if (n == 0) {
            System.out.println(String.format("GCD(%d,0)",m,0));
            return m;
        }

        if((m % 2 == 0) && (n % 2 == 0)) {
            System.out.println(String.format("2*GCD(%d,%d)",m>>1,n>>1));
            return 2 * getGcd1(m >> 1,n >> 1);
        }else if((m % 2 == 0) && (n % 2 !=0)) {
            System.out.println(String.format("GCD(%d,%d)",m>>1,n));
            return getGcd1(m >> 1,n);
        }else if((n % 2 == 0) && (m % 2 != 0)) {
            System.out.println(String.format("GCD(%d,%d)",m,n>>1));
            return getGcd1(m,n>>1);
        }else{
            int max = Math.max(m,n);
            int min = Math.min(m,n);
            difference = max - min;
            System.out.println(String.format("GCD(%d,%d)",max,min));
            System.out.println(String.format("%d - %d = %d",max,min,difference));
            return getGcd1(min,difference);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 2 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = getGcd1(num1,num2);
        System.out.println(String.format("%d 和 %d 的最大公约数是：%d",num1,num2,result));

    }

}
