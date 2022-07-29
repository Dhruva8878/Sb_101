package ass_3;

import ass_2.Student;

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
                new Student(3,"Gopal",800)
        );

        List<Employye> employyeList=details
                .stream()
                .map(student -> new Employye(student.getRoll(), student.getName(), (student.getMarks()*1000)))
                .collect(Collectors.toList());


       employyeList.forEach(emp -> System.out.println(emp));

    }
}
