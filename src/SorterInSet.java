import java.util.*;

public class SorterInSet {
    SortedSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (Math.abs(o1%2)==Math.abs(o2%2)){
                return o1.compareTo(o2); }
            else if (o1%2==0) {
                return -1;
            }
            return 1;
        }
    }) ;
   public void addToSet  (Integer... numbers){
        treeSet.addAll(Arrays.asList(numbers));

    }
    public <T extends Set> T getTreeSet () {
       return (T) treeSet ;
    }
}
