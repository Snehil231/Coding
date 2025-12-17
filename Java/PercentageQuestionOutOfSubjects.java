import java.util.Scanner;
public class PercentageQuestionOutOfSubjects

 {
 public static void main(String[] args)
 {
    double totalmarks = 500.00f;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks of Maths :- ");
    int a = sc.nextInt();
    System.out.print("Enter the marks of English :- ");
    int b = sc.nextInt();
    System.out.print("Enter the marks of Chemistry :- ");
    int c = sc.nextInt();
    System.out.print("Enter the marks of Physics :- ");
    int d = sc.nextInt();
    System.out.print("Enter the marks of Biology :- ");
    int e = sc.nextInt();
    int sum = a + b + c + d + e;
    double percent = (sum / totalmarks )*100;
    System.out.println("The percentage of the student is :- "+percent);
 }
}
