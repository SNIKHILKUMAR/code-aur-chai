class student{
    String name;
    int age; 

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
// non paremeterized constructor ha
    // student(){
    //     this.name = "John";
    //     this.age= 43;
    // }

    // parameterized constructor ha 
    student(String name, int age ){
        this.name = name;
        this .age= age;

    }
}


public class constructor {
    public static void main(String  args[]){
        student s1 = new student("john",78);
        s1.printInfo();
    }
    
}
