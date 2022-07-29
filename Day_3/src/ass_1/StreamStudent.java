package ass_1;

import java.lang.constant.Constable;
import java.util.*;
import java.util.stream.Collectors;

public class StreamStudent {


    public static void main(String[] args) {

        TreeSet<Student> list=new TreeSet<>(new AccToRoll());

        list.add(new Student(1,"Dhruv",500));
        list.add(new Student(5,"Viraj",450));
        list.add(new Student(2,"Abhay",350));
        list.add(new Student(4,"Kullu",200));
        list.add(new Student(3,"Gopal",100));


       list
               .stream()
               .filter(item -> (item.marks<250))
               .forEach(System.out::println);

    }
}

class AccToRoll implements Comparator<Student>  {


    @Override
    public int compare(Student o1, Student o2) {
       if(o1.roll> o2.roll){
           return 1;
       }
       else{
           return -1;
       }
    }
}