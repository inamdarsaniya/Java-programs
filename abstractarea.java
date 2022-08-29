  abstract final class Figure {
    double dim1;
    double dim2;
    Figure(double a,double b) {
        dim1=a;
        dim2=b;
    }
    abstract double area(); 
}
class Rectangleareas extends Figure {
    Rectangleareas (int a,int b) {
        super(a,b);
    }
    double area() {
        System.out.println("the area of the rectangle is ");
        return (dim1*dim2);
    }
}
class Triangleareas extends Figure {
    Triangleareas (int a,int b) {
        super(a,b);
    }
    double area() {
        System.out.println("the area of the triangle is ");
        return (dim1*dim2)/2;
    }
}


public class abstractarea {
    public static void main(String[] args) {
        Rectangleareas r=new Rectangleareas(2,3);
        Triangleareas t=new Triangleareas(7, 4);
        Figure figref;
        figref=r;
        System.out.println(figref.area());
        figref=t;
        System.out.println(figref.area());

    }
}


