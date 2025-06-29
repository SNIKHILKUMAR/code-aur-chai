public class parameter_argument {
    public static void main(String[] args) {
        int num = sumOfNumber(3,6);      //argument
        System.out.println(num);
          
        int num1 = sumOfNumber(5,8);
        System.out.println(num1);

        int num2 = sumOfNumber(-8,7);
        System.out.println(num2);


        
        
      

        
    }
    public static int sumOfNumber(int a,int b){  //parameter
        System.out.println("first no. is:  "+a);
        System.out.println("second no. is:  "+b);
        int sum=a+b;
        return sum;
     
    }
    
}
