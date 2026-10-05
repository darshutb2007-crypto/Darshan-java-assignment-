public class CountVowels {
    public static void main(String[] args) {
        String text = "Java Programming";
        int count = 0;
        String str = text.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels in '" + text + "': " + count);
    }
}
