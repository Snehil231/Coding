import java.util.Scanner;
public class SwitchCaseStatements18 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int age ;
        System.out.print("Enter the age :- ");
        int age1= sc.nextInt();
        switch (age1) //switch is used with int, byte, short, char,  String
        //we create cases with constant values only it is useful for exact match.
         {
            case 18:
                {
                    System.out.println("u are a adult");
                }
                break; //this is used to terminate the case
                case 23:
                    {
                        System.out.println("u are going to become a enginner");
                        break;
                    }
                case 60: //case number can be any constant value it is not necessary to be in sequence.
                {
                    System.out.println("U can rest now");
                    break;
                }
        
            default: //it is like else block it is optional
                {
                    System.out.println("We are learning java we can WIN");
                }
                break;
        }
                        System.out.println("We can not Loose");

        /*  
        if(age>60)
        {
            System.out.println("U are a Senior Citizen");
        }    
        else if(age>45)
        {
            System.out.println("U are settled");
        }
        else if(age>25)
        {
            System.out.println("U can go to office");
        }
        else if(age>18)
        {
            System.out.println("U can go to college");
        }
        else
        {
            System.out.println("u are school going student");
        }
         */
    }    
}
