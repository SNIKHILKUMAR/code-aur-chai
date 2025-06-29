package bank.costumer;

public class bankMoney {
    public static void main(String[] args) {
        bankaccount acc= new bankaccount("011", "NIKHIL");
        acc.addMoney(100);
        System.out.println(acc.withdrawMoney(200));
        acc.addMoney(-45);
        acc.withdrawMoney(-55);
    }

    
}
