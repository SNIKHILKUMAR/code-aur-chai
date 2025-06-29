import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of p : ");
        float p=sc.nextFloat();
        System.out.print("enter the value of r:");  
        float r=sc.nextFloat();
        System.out.print("enter the value of t:");  
        float t=sc.nextFloat();

        float ci=(p*(1+r/100)*t);
        System.out.println("the compound interest is: "+ci);
    }
    
}
