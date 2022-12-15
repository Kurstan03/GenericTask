package phone;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {

        Map<Phone<String, Long>,Person<String, Integer>> map = new LinkedHashMap<>();
            int index = 0;

            for (Phone<String,Long> phone : getAllPhone()) {
                map.put(phone, getAllPerson().get(index));
                index++;
            }
            System.out.println(map);


    }
    public static List<Person<String,Integer>>getAllPerson(){
        List<Person<String, Integer>> people = new ArrayList<>();
        people.add(new Person<>("Kurstan", 19));
        people.add(new Person<>("Salymbek", 16));
        people.add(new Person<>("Baiysh", 22));
        people.add(new Person<>("Altynbek", 15));
                    //sort by name
//        Collections.sort(people);
                    //sort by age
        people.sort(Person.sortByAge);

        return people;
    }

    public static Queue<Phone<String,Long>> getAllPhone(){
        List<Phone<String,Long>> list = new ArrayList<>();
        list.add(new Phone<>("Samsung", 64L));
        list.add(new Phone<>("Redmi", 128L));
        list.add(new Phone<>("iPhone", 256L));
        list.add(new Phone<>("Huawei", 16L));
                    //sort by brand
//        list.sort(new SortPhoneByBrand());
                  //sort by memory
        list.sort(Phone.sortByMemory);

        Queue<Phone<String,Long>> phones = new LinkedList<>(list);

        return phones;
    }
}
