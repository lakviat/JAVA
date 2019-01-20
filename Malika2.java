package Arrays;

public class Malika2 {
    public static void main(String[] args) {
        String words = "Hello world";
        String reverese = "";
        for (int i = words.length() -1; i >= 0 ; i--) {
        reverese = reverese + words.charAt(i);

        }
        System.out.print(reverese);
    }
}
