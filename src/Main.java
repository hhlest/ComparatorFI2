import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, -5, 4, -1, 5, 8, 3, 10));
        System.out.println(list1);

        Comparator<Integer> c2 = (a, b) -> Math.abs(a) - Math.abs(b);
        list1.sort(c2);
        System.out.println(list1.get(0)); // 1
    }
}
