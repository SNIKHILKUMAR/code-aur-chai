import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        greetUser();
       
        int first= number() +2;
        int second=number() +3;
        
        int sum=first+second;
        System.out.println("the sum of the no. is:"+sum);
    }


        public static int number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1 no:");
        int Number=sc.nextInt();
        return Number;

        }

        public static void greetUser()  {
        System.out.println("hello coding");
        }





    
    
}
