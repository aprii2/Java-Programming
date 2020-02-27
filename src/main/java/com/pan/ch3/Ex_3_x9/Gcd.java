package com.pan.ch3.Ex_3_x9;

import java.util.Scanner;

public class Gcd {
    // 计算输入的两个整数的最大公约数
    // 用变量 m 和 n 存储两个数的值，如果n为0，程序结束，m的值为最大公约数
    // 否则计算m除以n的余数，把n保存到m中，并且把余数保存到n。
    // 重复这个过程，每次都先判定n是否为0。
    // 辗转相除法

    public static int getGcd(int m,int n){
        if(n == 0) {
            System.out.println(String.format("GCD(%d,%d)",m,n));
            return m;
        }
        else {
            int r = m % n;
            int c = m / n;
            System.out.println(String.format("GCD(%d,%d)",m,n));
            System.out.println(String.format("%d / %d = %d …… %d",m,n,c,r));
            m = n;
            n = r;
            return getGcd(m,n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 2 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = getGcd(num1,num2);
        System.out.println(String.format("%d 和 %d的最大公约数为 %d",num1,num2,gcd));

    }

}
