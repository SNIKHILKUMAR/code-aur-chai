import java.util.Scanner;
public class sumofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        int DigitSum=sumOfDigit(n);
        System.out.println(DigitSum); 
        
    }
    public static int sumOfDigit(int n){
        int sum=0;
       
        while(n>0){
            sum=sum+(n%10);
            n=n/10;

        }
        return sum ;
    }
    
}
