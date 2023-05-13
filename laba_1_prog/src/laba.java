/** Лабораторная работа 1
 вариант 31715
*/
import java.util.Random;
import static java.lang.Math.*;

public class laba {
    public static void main (String[] args){

        // первый массив
        int [] a = {16, 14, 12, 10, 8, 6};

        Random rand = new Random();

        // второй массив
        double [] x = new double [14];
        for (int i = 0; i < 14; i++){
            x[i] = -12.0 + rand.nextDouble() * (7.0 + 12.0);
        }

        // так как названия массивов повторяются, поменяла второй массив a на aa
        double [][] aa = new double [6][14];

        // переменные A,xx для связи с первыми двумя массивами
        // переменные b,c чтобы попроще задать формулу
        int A;
        double xx, b , c;

        // заполняем третий массив

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 14; j++){
                xx = x[j];
                A = a[i];

                switch (A){

                case 6:
                    aa[i][j] = Math.tan( Math.pow( Math.log( Math.abs( xx ) ) ,3) );
                break;

                case 8:
                case 10:
                case 16:

                    aa[i][j] = Math.atan( Math.pow( Math.exp( -1 * Math.abs(xx) ) ,2) );
                break;

                case 12:
                    case 14:
                    b = Math.exp( xx ) ;
                    c = -1 * b;
                    b = Math.cbrt( c );
                    c = Math.exp( b );
                    b = Math.acos( c );
                    c = Math.exp( b );
                    b = 1 / c ;
                    c = Math.atan( b );
                    aa[i][j] = c;
                    break;
                }

            }
        }

// форматный вывод массива
        for (int i = 0; i < 6; i++){
            for(int j = 0; j < 14; j++){
                System.out.printf("%10.5f" + " ", aa[i][j]);
            }
            System.out.println();
        }


    }
}
