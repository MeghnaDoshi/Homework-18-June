import java.util.Scanner;

public class AscendingOrder {

    private static int i;

    public static void main(String[] args) {

        int a, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of digits in array");
        a = s.nextInt();
        int b[] = new int[a];
        System.out.println("Enter all the digits");
        for (int i = 0; i < a; i++) ;
        {
            b[i]=s.nextInt();

            for (int k = i + 1; k < a; k++) ;
            {

                int k=0;

                if (b[i] > b[k]) ;
                {
                    temp = b[i];
                    b[i] = b[k];
                    b[k] = temp;
                }
            }
                }
                System.out.println("digits in ascending order");
                for (int i=0; i<a; i++);
                {
                    System.out.println(b[i] + ",");
                }
                System.out.println(b[a-1]);

                }



            }




