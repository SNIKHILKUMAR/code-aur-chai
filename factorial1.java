import java.util.Scanner;
public class factorial1 {
   

        
      
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int n=sc.nextInt();

          System.out.println("Factorial of the number  is: " + factorial(n));
        }
        public static int factorial(int n) {
          // base case
          if (n == 0) {
            return 1;
          }
          // calling recursive function
          return n * factorial(n - 1);
        }
      }
    

