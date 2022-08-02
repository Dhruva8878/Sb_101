package ass_3;

public class Main {

    public static void main(String[] args) {

        Thread thread=new Thread(
                ()->{

                  for(int i=1; i<=10; i++){
                      try{
                          if(i==6){
                              Thread.sleep(5000);
                              System.out.println(i);
                          }
                          else{
                              System.out.println(i);
                          }
                      } catch (InterruptedException e) {
                          throw new RuntimeException(e);
                      }
                  }
                }
        );

        thread.start();
    }
}
