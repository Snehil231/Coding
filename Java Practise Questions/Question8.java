public class Question8
{
    public static void main(String[] args)
    {
        int a = 12;
        int b = 4;
        int c = 3;
        int d = a + b *c / 2 - a % b ;   
        // a + 4x3 /2 - a % b;
        // a + 6 - a% b;  % gives remainder because 12/4=3 remainder 0.
         // a + 6 - 0;
        //18-0;
        //18 
        System.out.println(d);
    }    
}
