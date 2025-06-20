import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) { // Add only if it's not present
                result.append(ch);
            }
        }
        return result.toString();
    }
}
