package Assignment1DSAMentorship;

import java.util.Scanner;
public class A1_Q3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
            System.out.println("Enter a number.");
            int n = s.nextInt();
            int count = 0;
            for (int div = 1; div <= n; div++){
                if (n % div == 0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(n + "  is prime.");
            }
            else{
                System.out.println(n + "  is not prime.");
            }

        }


    }
  
