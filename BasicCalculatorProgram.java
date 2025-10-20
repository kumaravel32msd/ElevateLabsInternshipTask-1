package Task1;

import java.util.Scanner;

public class BasicCalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the Operator:");
            char op=sc.next().charAt(0);
            if(op=='x'||op=='X')
            {
                System.out.println("Existing Loop...");
                break;
            }
            System.out.println("Enter the num1:");
            int Num1=sc.nextInt();
            System.out.println("Enter the num2:");
            int Num2=sc.nextInt();
            if(op=='+')
            {
                int Addition=Num1+Num2;
                System.out.println("The sum is"+Addition);
            }
            else if (op=='-')
            {
                int Subtraction=Num1-Num2;
                System.out.println("The Diff is"+Subtraction);
            }
            else if(op=='*')
            {
                int Multiplication=Num1*Num2;
                System.out.println("The Product is"+Multiplication);
            }
            else if(op=='/')
            {
                if(Num2!=0)
                {
                    int Division=Num1/Num2;
                    System.out.println("The Division is"+Division);
                }
                else
                {
                    System.out.println("It is Not Divisible By Zero");
                }
            }
        }
    }
}
