package Task1;

import java.util.Scanner;

public class BasicCalculatorProgramAnotherMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        int Num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int Num2=sc.nextInt();
        System.out.println("Enter the Operator:");
        char op=sc.next().charAt(0);
        switch (op)
        {
            case'+':
            {
                int Addition=Num1+Num2;
                System.out.println("The sum is"+Addition);
                break;
            }
            case'-':
            {
                int Subtraction=Num1-Num2;
                System.out.println("The Diff is"+Subtraction);
                break;
            }
            case'*':
            {
                int Multiplication=Num1*Num2;
                System.out.println("The Product is"+Multiplication);
                break;
            }
            case'/':
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
                break;
            }
            default:
            {
                System.out.println("Invalid Operator");
            }
            }
        }
    }

