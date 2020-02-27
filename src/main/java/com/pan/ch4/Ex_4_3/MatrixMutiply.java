package com.pan.ch4.Ex_4_3;

public class MatrixMutiply {
    // 编写程序实现两个二维矩阵的乘法
    private static int[][] a = new int[4][2];   //四行两列
    private static int[][] b = new int[2][3];   //两行三列

    public static void setParams(int[][] matrix){
        int row = matrix.length;        //获取行数
        int col = matrix[0].length;     //获取列数
        for(int i = 0;i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
//                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void print(int[][] matrix){
        int row = matrix.length;        //获取行数
        int col = matrix[0].length;     //获取列数
        for(int i = 0;i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] calcMatrix(int[][] matrix1,int[][] matrix2) {
        int row1 = matrix1.length;
        int col2 = matrix2[0].length;
        int sameNum = matrix1[0].length;

        int[][] matrix3 = new int[row1][col2];
        for(int i = 0; i < row1; i ++){
            for(int j = 0;j < col2; j++){
                for(int k = 0; k < sameNum; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }


    public static void main(String[] args) {
        MatrixMutiply.setParams(MatrixMutiply.a);
        MatrixMutiply.setParams(MatrixMutiply.b);
        int[][] c = calcMatrix(a,b);
        System.out.println("a矩阵元素如下：");
        print(a);
        System.out.println("b矩阵元素如下：");
        print(b);
        System.out.println("c矩阵元素如下：");
        print(c);
    }
}
