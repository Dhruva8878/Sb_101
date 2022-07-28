package ass_1;

public class Demo {

    public static void main(String[] args) {

        Generic<String> myGen=new Generic<>();

        myGen.add("Dhruv");
        System.out.println(myGen.get());
    }
}

class Generic<T>{

    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }

}


