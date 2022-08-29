
class newbox {
    double vol;
    double height;
    double length;
    double breadth;
    double volume() {
        return (length*breadth*height);
    }
//CONSTRUCTORS OF CLASS BOX
    newbox() {
    height=0;
    length=0;
    breadth=0;
    }
    newbox(double a,double b,double c) {
        height=a;
        breadth=c;
        length=b;
    }
    newbox(newbox ob) {
        this.height=ob.height;
        this.length=ob.length;
        this.breadth=ob.breadth;
    }
    newbox(double len) {
        height=breadth=length=len;
    }
    

}
class boxweight extends newbox {
    double weight;
    boxweight (double a,double b,double c,double d) {
        super(a,b,c);
        this.weight=d;
    }
    boxweight(double len,double weight) {
        super(len);
        this.weight=weight;
    }
    boxweight(newbox ob,double weight) {
        super(ob);
        this.weight=weight;
    }
}


class shipment extends boxweight {
    double cost;
    shipment(double a,double b,double c,double d,double cost) {
        super(a,b,c,d);
        this.cost=cost;
    }
    shipment(double len,double weight,double cost) {
        super(len,weight);
        this.cost=cost;
    }
    shipment (newbox ob,double weight,double cost) {
        super (ob,weight);
        this.cost=cost;
    }
}

class usingsuper {
    public static void main(String[] args) {
      newbox obj1=new newbox();
      System.out.println("default constructor is called"); 
      System.out.println("height is "+obj1.height);  
      System.out.println("length is " +obj1.length);  
      System.out.println("breadth is "+obj1.breadth); 
      
      newbox obj2=new newbox(10.2,13.4,9.1);
      System.out.println("parameterised constructor with all instance variables passed");  
      System.out.println("height is "+obj2.height);  
      System.out.println("length is " +obj2.length);  
      System.out.println("breadth is "+obj2.breadth); 

      newbox obj3=new newbox(obj2);
      System.out.println("passed an object to the constructor ");  
      System.out.println("height is "+obj3.height);  
      System.out.println("length is " +obj3.length);  
      System.out.println("breadth is "+obj3.breadth);

      boxweight obj5=new boxweight (3.21,5.23,8.16,7.7);
      System.out.println("constructor for box with dimension and weight called using super is");
      System.out.println("weight is "+obj5.weight);  
      System.out.println("height is "+obj5.height);  
      System.out.println("length is " +obj5.length);  
      System.out.println("breadth is "+obj5.breadth);

      newbox obj6=new newbox(4.18); 
      System.out.println("calling box constructor for a cube");
      System.out.println("height is "+obj6.height);  
      System.out.println("length is " +obj6.length);  
      System.out.println("breadth is "+obj6.breadth);

      boxweight obj7=new boxweight(4.14,3.18);
      System.out.println("calling boxweight constructor for a cube using super");
      System.out.println("weight is "+obj7.weight);  
      System.out.println("height is "+obj7.height);  
      System.out.println("length is " +obj7.length);  
      System.out.println("breadth is "+obj7.breadth);

      boxweight obj8=new boxweight(obj2,77.7);
      System.out.println("object is passed as an argument to the derived class using super");
      System.out.println("weight is "+obj8.weight);  
      System.out.println("height is "+obj8.height);  
      System.out.println("length is " +obj8.length);  
      System.out.println("breadth is "+obj8.breadth);

      System.out.println("MULTILEVEL HIERARCHY");
     
      shipment obj9=new shipment(3.21,5.23,8.16,7.7,3.05); 
      System.out.println("calling second derived class constructor using super");
      System.out.println("weight is "+obj9.weight);  
      System.out.println("height is "+obj9.height);  
      System.out.println("length is " +obj9.length);  
      System.out.println("breadth is "+obj9.breadth);
      System.out.println("the cost of shipment is "+obj9.cost);

      shipment obj10=new shipment(4.14,3.18,6.66);
      System.out.println("calling second derived class constructor using super for a cube");
      System.out.println("weight is "+obj10.weight);  
      System.out.println("height is "+obj10.height);  
      System.out.println("length is " +obj10.length);  
      System.out.println("breadth is "+obj10.breadth);
      System.out.println("the cost of shipment is "+obj10.cost);

      shipment obj11=new shipment(obj2,77.7,0.12);
      System.out.println("calling second derived class constructor using super by passing an object");
      System.out.println("weight is "+obj11.weight);  
      System.out.println("height is "+obj11.height);  
      System.out.println("length is " +obj11.length);  
      System.out.println("breadth is "+obj11.breadth);
      System.out.println("the cost of shipment is "+obj11.cost);
      System.out.println("volume is  " +obj11.volume());
    }
}
