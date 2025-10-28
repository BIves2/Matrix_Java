package src.functions;

import src.Matrix;

/**
 * Class ArithmeticPack : This class contains functions related to arithmetics of matrix
 */
public final class ArithmeticPack {
    /**
     * A void private constructor to disable possibility of instanciation 
     */
    private ArithmeticPack(){}

    /**
     * Function used to sum 2 Matrix
     * @param a the first Matrix of the two to sum
     * @param b the second Matrix of the two to sum
     * @return the result of addition or the first Matrix passed to function if they can't be added
     */
    public static Matrix matrixSum(Matrix a, Matrix b){
        if(a.getLines() == b.getLines() && a.getColumns() == b.getColumns()){
            Matrix c = new Matrix(a.getLines(), a.getColumns());
            double[][] aValues = a.getValues();
            double[][] bValues = b.getValues();
            double[][] cValues = c.getValues();
            for(int i = 0; i < a.getLines(); i++){
                for(int j = 0; j < a.getColumns(); j++){
                    cValues[i][j] = aValues[i][j] + bValues[i][j];
                }
            }
            return c;
        } else {
            System.out.println("Math Error : The two matrix aren't of same nature, so we can't sum it !");
            return a;
        }
    }

    /**
     * This function is used to multiply two matrix.
     * @param a the first matrix
     * @param b the sewcond matrix
     * @return c the matrix issued of the multiplication of the two matrix
     */
    public static Matrix matrixMulti(Matrix a, Matrix b){
        Matrix c = new Matrix(a.getLines(), b.getColumns());
        double[][] aValues = a.getValues();
        double[][] bValues = b.getValues(); 
        double[][] cValues = new double[a.getLines()][b.getColumns()];
        if(a.getLines() == b.getColumns()){
            for(int i = 0; i < a.getLines(); i++){
                for(int j = 0; j < b.getColumns(); j++){
                    for(int  k = 0; k < a.getColumns(); k++){
                        cValues[i][j] += aValues[i][k]*bValues[k][j];
                    }
                }
            }
            c.setValues(cValues);
        } else {
            System.out.println("Math Error: You can't multiply this two matrix. Returned :");
            return a;
        }
        c.setValues(cValues);
        return c;
    }
}
