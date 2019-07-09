import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (Math.abs(o1 % 2) == Math.abs(o2 % 2))
            return o1.compareTo(o2);
        return (o1 % 2 == 0) ? -1 : 1;
    }
}
