package ass_1;

public class Demo {

    public static void main(String[] args) {


        Thread cal=new Thread(new Runnable() {
            @Override
            public void run() {
                int sum=1;
                for(int i=1; i<=10; i++){
                    sum*=i;
                }
                System.out.println(sum);
            }
        });

        cal.start();

    }
}

