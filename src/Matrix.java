package src;

import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * Class Matrix : used to represent a matrix of reel numbers
 */
public class Matrix {
    /**
     * Variables
     */
    int lines;
    int columns;
    double[][] values;
    Scanner scan = null;

    /**
     * Default constructor
     */
    public Matrix(){
        lines = 2;
        columns = 1;
        values = new double[2][1];
    }

    /**
     * Parametrical constructor
     */
    public Matrix(int nLines, int nColumns){
        lines = nLines;
        columns = nColumns;
        values = new double[lines][columns];
    }

    /**
     * Function used to set all the values contained on the matrix
     */
    public void scanValues(){
        scan = new Scanner(System.in);
        System.out.println("Enter the values of your matrix line per line :");
        for(int i = 0 ; i < lines ; i++){
            System.out.println("Line "+(i+1)+ " : ");
            for(int j = 0 ; j < columns ; j++){
                System.out.print("Column "+(j+1)+" : ");
                values[i][j] = scan.nextDouble();
            }
        }
    }

    /**
     * Function used to print the values contained on the matrix
     */
    public void printM(){
        for(int i = 0 ; i < lines ; i++){
            System.out.print("| ");
            for(int j = 0 ; j < columns ; j++){
                System.out.print(values[i][j]+" ");
            }
            System.out.print("|\n");
        }
    }

    /**
     * Function used to find the transposite of a matrix
     */
    public <M extends Matrix> M transposit(BiFunction<Integer, Integer, M> factory){
        M transposedMatrix = factory.apply(columns, lines);
        double transposeValues[][] = new double[columns][lines];
        for(int i = 0; i < columns; i++){
            for(int j = 0; j < lines; j++){
                transposeValues[i][j] = values[j][i];
            }
        }
        transposedMatrix.setValues(transposeValues);
        return transposedMatrix;
    }

    /**
     * Function used to set the values of a matrix based on an existant 2D table of values
     */
    public void setValues(double[][] newValues){
        values = newValues;
    }

    /**
     * Function used to get all the values on a matrix
     * @return values;
     */
    public double[][] getValues(){
        return values;
    }

    /**
     * Function used to get number of lines of the matrix
     * @return lines;
     */
    public int getLines(){
        return lines;
    }

    /**
     * Function used to get the number of columns of the matrix
     * @return columns;
     */
    public int getColumns(){
        return columns;
    }

    /**
     * Function used to copy the values of another matrix
     * @param another
     */
    public void copy(Matrix another){
        this.lines = another.lines;
        this.columns = another.columns;
        this.values = another.values;
    }

    /**
     * Function used to close resources used by matrix
     */
    public void close(){
        scan.close();
    }
}
