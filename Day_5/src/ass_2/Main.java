package ass_2;

public class Main {

    public static void main(String[] args) {
        Common c1=new Common();
        Common c2=new Common();
        Thread1 t1=new Thread1(c1,"Ram");
        Thread2 t2=new Thread2(c2,"Babu");

        t1.start();
        t2.start();
    }
}


class Common {

    public static synchronized void func1(String name)  {

        synchronized (Common.class){
            System.out.println("Welcome");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }

            System.out.println(name);
        }


    }
}

class Thread1 extends Thread{
    Common c;
    String name;

    public Thread1(Common c ,String name){
        this.c=c;
        this.name=name;
    }

    @Override
    public void run(){
        c.func1(name);
    }
}

class Thread2 extends Thread{
    Common c;
    String name;

    public Thread2(Common c ,String name){
        this.c=c;
        this.name=name;
    }

    @Override
    public void run(){
        c.func1(name);
    }
}