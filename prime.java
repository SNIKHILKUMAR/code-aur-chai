import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.err.println("enter the number   ");
        int n=sc.nextInt();
        boolean num=num(n);
        //System.out.println(prime);
        if(num){
            System.out.println("prime no.");

        }
        else{
        System.out.println("not prime");
        }



    }
    public static boolean num(int n){
        int i=2;
        while(i < n){
            if(n%i==0){
                return false;
            }
        }
            return true;

        
    }
    
}
