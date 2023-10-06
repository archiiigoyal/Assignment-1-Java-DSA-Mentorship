package Assignment1DSAMentorship;

import java.util.Scanner;

public class A1_Q4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a range to print all prime numbers in it");
        int lower = s.nextInt();
        int upper = s.nextInt();
        for (int n = lower ; n <= upper  ; n++){
            int count = 0;
            for(int div = 2 ; div*div <= n ; div++){
                if ( n % div == 0){
                    count++ ;
                    break;
                }
            }

            if ( count == 0){
                System.out.println(n);
            }

        }
      
    }
    
}
