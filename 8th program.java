public class StringSplitRebuild {
    public static void main(String[] args) {
        String sentence = "Java programming is fun";

        // Splitting sentence into words
        String[] words = sentence.split(" ");

        // Rebuilding in a new format (e.g., joined by hyphens and uppercase)
        StringBuilder rebuilt = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            rebuilt.append(words[i].toUpperCase());
            if (i < words.length - 1) {
                rebuilt.append(" - ");
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Rebuilt: " + rebuilt.toString());
    }
}
