package ass_1;


/*
As we all know Java is multithreaded programming language in which we use same code many times,
 and we have to face race condition.A race-condition is a condition in which the critical section
 is concurrently executed by two or more threads. It leads to incorrect behavior of a program.
 */

public class Main {

    public static void main(String[] args) {
     Common c=new Common();
     ThreadA a=new ThreadA(c,"Ram");
     ThreadB b=new ThreadB(c,"Raju");

     a.start();
     b.start();
    }
}

class Common{

    public synchronized void func1(String name){
        System.out.println("welcome");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           e.getStackTrace();
        }
        System.out.println(name);

    }
}

class ThreadA extends Thread{

  Common c;
  String name;

  public ThreadA(Common c, String name){
      this.c=c;
      this.name=name;
      }


      @Override
      public void run(){
      c.func1(name);
      }


}

class ThreadB extends Thread{
    Common c;
    String name;

    public ThreadB(Common c, String name){
        this.c=c;
        this.name=name;
    }

    @Override
    public void run(){
        c.func1(name);
    }


}

