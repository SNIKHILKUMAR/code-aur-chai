import java.util.Scanner;
public class arithematic_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the  first number: ");
        int a=sc.nextInt();
        System.out.print("enter the 2 number:");
        int b=sc.nextInt();

        int c=a+b;
        int d=a*b;
        int e=a/b;
        int f=a%b;
        int g=a-b;
        // System.out.println();

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
       
        
    }
    
}
