import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum =0, rev;
        int Temp = a;
     while (a>0) {
         rev = a % 10;
         sum = (sum * 10) + rev;
         a = a / 10;
     }
      if (Temp==sum)
          System.out.println("Number is palindrome number" );
     else
         System.out.println("Number is not palindrome number");

        }






    }

