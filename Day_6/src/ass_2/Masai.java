package ass_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Masai {

    public static void main(String[] args) {
        Thread1 [] thread1={
                new Thread1("Coding"),
                new Thread1("DSA"),
                new Thread1("PS_311"),
                new Thread1("MAC"),
        };

        ExecutorService executorService= Executors.newFixedThreadPool(4);

        for(Thread1 td:thread1){
            executorService.submit(td);
        }
        executorService.shutdown();

    }
}

class Thread1 extends Thread{

    String name;
    Thread1(String name){
        this.name=name;
    }

    @Override
   public void run(){
        System.out.println(name+"work is starting");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println(name+"work is completed");

    }
}
