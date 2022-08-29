public class Encapsulation {
    public static void main(String[] args) {
        Bank obj=new Bank();
        System.out.println("your account num is "+obj.set_acc_num(4562));
}}
class Bank {
    private int acc_num;
    public int set_acc_num(int user) {
        this.acc_num=user;
        return (this.get_acc_num());
    }
    public int get_acc_num() {
        return (this.acc_num);
    }
}

