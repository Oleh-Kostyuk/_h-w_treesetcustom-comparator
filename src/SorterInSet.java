import java.util.*;

public class SorterInSet {
    private SortedSet<Integer> treeSet = new TreeSet<>(new EvenOddComparator());

    public void addToSet(Integer... numbers) {
        treeSet.addAll(Arrays.asList(numbers));
    }

    public <T extends Set> T getTreeSet() {
        return (T) treeSet;
    }
}
