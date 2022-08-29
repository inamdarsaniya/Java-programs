import java.util.Random;

enum Answers {
    YES,NO,NEVER,MAYBE,SOON,LATER;
}

 class question{
    Random rand=new Random();
    int prob=(int)(100*rand.nextDouble());
    Answers ask() {
        if(prob<15) return Answers.YES;
        if(prob<30) return Answers.NO;
        if(prob<45) return Answers.MAYBE;
        if(prob<60) return Answers.LATER;
        if(prob<75) return Answers.SOON;
        else return Answers.NEVER;
    }
}


public class Askme2 {
    static void ans(Answers a) {
         switch(a) {
                case MAYBE:
                System.out.println("MAYBE");
                break; 
                case YES:
                System.out.println("YES");
                break;
                case NO:
                System.out.println("NO");
                break;
                case LATER:
                System.out.println("LATER");
                break;
                case NEVER:
                System.out.println("NEVER");
                break;
                default:
                System.out.println("SOON");
            }
    }  
    public static void main(String[] args) {
        question obj=new question();
        ans(obj.ask());
    }
    

}

