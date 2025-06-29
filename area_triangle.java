import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1 number: ");
        float a=sc.nextFloat();
        System.out.print("enter the 2 number:");
        float b=sc.nextFloat();

        double c=0.5*a*b;
        System.out.println(c);
    }
    
}
