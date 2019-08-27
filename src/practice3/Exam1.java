package practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1
{
    /*
    /create a program which will
    // - take a specific number of student name from the console
    // - for each student, it should ask for 4 subjects name and marks for them all
    // - your code should get the avg marks & total for the each of the students
    // - store all the students name, marks, subjects in individual ArrayList/Hashset
        and print all subjects, students name from that
     */

    public static void main(String[] args) {

        int x = 0;
        int totalNumberOfStudents = x;
        x = 5;
        System.out.println("Total number of students is " + x);

        ArrayList<String>nameOfStudents = new ArrayList<String>();
        nameOfStudents.add("Vaneet");
        nameOfStudents.add("Nitish");
        nameOfStudents.add("Hoque");
        nameOfStudents.add("Safia");
        nameOfStudents.add("Monika");
        System.out.println(nameOfStudents);

        Scanner exam = new Scanner(System.in);

        // name of $ subjects

        /*System.out.println("what is the name of the 1st Subject?");
        String nameOf1stSub = exam.next();

        System.out.println("what is the name of the 2nd Subject?");
        String nameOf2ndSub = exam.next();

        System.out.println("what is the name of the 3rd Subject?");
        String nameOf3rdSub = exam.next();

        System.out.println("what is the name of the 4th Subject?");
        String nameOf4thSub = exam.next();*/

        ArrayList<String>Subject = new ArrayList<String>();
        Subject.add("math");
        Subject.add("physics");
        Subject.add("History");
        Subject.add("Spanish");
        System.out.println(Subject);

        // marks of 4 subjects

        System.out.println("what is the mark of the 1st Subject of Nitish?");
        int markOf1stSub = exam.nextInt();

        System.out.println("what is the mark of the 2nd Subject?");
        int markOf2ndSub = exam.nextInt();

        System.out.println("what is the mark of the 3rd Subject?");
        int markOf3rdSub = exam.nextInt();

        System.out.println("what is the mark of the 4th Subject?");
        int markOf4thSub = exam.nextInt();





    }
}
