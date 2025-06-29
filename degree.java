import java.util.Scanner;

public class degree {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of f : ");
        float f=sc.nextFloat();

        float c=(f-32)*5/9;
        System.out.println("celcius is:"+c);
    }
    
}
