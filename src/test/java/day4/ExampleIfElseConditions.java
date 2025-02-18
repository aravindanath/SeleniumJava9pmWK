package day4;

import java.util.Scanner;

public class ExampleIfElseConditions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the your marks: ");
        int marks = scanner.nextInt();

        if (marks < 35) {
            System.out.println(name+" have failed");
        } else if (marks >= 35 && marks < 50) {
            System.out.println(name+" have passed");
        } else if (marks >= 50 && marks < 60) {
            System.out.println(name+"  have got second class");
        } else if (marks >= 60 && marks < 85) {
            System.out.println(name+"  have got first class");
        } else if (marks >= 85 && marks <= 100) {
            System.out.println(name+"  have got distinction");
        }  else{
                System.out.println("Invalid marks");
            }
        }

    }
