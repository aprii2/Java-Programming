package com.pan.ch3.Ex_3_4;

public class times9x9 {
    // 编写程序，打印九九乘法表
    private static final int N = 9;
    private static String[] digitWords = { "十","一","二","三","四","五","六","七","八","九"};

    // 输入数字，将数字转换成中文字
    public static String digit2words(int num) {

        int n = num / 10;
        int m = num % 10;
        // 确定是否为二位数
        if(num == 10 ){
            StringBuilder sb = new StringBuilder();
            sb.append(digitWords[n]);
            sb.append(digitWords[m]);
            return sb.toString();
        }else if(n > 0){
            StringBuilder sb = new StringBuilder();
            sb.append(digitWords[n]);
            sb.append(digitWords[0]);
            sb.append(digitWords[m]);
            return sb.toString();
        }else return digitWords[m];
    }

    public static void main(String[] args) {
        for (int i = 1; i <= N; i ++) {
            for (int j = i;j <= N; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(digit2words(i));
                sb.append(digit2words(j));
                sb.append(( i * j >= 10 ? "" : "得"));
                sb.append(digit2words(i*j));
                System.out.print(sb.toString());
                System.out.print(( i * j > 10 ? "   ":"     "));
            }
            System.out.println();
        }
    }
}
