import java.util.Scanner;
public class Question1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num:- ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num:- ");
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int product = a*b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("The sum is :- "+sum);
        System.out.println("The sub is :- "+sub);
        System.out.println("The product is :- "+product);
        System.out.println("The quotient is :- "+quotient);
        System.out.println("The remainder is :- "+remainder);
    }
}