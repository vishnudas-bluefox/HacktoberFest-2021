import java.util.Scanner;

public class SimCal {

    public static void main(String[] args) {

    	double number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");

     
        number1 = scanner.nextDouble();
        System.out.print("Enter the second number:");
        number2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char opr = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(opr)
        {
            case '+':
            	output = number1 + number2;
                break;

            case '-':
            	output = number1 - number2;
                break;

            case '*':
            	output = number1 * number2;
                break;

            case '/':
            	output = number1 / number2;
                break;

          
            default:
                System.out.printf("Invalid operator");
                return;
        }

        System.out.println(number1+" "+operator+" "+number2+": "+output);
    }
}
