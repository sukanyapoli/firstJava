package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(new Student("chahna",12,"ECE"),
                new Student("nitish",14,"MBBS"),
                new Student("yuktha",6,"MBBS"),
                new Student("deexi",19,"ECE"),
                new Student("revan",16,"EEE"),
                new Student("pooja",21,"ECE"),
                new Student("pooja",38,"EIE"));

    }
}

class Student{
    private String name;
    private int age;
    private String department;

    public Student(String name, int age,String department) {
        this.name = name;
        this.age = age;
        this.department=department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

}
