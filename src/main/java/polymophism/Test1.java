package polymophism;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.*;

public class Test1 {


    public static void main(String[] args) throws FileNotFoundException {
       List<A> list=new ArrayList<>();
       list.add(new A("sukanya"));
       list.add(new A("chahna"));
        list.add(new A("sukanya"));
        list.add(new A("chahna"));
        list.add(new A("nitish"));

      //  Set<A> set=new HashSet<>(list);
        Collections.sort(list);
        System.out.println(list);

    }
}

class A implements Comparable<A>{
    String name;
    A(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(A o) {
        return this.name.compareTo(o.name);
    }
}

