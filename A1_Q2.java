package Assignment1DSAMentorship;

import java.util.Scanner;
public class A1_Q2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your marks.");
        int marks = s.nextInt();
        if(marks>100 || marks<0){
            System.out.println("Invalid Marks");
        }
        else if(marks>90 && marks<=100){
            System.out.println("Excellent");
        }
        else if(marks>80 && marks<=90){
            System.out.println("Good");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Fair");
        }
        else if(marks>60 && marks<=70){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Below Par");
        }

    }
    
}
