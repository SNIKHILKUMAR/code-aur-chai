import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        System.out.println("enter the no:");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no. is:");
        int a=sc.nextInt();
        System.out.println("enter the second no. is:");
        int b=sc.nextInt();
        int lcm=lcm(a,b);

        System.out.println(lcm);

        
    }
    public static int   lcm(int a,int b){
        int i=1;

       while (i<=b){
        int n= a * i;
        if(n % b==0){
            return n;
        }
        i++;

       
        
       }
       return 0;
    }

    
}
