import java.util.*;

public class SimplifyPath {
    static String simplify(String path) {
        Deque<String> folders = new ArrayDeque<>();
        for (String part : path.split("/")) {
            if (part.isEmpty() || part.equals(".")) continue;
            if (part.equals("..")) {
                if (!folders.isEmpty()) folders.removeLast();
            } else {
                folders.addLast(part);
            }
        }
        if (folders.isEmpty()) return "/";
        StringBuilder result = new StringBuilder();
        for (String folder : folders) result.append('/').append(folder);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplify("/home//user/../docs/./"));
    }
}
