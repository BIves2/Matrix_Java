package tests;

/**
 * File for test Matrix
 */
import src.Matrix;

public class TestMatrix {
    public static void main(String[] args){
        Matrix a = new Matrix();
        a.printM();
        a.scanValues();
        a.printM();
        Matrix b = new Matrix(3,2);
        b.scanValues();
        b.printM();
        Matrix c = b.transposit();
        c.printM();
    }
}
