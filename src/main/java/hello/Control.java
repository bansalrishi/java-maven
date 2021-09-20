package hello;

import java.util.Scanner;

public class Control {
    public static void main(String[] args){
        System.out.println("Choose a number between 1 and 20");
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        if (userNum <= 10){
            System.out.println("NUmber is less than or equal to 10");
        }
        else{
            System.out.println("Number is greater than 10");
        }
    }
}
