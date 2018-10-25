package Arrays;
import java.util.Arrays;
public class Practice08_AnagramMethod {
    public static void main(String[] args) {
        String firstword = "march";
        String secondword = "charm";
        System.out.println(isAnagram(firstword,secondword));
    }
    public static boolean isAnagram (String str1, String str2){
            if(str1.length() != str2.length()){
                return false;
            }
            char [] char1 = str1.toCharArray();
            char [] char2 = str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            for (int i = 0; i <str1.length() ; i++) {
                if(char1[i] != char2[i]){
                    return false;
                }
            }
            return true;

    }
}
