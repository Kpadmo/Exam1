package practice;

import java.util.Scanner;

public class myCode6Scanner
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in); // create a scanner object

        System.out.println("what`s your first name?");
        String name = scan.next();


        System.out.println("what`s your age?");
        int age = scan.nextInt();

        System.out.println("which city do you live in?");
        String city = scan.next();

        System.out.println("Thank you" + " " + name);
        System.out.println("Have a nice evening");

    }
}
