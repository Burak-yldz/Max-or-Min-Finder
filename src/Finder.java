import java.util.Scanner;

public class Finder {
    public static void main(String[] args) {


        int number , min = 1, max = 1;
        int value;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your total number amounts (n) : ");
        int n = input.nextInt();

        for(int i=1 ; i<=n ; i++ ) {
            System.out.print(i + "-Please enter a number :  ");
            number = input.nextInt();

            if (i == 1 ) {
                max = number;
                min = number;
            }
            if (number > max ){
                max = number ;
            }
            if (number < min ){
                min = number ;
            }
        }
        System.out.println("Big number is :" + max );
        System.out.println("Small number is :" + min);
    }
}
