package ass_2;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Student ,String> details= new TreeMap<>(new AccToMarks());

        details.put(new Student(1,"Dhruv",97) , "Madhya Pradesh");
        details.put(new Student(2,"Rahul",75) , "Utter Pradesh");
        details.put(new Student(3,"Gopal",93) , "Jharkhand");
        details.put(new Student(4,"Kullu",99) , "Assam");


        Set<Map.Entry<Student,String>> det= details.entrySet();

        for(Map.Entry<Student,String> x:det){
            System.out.println(x.getKey()+" => "+x.getValue());
        }
    }
}


class AccToMarks implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getMarks()< s2.getMarks()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
