public class Question9
{
    public static void main(String[] args) 
    {
        int a = 245;
        int b = a%10;  //5 "%" gives remainder
        a = a/10;   //24    "/" gives quotient
        int c = a%10;  //4  "%" gives remainder
        a = a/10;   //2     "/" gives quotient
        int result = a*100 + b*10 + c;  //2*100 + 5*10 + 4 
        // 200 + 50 + 4 = 254
        //we use b first to get the last digit in the hundreds place
        //then c to get the middle digit in the tens place
    System.out.println(result); 
        
        // Uncomment the lines below to see intermediate values
        // System.out.println(a);
       // System.out.println(b);             
        //System.out.println(c);             
     
        } 
            
}
