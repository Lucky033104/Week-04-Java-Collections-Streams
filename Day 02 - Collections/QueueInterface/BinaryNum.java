package Collections.QueueInterface;
import java.util.*;

public class BinaryNum {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }
    public static void main(String[] args) {
        int N = 6;
        List<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println("First " + N + " Binary Numbers: " + binaryNumbers);
    }
}