package com.pan.ch3.Ex_3_x10;

import java.util.Scanner;

public class Contract {
    // 约分最简因式
    public static int getContract (int a, int b) {

        if(b == 0){
            return a;
        }else{
            int r = a % b;
            a = b;
            b = r;
            return getContract(a,b);
        }
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("请输入分子与分母：");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(num2 == 0){
                System.out.println("分母不能为0，请重新输入");
                continue;
            }else if(num1 == 0) {
                System.out.println(String.format("约分结果为：0"));
                break;
            }else{
                int result = getContract(num1,num2);
                StringBuilder sb = new StringBuilder();
                sb.append(num1/result);
                sb.append("/");
                sb.append(num2/result);
                System.out.println(String.format("约分结果为：%s",sb.toString()));
                break;
            }
        }
    }
}
