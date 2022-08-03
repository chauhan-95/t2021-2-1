import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) throws Exception {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");


        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");

        String operator=scanner.next();

        scanner.close();
        double output;

        switch(operator)
        {
            case "+":
                output = num1 + num2;
                break;

            case "-":
                output = num1 - num2;
                break;

            case "*":
                output = num1 * num2;
                break;

            case "/":
                if(num2 == 0) throw new Exception("Divide by zero exception");
                output = num1 / num2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}
