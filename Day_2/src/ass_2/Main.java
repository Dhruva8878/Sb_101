package ass_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       List<String> city=new ArrayList<>();
       city.add("Indore");
       city.add("Pune");
       city.add("Khargone");
       city.add("Bhopal");

       PrintList list= (name) ->{
           for(String n:name){
               System.out.println(n);
           }
       };

       list.display(city);

    }
}

@FunctionalInterface
interface PrintList{
    abstract void display(List<String> city);
}