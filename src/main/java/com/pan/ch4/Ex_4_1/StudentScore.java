package com.pan.ch4.Ex_4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentScore {
    // 逐个输入并计算10个学生的平均成绩和最好成绩
    // 学生个数定为final int N = 10;
    // 输入成绩：用double[] scores保存
    // 平均成绩用meanScore(double[] scores){}方法
    // 最好成绩用topScore(double[] scores){}方法
    private static final int N = 10;
    private static double[] scores = new double[10];

    public static double meanScore(double[] scores){
        double sum = 0.0;
        for(int index = 0; index < N; index ++){
            sum += scores[index];
        }
        return (sum / N);
    }

    public static double topScore(double[] scores) {
        double topScore = scores[0];
        for(int i = 1;i < N; i++){
            if(topScore < scores[i]){
                topScore = scores[i];
            }
        }
        return topScore;
    }

    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        while (count < N) {
            System.out.print(String.format("请输入第 %d 个学生的成绩：",count+1));
            while (true){
            String str = buf.readLine();
            scores[count] = Double.parseDouble(str);
            if(0 > scores[count]||scores[count] > 100) {
                System.out.println("成绩输入有误，请重新输入！");
            }else {
                count ++;
                break;
            }
            }
        }
        System.out.println(String.format("这 %d 位同学的平均成绩是：%.1f",N,meanScore(scores)));
        System.out.println(String.format("这 %d 位同学的最高成绩是：%.1f",N,topScore(scores)));
    }

}
