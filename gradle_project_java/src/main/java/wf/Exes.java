package wf;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface My {
    void m();
}

class Person {
    String fName;
    String lName;
    int age;

    Person(String fn, String ln, int age) {
        this.fName = fn;
        this.lName = ln;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Exes {

    public static void main(String[] args) {
        My l = () -> {
            System.out.println(2);
        };
        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 1),
                new Person("Jimy", "john", 4),
                new Person("Adam", "Brown", 4),
                new Person("Olivia", "Maly", 4)
        );

        Collections.sort(people, (a, b)-> {
            return a.getfName().compareTo(b.getfName());
        });

        people.forEach(n->{
            System.out.println(n);
        });

        printCondition(people, p -> p.getfName().startsWith("J"), p -> System.out.println(p.getfName()));

        l.m();


    }

    public static void printCondition(List<Person> p, Predicate<Person> condition, Consumer<Person> con) {
        List<Person> ppp = p.stream().filter(condition.negate()).collect(Collectors.toList());
        System.out.println("--------------------------------------------");
        for(Person pe: p) {
            if (condition.negate().test(pe)) {
                con.accept(pe);
            }
        }
//        System.out.println("============================================");
//        System.out.println(ppp.stream().toArray()[0]);
//        Person[] ar = new Person[] {
//                new Person("j", "a", 2)
//        };
//        List<Person> col  = Arrays.stream(ar).collect(Collectors.toList());
//        col.forEach(n -> {
//            System.out.println(n);
//        });
    }
}
