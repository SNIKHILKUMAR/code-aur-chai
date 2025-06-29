class pen{
    String color;
    String type;
    
    public void write(){
        System.out.println("writing Something.... ");
    }

    public void gyan(){
        System.out.println(this.color);
        System.out.println(this.type );
    }

}

public class object {
    public static void main(String args[]){
        pen pen1 = new pen();
        pen1.color = "1.blue";
        pen1.type ="2.gel";
        

        pen pen2 = new pen();
        pen2.color= " 1.black";
        pen2.type  =" 2.ballpoint ";


        pen1.write();
        System.out.println("\n");
        pen1.gyan();
        
        System.out.println("\n");
        pen2.gyan();

    }
    
}
