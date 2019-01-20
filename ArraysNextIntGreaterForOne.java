package Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArraysNextIntGreaterForOne {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 4, 5, 6, 7, 8,};
        method(numbers);
        System.out.println(method(numbers));


    }

    public static boolean method(int[] numbers) {


        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {


            }
        return true;
        }
    return false;
    }

}















