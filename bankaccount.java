package bank.costumer;

public class bankaccount {
    private String accountNumber;
    private String HolderName;
    private int Balance;

    

    public bankaccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        HolderName = holderName;
    }

    public void addMoney( int money){
        if(money <=0){
            System.out.println("invalid money ");
            
        }else{

        
        Balance+= money;
        }
    }

    public int withdrawMoney( int money){
        if(Balance >= money){
            Balance -=money;
        }else if(money<0){
            System.out.println("invalid withdraw");
        }

          
        return money;

    }
    
}
