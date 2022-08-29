class aa {
    interface NestedIF {
        boolean isNotNegative(int x) ;
    }
}
class bb implements aa.NestedIF {
    public boolean isNotNegative(int x) {
        return x>0?false:true;
    }
}
class NestedIfDemo {
    public static void main(String[] args) {
        aa.NestedIF obj=new bb();
       if(obj.isNotNegative(41)) {
           System.out.println("41 is not a negative number");
       }if(obj.isNotNegative(-25)) {
           System.out.println("-25 is a negative number");
       }
    }
}