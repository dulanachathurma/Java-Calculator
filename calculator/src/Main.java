import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner scanner= new Scanner(System.in);
                System.out.println("Enter number1:");
                double number1= scanner.nextDouble();

                System.out.println("Enter number2:");
                double number2= scanner.nextDouble();

                System.out.println("Enter the operator(+,-,/,*,%):");
                char operator= scanner.next().charAt(0);

                switch (operator) {
                    case '+':
                        System.out.println(number1+number2);
                        break;

                    case '-':
                        System.out.println(number1-number2);
                        break;

                    case'*':
                        System.out.println(number1*number2);
                        break;

                    case'/':
                        System.out.println(number1/number2);
                        break;

                    case'%':
                        System.out.println(number1%number2);
                        break;
                }



    }
}