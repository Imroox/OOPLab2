package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("How many?");
        int num1=Integer.parseInt(reader.nextLine());
        for (int i=0; i<num1; i++){
            printText();

        }

    }
    public static void sumOfThreeNumbers(){
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int read1=Integer.parseInt(reader.nextLine());
        System.out.print("Enter second number: ");
        int read2=Integer.parseInt(reader.nextLine());
        System.out.print("Enter third number: ");
        int read3=Integer.parseInt(reader.nextLine());
        int sum=read1+read2+read3;
        System.out.print("Sum is: " + sum);
    }

    public static void UserSum(){
        Scanner reader=new Scanner(System.in);
        int read=1;
        int sum=0;
        System.out.println("Enter numbers: ");
        while (read!=0) {
            read = Integer.parseInt(reader.nextLine());
            sum += read;
            System.out.println("Sum now is: " + sum);
            if (read==0) break;



        }
        System.out.println("Sum in the end is: "+ sum);
        }

        public static void numbersBetween(){
        Scanner reader= new Scanner(System.in);
            System.out.println("Enter first number: ");
            int first=Integer.parseInt(reader.nextLine());
            System.out.println("Enter second number: ");
            int last=Integer.parseInt(reader.nextLine());
            while (first<=last){
                System.out.println(first);
                first++;

            }
    }

    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java");
    }




    }



