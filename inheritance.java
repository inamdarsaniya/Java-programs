//method overriding of wheels is also done
class vehicle {
    void breaks() {
        System.out.println("the break is applied");
    }
    void accelerator() {
        System.out.println("the vehicle is accelerating");
    }
    void wheels () {
        System.out.println("there are four wheels");
    }    

}

class bike extends vehicle{
    
    void suspension () {
        System.out.println("the bike is accelerating");
    }
    void wheels() {
        System.out.println("there are two wheels");
    }
    
    
}   



public class inheritance {
  public static void main(String[] args) {
    bike b=new bike();
    vehicle v=new vehicle();  
    b.breaks();
    b.accelerator();
    b.wheels();

  }  
}
