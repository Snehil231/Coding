import java.util.Scanner;
public class ScannerInput 
{
 public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
   System.out.println("Taking user input:- ");
   System.out.print("Enter number 1:- ");
       int a =  sc.nextInt();
    System.out.print("Enter number 2:- ");
        int b =  sc.nextInt();
   int sum = a +  b ;
   System.out.println("The sum of these numbers is:- "+sum);
 }   
}
