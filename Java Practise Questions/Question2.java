import java.util.Scanner;
public class Question2
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the float num:- ");
     float a = sc.nextFloat();
     System.out.println("Enter the integer num:- ");
     int b = sc.nextInt();
     double multiplication = a *b;
     System.out.println("The result in double is :-"+ multiplication);   
    }
}
