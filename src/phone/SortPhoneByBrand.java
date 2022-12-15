package phone;

import java.util.Comparator;

public class SortPhoneByBrand implements Comparator<Phone<String,Long>> {

    @Override
    public int compare(Phone<String, Long> o1, Phone<String, Long> o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
