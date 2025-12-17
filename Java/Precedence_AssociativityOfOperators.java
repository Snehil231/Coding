public class Precedence_AssociativityOfOperators
 {
 public static void main(String[] args)
 {
    //int a = 6*5 - 34/2;
    /* 
    30 - 34/2
    30 - 17
    =13
    associativity is left to right
    * and / have same precedence so we evaluate from left to right
    */
    
    //int b = 50/5 - 34*2;
    /* 
    10 - 34*2
    10 - 68
    =-58
    associativity is left to right
    */

 //   int c = 5*4 - 8+5;
    /* 
    20 - 8+5
    20 - 8 = 12
    12 + 5 = 17
    
    associativity is left to right
    * has higher precedence than + and -
    */

    /* /System.out.println(a);
    System.out.println(b);
    System.out.println(c);
     */

//Quick quiz:-
/*  int a = 5 ;
int b = 10;
int k = a * b/2;
Logic:-

a*b/2
10/2
5
*/
  
int a = 5;
int b = 10;
int c= 4;
int k = b*b - (4*a*c)/ (2*a) ;
System.out.println(k);
/*  Logic:-
int k = b*b - (4*a*c)/ (2*a) ;
int k = 100 - (4*a*c)/ (2*a) ;
int k = 100 - 4*5*4/ (2*a) ;
int k = 100 - 80/ (2*a) ;
int k = 100 - 80/ (2*5) ;
int k = 100 - 80/ 10 ;
int k = 100 - 8 ;
int k = 92 ;
*/


 }

}
