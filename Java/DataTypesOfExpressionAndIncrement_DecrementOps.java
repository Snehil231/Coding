public class DataTypesOfExpressionAndIncrement_DecrementOps
{
    public static void main(String[] args) 
    {
     /* 
     Data files for Expression Data Types:-

        byte a = 5;
        short b = 5;
        int sum = a + b;
        System.out.println(sum);
        //byte + short = int
        
        short a1 = 6;
        int  b1 = 5;
        int multiply = a1*b1;
        System.out.println(multiply);
        //short * int = int

        long a2 = 10;
        float b2 = 15;
        float divide = a2/b2;
        System.out.println(divide);
        //long / float = float
    
        int a3 = 10;
        float b3 = 7;
        float minus = a3 - b3;
        System.out.println(minus);
        //int - float = float
   
        char a4 = 'S';
        int b4 = 5;
        int sum2 = a4 + b4;
        System.out.println(sum2);
        //char + int = int

        char a5 = 'C';
        short b5 = 4;
        int minus1 = a5 - b5;
        System.out.println(minus1);
        //char - short = int

        long a6 = 53224;
        double b6 = 3534.54;
        double sum3 = a6 + b6;
        System.out.println(sum3);
        //long + double = double

        float a7 = 566.33f;
        double b7 = 533.232;
        double minus2 = a7 - b7;
        System.out.println(minus2);
        //float - double = double
     */


         /*   Increment & Decrement:-
         int a = 55;
        int b = a++;
        System.out.println("Enter the value before increment :-"+b);
        System.out.println("Enter the increment value:-"+a); 
        //storing vale of a in b first then incrementing a

        int c = 45;
        int d = ++c;
        System.out.println("Enter the increment value:-"+d);
        //storing incremented value of c in d

         int e = 76;
        int f = e--;
        System.out.println("Enter the value before Decrement :-"+f);
        System.out.println("Enter the Decrement value:-"+e);
        //storing vale of e in f first then decrementing e

        int g = 45;
        int h = --g;
        System.out.println("Enter the Decrement value:-"+h);
         //Storing decremented value of g in h.

        */
        /*  Quiz 1:-
         int y = 7;
         int x = ++y * 8;
         System.out.println(x);
        // y is incremented first to 8, then multiplied by 8 to give 64.
         */

        char a = 'S';
        char b = ++a;
        System.out.println(b);
        // 'S' is incremented to 'T', so b will be 'T'.char is used because char data type can be incremented to next character in unicode table.Unicode is a standard for encoding characters used in most of the world’s writing systems.

        }
}
