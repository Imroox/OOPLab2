

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessNumberGame();


    }


    public static void checkPassword(){
        System.out.print("Enter a password: ");
        Scanner reader= new Scanner(System.in);
        String pass="carrot";
        while (true){
            String password= reader.nextLine();
            if (password.equals(pass)){
                System.out.println("Right!");
                System.out.println();
                System.out.print("The secret message is: jryy qbar!");
                break;
            }else {
                System.out.println("Wrong!");
                System.out.print("Enter a new password: ");
            }

        }
    }



    public static void threeNumberSum(){
        Scanner reader=new Scanner(System.in);
        int sum=0;
        int read;

        System.out.print("Enter a first number: ");
        read=Integer.parseInt(reader.nextLine());
        sum=sum+read;

        System.out.print("Enter a second number: ");
        read=Integer.parseInt(reader.nextLine());
        sum=sum+read;

        System.out.print("Enter a third number: ");
        read=Integer.parseInt(reader.nextLine());
        sum=sum+read;

        System.out.println("Sum: "+ sum);

    }

    public static void userSum(){

        Scanner reader= new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("Enter a number: ");
            int read=Integer.parseInt(reader.nextLine());
            if (read==0){
                break;
            } else {
                sum=sum+read;
                System.out.println("Sum now: "+ sum);
            }

        }
        System.out.println("Sum in the end: "+ sum);
    }

    public static void printBetween() {
        System.out.print("Enter a first number: ");
        Scanner reader = new Scanner(System.in);
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Enter a second number: ");
        int second = Integer.parseInt(reader.nextLine());
        while (first <=second) {
            System.out.println(first);
            first++;

        }if (first>second){
            System.out.println();
        }
    }

    public static void sumOfTheNtoTheN(){
        System.out.print("Enter a number: ");
        Scanner reader=new Scanner(System.in);
        int number=Integer.parseInt(reader.nextLine());
        int sum=0;

        for (int i=0; i<=number; i++){
            sum+=(int)Math.pow(2,i);
        }
        System.out.println("The result is : " + sum);




    }


    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java");
    }



    public static void printStars(int amount){
        for (int i=0; i<amount; i++){
            System.out.print("*");
        }
        System.out.println();

    }


    public static void drawStarsPiramid(int amount){

        for (int i=1; i<=amount; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void drawReverseStarPiramid(int size){
        for (int i=size; i>=1; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawNumberPiramid(int amount){
        for (int i=1; i<=amount; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void guessNumberGame(){
        System.out.print("Guess a number: ");
        Scanner reader=new Scanner(System.in);
        int num=Integer.parseInt(reader.nextLine());
        Random random= new Random();
        int drawNumber= random.nextInt(101);
        int counter=0;
        while (true){
            if (num==drawNumber){
                System.out.print("Congratulations your guess is correct!");
                break;

            } else if (num>drawNumber) {
                counter++;
                System.out.println("The number is lesser, guesses made: "+ counter);
                System.out.print("Guess a number: ");
                num= reader.nextInt();

            }else{
                counter++;
                System.out.println("The number is greater, guesses made: "+ counter);
                System.out.print("Guess a number: ");
                num= reader.nextInt();

            }
        }


    }



}



















