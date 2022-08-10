package ass_1;

import java.io.Serializable;

public class Student implements Serializable {

    int roll;
    String name;
    Address address;
    String email;
    transient String password;

    public Student(int roll, String name, Address address, String email, String password) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
