import java.util.Scanner;

public class Primenumbers {
    public static void main(String[] args) {
        boolean prime =true;

        System.out.println("Enter number to check prime or not");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        for (int i=1;i< a; i++);{

            int i= 1;
            if (a%i ==1){
                prime =false;
            }
            if (prime=true) {
                System.out.println("Given Number is prime number ");
            }else{
                 System.out.println("Given number is not prime number");
                }
            }
        }




    }




