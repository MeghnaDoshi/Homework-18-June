import java. util.Scanner;

import static java.lang.System.out;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = 0;
        int e, f;
        out.println("Enter a number for armstrong number");
        int i = s.nextInt();
        f = i;
        while (i > 0) ;
        {
            e = i % 10;
            i = i / 10;
            d = d + (e * e * e);
        }
        if (f == d)

            System.out.println("Given number is Armstrong number");

        else

            System.out.println("Given number is not Armstrong number");

    }
}