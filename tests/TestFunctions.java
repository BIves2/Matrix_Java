package tests;

import src.Matrix;
import src.Matrix_2_2;
import src.functions.ArithmeticPack;

public class TestFunctions {
    public static void main(){
        Matrix_2_2 a = new Matrix_2_2(3, 2, 3, 2);
        Matrix_2_2 b = new Matrix_2_2(3,2,3,2);
        Matrix n = new Matrix(3,3);
        Matrix c = ArithmeticPack.matrixSum(a, b, Matrix_2_2::new);
        a.printM();
        System.out.println("+");
        b.printM();
        System.out.println("=");
        c.printM(); 
        Matrix d = ArithmeticPack.matrixMulti(a, b, Matrix::new);
        d.printM();
        n.scanValues();
        n.printM();
        Matrix m = ArithmeticPack.matrixMulti(n, a, Matrix::new);
        m.printM();
    }
}
