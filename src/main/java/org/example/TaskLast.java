package org.example;
import java.util.Random;
import java.util.Scanner;

public class TaskLast {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner reader=new Scanner(System.in);

        int counter=1;

        int num=rand.nextInt(101);
        System.out.print("Guess a number: ");
        int userGuess= reader.nextInt();

        while(true){
            if(userGuess>num){
                System.out.println("The number is lesser!, guesses made "+ counter);
                counter++;
                System.out.print("Guess a number: ");
                userGuess=reader.nextInt();
            }
            else if(userGuess<num){
                System.out.println("The number is greater!, guesses made"+ counter);
                counter++;
                System.out.print("Guess a number: ");
                userGuess=reader.nextInt();
            }
            else {System.out.println("Congratulations, your guess is correct!\nYou made it in "+counter+" tries.");

                break;
            }

        }}

}










