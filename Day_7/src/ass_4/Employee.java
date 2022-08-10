package ass_4;

import java.io.Serializable;

public class Employee implements Serializable {

    private int empId;
    private String empName;
    Address address;
    private String email;
    transient private String password;

    public Employee(int empId, String empName, Address address, String email, String password) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
