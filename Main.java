import java.util.InputMismatchException;
import java.util.Scanner;

import src.Matrix_2_2;
import src.OptionsException;
import src.functions.Options;

public class Main {
    /**
     * Matrix Main : The place where we can manipulate our matrix !
     * Thank you for testing, updating or supporting my work 🙂
     */

    public static void main(String[] args){    
        boolean dontStopM = true;
        int x = 0;
        while (dontStopM){
            try{
                x = Options.Main();
                System.out.println("\n");
            }catch(OptionsException moe){
                continue;
            }
            switch (x) {
                case 0:
                    dontStopM = false;
                break;
                case 1:
                    boolean dontStopSubM1 = true;
                    Matrix_2_2 matrixObject = new Matrix_2_2();
                    while(dontStopSubM1){
                        int y1 = 0;
                        try{
                            y1 = Options.subMenu1(matrixObject);
                            System.out.println("\n");

                        }catch(OptionsException oe){
                            continue;
                        }
                        switch(y1){
                            case 0:
                                dontStopSubM1 = false;
                            break;
                            case 1:
                                Options.addingToMatrix2(matrixObject);
                                System.out.println("\n\033[33m>>> End Of Program <<<\033[0m");
                                dontStopM = false;
                                dontStopSubM1 = false;
                            break;
                        }
                    }
                break;
                case 2:
                    System.out.println("\n");
                    System.out.println("This part has not been developped yet. Come back later !");
                    dontStopM = false;
                break;
                case 3:
                    System.out.println("\n");
                    System.out.println("This part has not been developped yet. Come back later !");
                    dontStopM = false;
                break;
                case 4:
                    System.out.println("\n");
                    System.out.println("This part has not been developped yet. Come back later !");
                    dontStopM = false;
                break;
            }
        }
        System.out.println("\nGood bye user. See you later !");
    }
}
