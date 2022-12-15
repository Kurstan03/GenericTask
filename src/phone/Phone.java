package phone;

import java.util.Collections;
import java.util.Comparator;

public class Phone <T, E>{
    private T brand;
    private E memory;

    public Phone(T brand, E memory) {
        this.brand = brand;
        this.memory = memory;
    }

    public T getBrand() {
        return brand;
    }

    public void setBrand(T brand) {
        this.brand = brand;
    }

    public E getMemory() {
        return memory;
    }

    public void setMemory(E memory) {
        this.memory = memory;
    }
    public static Comparator<Phone<String,Long>> sortByMemory=
            (Phone<String, Long> o1, Phone<String, Long> o2) -> o1.memory.compareTo(o2.memory);
    @Override
    public String toString() {
        return "\n    Phone{" +
                "brand=" + brand +
                ", memory=" + memory +
                '}';
    }
}
