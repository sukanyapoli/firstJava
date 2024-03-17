package comaratorble;

import java.util.*;
import java.util.stream.Collectors;

public class CompatarorTest {

    public static void main(String[] args) {
        Student student=new Student("chahna",12);
        Student student1=new Student("nitish",14);
        Student student2=new Student("revan",16);
        Student student3=new Student("yuktha",6);
        Student student4=new Student("deexi",19);
        List<Student> studentList=new ArrayList<>();

    }
}

class Student
{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

