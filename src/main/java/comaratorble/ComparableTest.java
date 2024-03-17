package comaratorble;

import java.security.KeyStore;
import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {

        Map<A,Integer> map=new TreeMap<>();
        map.put(new A("yuktha",6),109);
        map.put(new A("chahna",12),105);
        map.put(new A("revan",16),106);
        map.put(new A("nitish",14),105);
        map.put(new A("pooja",21),108);
        map.put(new A("deexi",19),100);
        map.entrySet().stream().filter(x->x.getValue()<106).sorted(Map.Entry.comparingByKey(Comparator.comparing(A::getName))).forEach(x-> System.out.println(x));
    }

}

class A implements Comparable<A>{
    String name;
    int age;

    public A(String name, int age) {
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
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(A o) {
        return o.name.compareTo(this.name);
    }
}
