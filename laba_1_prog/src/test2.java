import java.util.Scanner;

public class test2 {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int i = sc.nextInt();

        int result = switch(i) {
            case 1 -> 11;
            case 2,3 -> 13;
            case 5 -> 15;
            default -> 0;
        };

        System.out.println(result);

    }
}
