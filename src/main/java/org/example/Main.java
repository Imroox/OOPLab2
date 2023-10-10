import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        sumOfThreeNumbers();

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
}