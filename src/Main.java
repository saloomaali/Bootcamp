import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select the operation\n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division0 \n 5 - exit \n");
        int n = input.nextInt();
        if (n == 5){
            System.out.println("You ar exiting from the program");
        }
        else {
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = 0;

            switch (n) {

                case 1:
                    result = num1 + num2;
                    break;

                case 2:
                    result = num1 - num2;
                    break;

                case 3:
                    result = num1 * num2;
                    break;

                case 4:
                    try {
                        result = num1 / num2;
                    }
                    catch (ArithmeticException e){
                        System.out.println("Exception occured");
                        System.out.println(e.toString());
                    }

                    break;


                default:
                    System.out.println("enter valid number");

            }
            System.out.println("Result is " + result);
        }


    }
}