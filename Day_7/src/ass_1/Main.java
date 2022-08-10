package ass_1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student s1=new Student(1,"Vikas",new Address("MP","Indore","452002"),
                "xyx@gmail.com","123456");


        FileOutputStream fileOutputStream=new FileOutputStream("/student.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s1);
        objectOutputStream.close();


        FileInputStream fileInputStream=new FileInputStream("/student.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Object deserial=objectInputStream.readObject();
        Student news1=(Student) deserial;

        System.out.println(news1);


    }






}
