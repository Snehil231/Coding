import java.util.Scanner;
public class Strings_13
{
 public static void main(String [] args)
 {
    Scanner sc = new Scanner(System.in);
   /*  System.out.println("Enter the user input:- ");
    String a = sc.next();
    System.out.println("The String is :- "+a);   
 */
/*  
  int a = 10;
float b = 15.4534f;
double c = 23.434334;
System.out.printf("The value of a = %d\n",a);
System.out.printf("The value of b = %.2f\n",b);
System.out.printf("The value of c = %15.2f\n",b);
System.out.printf("The value of c = %-15.2f",b);
 */ 

/*  System.out.println("Enter the string :- ");
String b = sc.nextLine();
System.out.println("The String is :- "+b);
 */

/*  int c = 25;
int d = 55;
System.out.print("The value of c is :-"+c);
System.out.print("The value of d is :- "+d);
 */
int a = 23;
float b = 23.43223f;
String a1 = String.format("The value of a is :- %d",a);
String a2 = String.format("The value of b is :- %.4f",b);
System.out.println(a1);
System.out.println(a2);
}   

}
