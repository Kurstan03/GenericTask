import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchMaxElement {
    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>(Arrays.asList(3, 5, 8, 2, 8, 14, 3 , 0, 55));
        System.out.println(max(list, 0, 4));

    }
    public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end){
        Collections.sort(list);
        T max = list.get(end);
        return max;
    }
}
