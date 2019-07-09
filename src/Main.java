import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
SorterInSet sorterInSet=new SorterInSet();
sorterInSet.addToSet(1,2,3,4,-5,-6,-7,8,9,10);
Set<Integer> treeSet = sorterInSet.getTreeSet();
System.out.println(treeSet);


    }
}
