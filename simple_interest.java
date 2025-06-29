import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of p : ");
        float p=sc.nextFloat();
        System.out.print("enter the value of r:");  
        float r=sc.nextFloat();
        System.out.print("enter the value of t:");  
        float t=sc.nextFloat();

        float si=((p*r*t)/100);
        System.out.println("simple interest is: "+ si);


    }
    
}
