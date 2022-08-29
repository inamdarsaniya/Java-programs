class finallydemo {
    static void procA () {
        try {
            throw new RuntimeException("demo"); 
        }finally {
            System.out.println("inside procA finally");
        }
    }
    static void procB()  {
        try{
            System.out.println("inside procB");
            return;
        }finally {
            System.out.println("inside procB finally");
        }
    }
    static void procC () {
        try{
            System.out.println("inside procC");
        }finally{
            System.out.println("inside procC finally");
        }
    }
    public static void main(String[] args) {
        try{
            procA();
        }catch (RuntimeException e) {
            System.out.println("the exception is "+e);
        }
        catch (Exception e){
            System.out.println("the exception is "+e);
        }
        procB();
        procC();
    }
}