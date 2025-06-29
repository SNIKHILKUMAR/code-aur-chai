import java.util.Scanner;
public class recursion {
   static void number(int n){
    if(n==0){
       return;
    }
    
         if(n%2==0){
            System.out.println(n);
          }
            //System.out.print(n-2);
            number(n-1);

}

       
      
     public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    
    int n=sc.nextInt();
    number(n );



    }
    
}
