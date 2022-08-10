package ass_4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee=new Employee(1,"dhruv", new Address("MP","Indore", "451440"),
                "xyz@gmail.com","12345");

        FileOutputStream fileOutputStream=new FileOutputStream("/emp.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();

        FileInputStream fileInputStream=new FileInputStream("/emp.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Object obj=objectInputStream.readObject();

        Employee newemp=(Employee) obj;

        System.out.println(newemp);




    }
}
