package tests;

import src.Matrix_2_2;
/**
 *  File for test Matrix_2_2
 */
public class TestMatrix_2_2 {
    public static void main(String[] args){
        Matrix_2_2 a = new Matrix_2_2(1, 1, 1, 1);
        a.printM();
        Matrix_2_2 b = a.reverseMatrix();
        b.printM();
    }
}
