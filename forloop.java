public class forloop {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            System.out.println(i);
            if(i==5)
            {
                continue;
            }
            if(i==8) {
                break;
            }

        }
    }
}
