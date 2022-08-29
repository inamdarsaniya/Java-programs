import java.util.Random;
interface SharedConstant {
    int NO=0;
    int YES=1;
    int MAYBE=2;
    int LATER=3;
    int SOON=4;
    int NEVER=5;
}
 class question implements SharedConstant {
    Random ra=new Random();
    int ask() {
        int prob=(int)(100*ra.nextDouble());
        if(prob<30){
            return NO;
        }else if(prob<60){
            return YES;
        }else if (prob<70) {
            return MAYBE;
        }else if(prob<80)  {
            return LATER;
        }else if (prob<90) {
            return SOON;
        }else return NEVER;
    }

}


public class askme {


    static void result (int val){
        switch (val) {
            case 0:{
            System.out.println("NO");
                break;}
            case 1:{
            System.out.println("YES");
            break;}
            case 2:{
            System.out.println("MAYBE");
            break;}
            case 3:{
            System.out.println("LATER");
            break;}
            case 4: {
            System.out.println("SOON");
            break;
            }
            case 5:{
            System.out.println("NEVER");
            break;}
        }
    }
    public static void main(String[] args) {
       question q=new question(); 
       for(int i=0;i<2;i++) result(q.ask());
    }
}