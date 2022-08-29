//heirarchial inheritance
class Figure {
    double dim1;
    double dim2;
    Figure(double a,double b) {
        dim1=a;
        dim2=b;
    }
    double area() {
        System.out.println("no figure defined");
        return 0;
    }
}
class Rectanglearea extends Figure {
    Rectanglearea (int a,int b) {
        super(a,b);
    }
    double area() {
        System.out.println("the area of the rectangle is ");
        return (dim1*dim2);
    }
}
class Trianglearea extends Figure {
    Trianglearea (int a,int b) {
        super(a,b);
    }
    double area() {
        System.out.println("the area of the triangle is ");
        return (dim1*dim2)/2;
    }
}


public class Findareas {
    public static void main(String[] args) {
        Figure obj=new Figure(10,20);
        Rectanglearea r=new Rectanglearea(2,3);
        Trianglearea t=new Trianglearea(7, 4);
        Figure figref;
        figref=obj;
        System.out.println(figref.area());
        figref=r;
        System.out.println(figref.area());
        figref=t;
        System.out.println(figref.area());

    }
}
