package ooplab3;
//0-46 = f
//50-59 = D
//60-69 = C
//70-79 = B
//80-100 = A


import java.util.Scanner;

public class CalGrade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter your score : ");
        int Score = scan.nextInt();
        if(Score <= 49)
            System.out.print(" You grade is F : ");
        else if(Score <= 59)
            System.out.print(" You grade is D : ");
        else if(Score <= 69)
            System.out.print(" You grade is C : ");
        else if(Score <= 79)
            System.out.print(" You grade is B : ");
        else
            System.out.print(" You grade is A : ");


    }//main




}//class
