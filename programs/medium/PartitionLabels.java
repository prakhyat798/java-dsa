import java.util.*;

public class PartitionLabels {
    static List<Integer> partition(String s) {
        int[] last = new int[65536];
        for (int i = 0; i < s.length(); i++) last[s.charAt(i)] = i;
        List<Integer> lengths = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i)]);
            if (i == end) {
                lengths.add(end - start + 1);
                start = i + 1;
            }
        }
        return lengths;
    }

    public static void main(String[] args) {
        System.out.println(partition("ababcbacadefegdehijhklij"));
    }
}
