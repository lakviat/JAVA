package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ACCESSING_ITEMS_IN_ARRAYS {
    public static void main(String[] args) {

        String [] brands = new String [] {"Hello", "What", "Apple", "GALXY", "Zara", "Nike"};
        String contain = "";
        for (int i = 0; i <brands.length ; i++) {
            if(brands[i].contains("e")){
                contain = contain + brands[i] + " ";
            }

        }

        contain.split(" ");
        System.out.println(contain);
            }

    }





