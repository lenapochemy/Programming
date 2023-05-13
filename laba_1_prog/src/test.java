import java.util.Scanner;

public class test {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int i = sc.nextInt();
        /*    int result = switch(i) {
            case 1:
                yield 11;
            case 2:
            case 3:
                yield 13;
            case 5:
                yield 15;
            default:
                yield 0;
        };
    */
        int result;
        switch (i){
            case 1:
                result = 11;
                break;
            case 2:
            case 3:
                result = 13;
                break;
            case 5:
                result = 15;
                break;
            default:
                result = 0;
        };
        System.out.println(result);

    }
}
