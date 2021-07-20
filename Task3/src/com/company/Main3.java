package com.company;

public class Main3 {
    public static void main(String[] args) {
        // двумерный массив матрица
        char [][] m = new char[4][5];
        char [][] m2 ={{1,2},
                       {3,4},
                       {5,6},
                       {7,8}
        };
        System.out.println((int) m2[1][0]);//1 номер строки, номер столбца инт в начале -явное преобразование
        for (int i = 0; i< m2.length; i++){
            for (int j = 0; j < m2[i].length;j++){
                System.out.print((int) m2[i][j]);
            }
            System.out.println();
        }
    }

}
