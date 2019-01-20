package Arrays;
import java.util.Arrays;
import java.util.ArrayList;
public class Malika4 {
    public static void main(String[] args) {
        String words = "What is the world look like civic";
        String reveres = "";
        String[] NewArray = words.split(" ");
        for (int i = 0; i < NewArray.length; i++) {
            reveres.equals(reveres + NewArray[NewArray[i].charAt(i)]);
        }
        System.out.println(reveres);
    }
}
