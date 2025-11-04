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
                        }catch(OptionsException oe){
                            continue;
                        }
                        switch(y1){
                            case 0:
                                dontStopSubM1 = false;
                            break;
                        }
                    }
                break;
                case 2:
                    System.out.println("This part has not been developped yet. Come back later !");
                    dontStopM = false;
                break;
                case 3:
                    System.out.println("This part has not been developped yet. Come back later !");
                    dontStopM = false;
                break;
                case 4:
                    System.out.println("This part has not been developped yet. Come back later !");
                    dontStopM = false;
                break;
            }
        }
        System.out.println("Good bye user. See you later !");
    }
}
