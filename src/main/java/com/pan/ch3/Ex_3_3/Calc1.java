package com.pan.ch3.Ex_3_3;

public class Calc1 {
    // 编写程序，计算-1! + 2! - 3! + ... + 20!
    private static final int N = 20;

   public static long calc1(int n) {
       if(n == 1){
           return 1L;
       }else return n * calc1(n-1);
   }

    public static void main(String[] args) {
       long result = 0L;
        for(int index = 1; index <= N;index ++) {
            if(index % 2 !=0) {
                result += calc1(index) * -1;
            }else result += calc1(index);
        }
        System.out.println("最后结果是：" + result);
    }

}
