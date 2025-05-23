package Collections.SetInterface;
import java.util.*;

public class Subset {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(4, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 6, 5));
        boolean isSubset = set2.containsAll(set1);
        System.out.println("Set1 is subset of Set2? " + isSubset);
    }
}

