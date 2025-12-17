public class Question7
{
public static void main(String[] args)
{
    int a = 10;
    int b = ++a + a++ + --a;
    System.out.println( " " + b);
    //++a = 11 as first increment then store .
    //a++ = 11 as first store  then increment ,therefore a become 12 ;
    // --a = 11 as first decrement then store;
}    

}
