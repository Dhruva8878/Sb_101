package ass_2;

import java.io.*;

public class Employee implements Serializable {
    String name;
    String dob;
    String department;
    String designation;
    int salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee employee=new Employee();
        employee.setName("dhruv");
        employee.setDepartment("cs");
        employee.setDesignation("Head");
        employee.setSalary(25000);
        employee.setDob("18-06-2003");
      FileOutputStream fileOutputStream=new FileOutputStream("OutObject.txt");
      ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(employee);
      objectOutputStream.close();

      FileInputStream fileInputStream=new FileInputStream("OutObject.txt");
      ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Object obj=objectInputStream.readObject();

        Employee emp=(Employee) obj;
        System.out.println(emp.getName());
        System.out.println(emp.getDob());
        System.out.println(emp.getSalary());
        System.out.println(emp.getDepartment());
        System.out.println(emp.getDesignation());



    }
}
