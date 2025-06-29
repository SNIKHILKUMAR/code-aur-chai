public class car {
    int fuel;
    //string color;
    float reFuel;
    int carFuelLiter;
    int getcurrentFuelLevel;


    public car start(){
        if(carFuelLiter ==0){
            System.out.println("car is not start");
        }
        else
            if(carFuelLiter <5){
                System.out.println("car is in reserve mode ");
                carFuelLiter--;
            }
        
        else{
            System.out.println("car is +now driving....bruhhh....");
            carFuelLiter--;
        }
        return this;
    }
    
    public void drive(){
        
            System.out.println("car is driving");
            carFuelLiter--;
        
    }


    public void addFuel(float fuel){
        carFuelLiter+= fuel;
    }


    public float getcurrentFuelLevel(){
        return carFuelLiter;

    }
    
}
