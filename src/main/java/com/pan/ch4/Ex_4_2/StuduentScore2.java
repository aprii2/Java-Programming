package com.pan.ch4.Ex_4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StuduentScore2 {
    // 逐个输入10个学生的成绩，并将其从大到小输出
    // 10个学生保存到常量final int N = 10；
    // 输入：保存到double[] scores中
    // 从大到小用冒泡排序double[] sort(double[] nums){}方法

    private static final int N = 10;
    private static double[] scores = new double[N];

    public static double[] sort(double[] nums){
        for(int k = 1; k < N; k ++) {
            for(int index = 0;index < N -k; index++){
                if(nums[index] < nums[index + 1]){
                    double tmp = nums[index];
                    nums[index] = nums[index + 1];
                    nums[index + 1] = tmp;
                }
            }
            System.out.print(String.format("第 %d 步排序结果是：",k));

            for(int i = 0; i < N; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        return nums;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (count < N){
            while (true){
                System.out.println(String.format("请输入第%d个学生的成绩",count+1));
                String str = buf.readLine();
                scores[count] = Double.parseDouble(str);
                if(scores[count] < 0 || scores[count] >100) {
                    System.out.println("请重新输入！");
                }else{
                    count ++;
                    break;
                }
            }
        }
        double[] scoresNew = sort(scores);
        System.out.print(String.format("这 %d位同学的成绩排序为：",N));
        for(int i = 0; i < N; i++){
            System.out.print(scoresNew[i] + "  ");
        }
    }
}
