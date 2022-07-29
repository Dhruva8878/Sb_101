package ass_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> details= Arrays.asList(
                new Student(1,"Dhruv",1000),
                new Student(5,"Viraj",950),
                new Student(2,"Abhay",750),
                new Student(4,"Kullu",600),
                new Student(3,"Gopal",8800)
        );

       List<Student> newlist= details
                .stream()
                .filter(student -> student.getMarks()<800)
                .collect(Collectors.toList());


        System.out.println(newlist);

    }
}
