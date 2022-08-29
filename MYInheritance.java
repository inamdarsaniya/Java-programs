class box {
    double height;
    double length;
    double breadth;
    double weight;


    box() {
    height=0;
    length=0;
    breadth=0;
    weight=0;
    }
    box(double a,double b,double c,double d) {
        height=a;
        breadth=c;
        length=b;
        weight=d;

    }
    box(box ob) {
        this.height=ob.height;
        this.weight=ob.weight;
        this.length=ob.length;
        this.breadth=ob.breadth;

    }
    

}
class boxcube extends box {
    boxcube(double len) {
        length=breadth=height=len;
        
    }
    boxcube(double len,double weight) {
        length=breadth=height=len;
        this.weight=weight;
    }
}
class MYInheritance {
    public static void main(String[] args) {
      box obj1=new box();
      System.out.println("default constructor is called");
      System.out.println("weight is "+obj1.weight);  
      System.out.println("height is "+obj1.height);  
      System.out.println("length is " +obj1.length);  
      System.out.println("breadth is "+obj1.breadth); 
      
      box obj2=new box(10.2,13.4,9.1,1.0);
      System.out.println("parameterised constructor with all instance variables passed");
      System.out.println("weight is "+obj2.weight);  
      System.out.println("height is "+obj2.height);  
      System.out.println("length is " +obj2.length);  
      System.out.println("breadth is "+obj2.breadth); 

      box obj3=new box(obj2);
      System.out.println("passed an object to the constructor ");
      System.out.println("weight is "+obj3.weight);  
      System.out.println("height is "+obj3.height);  
      System.out.println("length is " +obj3.length);  
      System.out.println("breadth is "+obj3.breadth); 

      boxcube obj4=new boxcube(4.21);
      System.out.println("constructor for a cube without weight as parameter is called");
      System.out.println("height is "+obj4.height);  
      System.out.println("length is " +obj4.length);  
      System.out.println("breadth is "+obj4.breadth); 

      boxcube obj5=new boxcube(3.21,7.7);
      System.out.println("constructor for cube with dimension and weight is called");
      System.out.println("weight is "+obj5.weight);  
      System.out.println("height is "+obj5.height);  
      System.out.println("length is " +obj5.length);  
      System.out.println("breadth is "+obj5.breadth);
    }
}
