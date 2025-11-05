package src.functions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BiFunction;

import src.Matrix;
import src.Matrix_2_2;
import src.OptionsException;

public final class Options{
    /**
     * A private void constructor, to disable the capacity of instanciation
     */
    private Options(){};

    /**
     * This function is used to set the first menu and to take the first choice of the user
     * @return opt : option chosen by user
     * @throws OptionsException : this exception occured when an option enter by user doesn't exist at all
     */
    public static int Main() throws OptionsException{
        int opt = 0;
        System.out.println("\033[2J\033[H");
        System.out.println("Hello and Welcome to \033[32mMatrix Main\033[0m\n");
        System.out.println("0. Exit");
        System.out.println("1. Create and manipulate matrix 2X2");
        System.out.println("2. Create and manipulate any matrix");
        System.out.println("3. About author");
        System.out.println("4. About this program");

        Scanner enter = null;
        try{
            enter = new Scanner(System.in);
            opt = enter.nextInt();
        } catch(InputMismatchException ime){
            throw new OptionsException("Not an option");
        } 
        return opt;
    }

    public static int subMenu1(Matrix_2_2 anyMatrix_2_2) throws OptionsException{
        System.out.println("\033[2J\033[3J\033[H");
        int opt = 0;
        System.out.println("First of all, you have to create the matrix :");
        Matrix_2_2 object = new Matrix_2_2();
        object.scanValues();
        anyMatrix_2_2.copy(object);
        System.out.println("There is your matrix :\033[32m");
        object.printM();
        System.out.println("\033[0m\n\nNow, which operation do you want to do with it : ");
        Scanner enter = null;
        System.out.println("0. Return to main menu");
        System.out.println("1. Add to another matrix");
        System.out.println("2. Multiply with another matrix");
        System.out.println("3. Transposit matrix");
        System.out.println("4. Reverse matrix");
        try{
            enter = new Scanner(System.in);
            opt = enter.nextInt();
        } catch(InputMismatchException ime){
            throw new OptionsException("Not an option");
        }
        return opt;
    }

    public static void addingToMatrix2(Matrix_2_2 object){
        System.out.println("Okay, enter the matrix you want to add to this matrix :");
        object.printM();
        Matrix_2_2 toAdd = new Matrix_2_2();
        Matrix_2_2 result = new Matrix_2_2();
        toAdd.scanValues();
        result = ArithmeticPack.matrixSum(toAdd, object, Matrix_2_2::new);
        System.out.println("The result is :\033[32m");
        result.printM();
        System.out.println("\033[0m");
    }

    public static void multiplyMatrix2(Matrix_2_2 object){
        System.out.println("Okay, enter the matrix you want to multiply with this matrix: ");
        object.printM();
        Matrix_2_2 toMultiply = new Matrix_2_2();
        Matrix_2_2 result = new Matrix_2_2();
        toMultiply.scanValues();
        BiFunction<Integer, Integer, Matrix_2_2> factory = (row, col) -> new Matrix_2_2();
        result = ArithmeticPack.matrixMulti(object, toMultiply, factory);
        System.out.println("The result is : \033[32m");
        result.printM();
        System.out.println("\033[0m");
    }

    public static void transpositMatrix2(Matrix_2_2 object){
        System.out.println("The transposit of your matrix : ");
        object.printM();
        System.out.println("Is the next matrix :");
        Matrix_2_2 result = object.transposit((row, cols)->new Matrix_2_2());
        System.out.println("\033[32m");
        result.printM();
        System.out.println("\033[0m");
    }

    public static void reverseMatrix2(Matrix_2_2 object){
        System.out.println("The reversed matrix of your matrix : ");
        object.printM();
        System.out.println("Is the next matrix :");
        Matrix_2_2 reversed = object.reverseMatrix();
        System.out.println("\033[32m");
        reversed.printM(); 
        System.out.println("\033[0m");
    }
}
