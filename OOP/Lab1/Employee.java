package Lab1;
public class Employee {
    private String name;
    private double salary;
    private String phone;
    public Employee(String name, double salary, String phone) {
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}