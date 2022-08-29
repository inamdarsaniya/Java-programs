class para_cons {
int length;
int breadth;
para_cons(int len,int bre)
{
length = len;
breadth = bre;
}
}

class RectangleDemo {
public static void main(String args[]) {
para_cons r1 = new para_cons(20,10);
System.out.println("Length of Rectangle : " + r1.length);
System.out.println("Breadth of Rectangle : " + r1.breadth);
}
}