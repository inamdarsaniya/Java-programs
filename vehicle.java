public class vehicle {
    int num;
    String Type;
    String model;
    vehicle(int num,String Type,String model)
    {
        this.num=num;
        this.Type=Type;
        this.model=model;
    } 
    static void display(vehicle ob) {
        System.out.println("number: "+ob.num);
        System.out.println("Type: "+ob.Type);
        System.out.println("number: "+ob.model);
    }
    void drive() {
        System.out.println("wow this  is such a nice "+this.Type);
    }
    public static void main(String[] args) {
        vehicle obj1=new vehicle(45,"car","santro");
        display(obj1);
        obj1.drive();

    }
}
