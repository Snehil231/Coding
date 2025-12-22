import java.util.Scanner;
public class PractiseSetfour19
{
    public static void main(String[] args) 
    {
   Scanner sc=new Scanner(System.in);      
    //q1:- 
    /* /int a = 10;
    if(a == 11)
    {
        System.out.println("I am 11");
    }
    else
    {
        System.out.println("I am not 11");
    }
        /*  
            //Q2:-
                double totalmarks = 300.0;
              System.out.print("Enter the marks in maths:-");
                double maths = sc.nextDouble();
                System.out.print("Enter marks in english :- ");
                double english = sc.nextDouble();  
                System.out.print("ENter marks in physics :-");
                double physic = sc.nextDouble();               
                double totalmarksobtained = a +b +c;
                double percentage =  (totalmarksobtained/totalmarks)*100;
                System.out.println("The percentage is :-"+percentage);
                if(percentage >= 40 && maths >=33 && english>= 33 && physics>= 33 )
                {
                    System.out.println("U are pass in exam");
                }
                else
                {
                    System.out.println("U are fail");
                }

         */

        /*  
        //Q3:-
        System.out.println("Enter your income :- ");
        double income = sc.nextDouble();
        if(income>10.0)
        {
            System.out.println("U are going to pay 30% tax");
        }
        else if(income>=5.0 && income<=10.0)
        {
            System.out.println("u are going to pay 20% tax");
        }
        else if (income>=2.5 && income <=5.0)
        {
         System.out.println("U are going to pay 5% tax");   
        }
        else
        {
            System.out.println("U are not eligible to pay tax ");
        }
         */
        /*  
        //Q4:-
        System.out.println("Enter the number :-");
        int days = sc.nextInt();
       switch(days)
       {
        case 1 : 
        System.out.println("Today is Monday");
        break;
        case 2:
        System.out.println("Today is Tuesday");
        break;
        case 3:
        System.out.println("Today is Wednesday");
        break;
        case 4: 
        System.out.println("Today is Thursday");
        break;
        case 5:
        System.out.println("Today is Friday");
        break;
        case 6:
        System.out.println("Today is Saturday");
        break;
        case 7:
        System.out.println("Today is Sunday ,Enjoy!!!");
        break;
        default:
            System.out.println("Enjoy your life");
       }
       System.out.println("WHEN U FEEL LIKE QUITING REMEMBER Y U STARTED");
        */
        /*  
       //Q5:- 
       System.out.println("Enter the year");
       int year = sc.nextInt();
       if(year%4 == 0 && year%100 != 0 || year%400 ==0)
       {
        System.out.println("The year is a leap year");
       }
       else
       {
        System.out.println("The year is not a leap year");
       }
        */
         
       System.out.println("Enter your website");
       String website = sc.nextLine();
       if(website.endsWith(".com"))
       {
        System.out.println("The website is a commercial website");
       }
       else if (website.endsWith(".org")) 
       {
        System.out.println("The webiste is a organization website");
       }
       else if(website.endsWith(".in"))
       {
        System.out.println("The website is an Indian website");
       }
       else
       {
        System.out.println("!!! The entered website is invalid !!!");
       }
      
    }
}
