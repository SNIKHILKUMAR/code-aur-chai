import java.util.Scanner;
public class simple_interest {
    static int simple_interest(int p,int r,int t){
        int  si=((p*r*t)/100);
       // si=(p*r*t)/100;
        return si;


    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("value of p");
      int p=sc.nextInt();
      System.out.println("value of r");
       int r=sc.nextInt();
       System.out.println("value of t");
        int t=sc.nextInt();





      System.out.println("the simple_interest is"+simple_interest(p,r,t));

    }
    
}
