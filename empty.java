import java.util.Scanner;
public class empty{
    public static void main(String[] args) {
        System.out.println("enter the no. is: ");
        Scanner  sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sumNum=Sum(n);
        System.out.println(sumNum);
        
        
    }
    public static int Sum(int n){
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;



        }
        return sum;

    }

}