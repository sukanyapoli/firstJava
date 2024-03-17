package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStream {



    public static void main(String[] args) {

       List<Integer> numbers=Arrays.asList(3,9,2,5,7,10,12);
       int sum=numbers.stream().mapToInt(x->x).sum();
        System.out.println(sum);


    }
}
class Employee{

    private String name;
    private int age;
    private int salary;
    private List<String> phone;

    public Employee(String name, int age, int salary, List<String> phone) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", phone=" + phone +
                '}';
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}