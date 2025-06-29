import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {  
        System.out.println("enter the number:");
        System.out.println("the number is:");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        table(num);
        // return num;
        // }
    
    }
        
    
    public static void table(int num){
        for (int i = 1; i <=10; i++) {
        System.out.println(num+ " X " + i +" = "+ (num*i));
        // return num;
        
      }
       
    }
}
