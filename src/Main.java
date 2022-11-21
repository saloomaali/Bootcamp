import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Select the operation\n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division");
        Scanner obj3 = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;

        switch (n){

            case 1:
                result = num1 + num2;
                break;

        }


    }
}