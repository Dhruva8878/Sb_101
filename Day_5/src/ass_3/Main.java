package ass_3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
            Thread1 t1=new Thread1();
            Thread2 t2=new Thread2();
            t1.start();
            t2.start();

            t1.join();
    }
}

class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=20; i++){
            if(i%2==1){
                System.out.println("Odd Number is = "+i);
            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
    for(int i=1; i<=20; i++){
        if(i%2==0){
            System.out.println("Even Number is = " +i);
        }
    }
    }
}
