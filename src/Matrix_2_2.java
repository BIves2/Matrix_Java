package src;

/**
 * Class Matrix_2_2: Class used to represent a matrix formed by 2 lines and 2 columns
 */
public class Matrix_2_2 extends Matrix{
    /**
     * Variables
     */
    double determinant;

    /**
     * Default constructor
     */
    public Matrix_2_2(){
        super(2, 2);
        determinant = 0;
    }

    /**
     * Parametrical constroctor
     * @param a element at line 1 column 1
     * @param b element at line 1 column 2
     * @param c element at line 2 column 1
     * @param d element at line 2 column 2
     */
    public Matrix_2_2(double a, double b, double c, double d){
        super(2, 2);
        determinant = (a*d)-(b*c);
        double[][] ghostValues = {{a,b}, {c,d}};
        setValues(ghostValues);
    }

    /**
     * Function used to know if the current matrix is identity matrix (IdM)
     * @return state : true if it's identity, false if it's not
     */
    public boolean isIdentity(){
        boolean state = (values[1][1] == 1 && values[1][2] == 0 && values[2][1] == 0 && values[2][2] == 1)?true:false;
        return state;
    }

    /**
     * Function used to know if a matrix is inversible
     * @return state : true if it's inversible, false if it's not
     */
    public boolean isInversible(){
        boolean state = (determinant == 0)? false : true;
        return state;
    }

    /**
     * Function used to reverse a matrix
     * @return reverse : return the reverse of the matrix
     */
    public Matrix_2_2 reverseMatrix(){
        if(!this.isInversible()){
            System.out.println("Math Error : This matrix can't be inversed. Returned :");
            return this;
        }
        Matrix_2_2 reverse = new Matrix_2_2((1/determinant)*values[1][1],(1/determinant)*-values[0][1],(1/determinant)*-values[1][0],(1/determinant)*values[0][0]);
        return reverse;       
    }
}
