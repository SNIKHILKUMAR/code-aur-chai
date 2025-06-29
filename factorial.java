import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factory=fact(n);
        System.out.println(factory);
    }
    public static int  fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
        


    }
    
}
