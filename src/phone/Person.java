package phone;

import java.util.Comparator;

public class Person <T, E> implements Comparable<Person<String, Integer>>{
    private T name;
    private E age;

    public Person(T name, E age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    public static Comparator<Person<String, Integer>> sortByAge = new Comparator<Person<String, Integer>>() {
        @Override
        public int compare(Person<String, Integer> o1, Person<String, Integer> o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person<String, Integer> o) {
        return ((String)name).compareTo(o.name);
    }
}
