public class StringCompression {
    static int compress(char[] a) {
        int read = 0, write = 0;
        while (read < a.length) {
            char current = a[read];
            int start = read;
            while (read < a.length && a[read] == current) read++;
            int count = read - start;
            a[write++] = current;
            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray())
                    a[write++] = digit;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        char[] a = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int size = compress(a);
        System.out.println(new String(a, 0, size));
    }
}
