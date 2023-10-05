package pl.hajduk.generics.v2;

import java.util.Arrays;

public class Swap {

    public static <T> T[] swapElements(T[] array, int position1, int position2) {
        if (position1 < 0 || position1 >= array.length || position2 < 0 || position2 >= array.length) {
            System.out.println("give proper indexes");
        }
        T temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;

        return array;
    }


    public static void main(String[] args) {
        Integer[] integerArray = {13, 62, 32, 4, 5, 36, 7, 8, 9, 10};
        System.out.println("array before change: " + Arrays.toString(integerArray));


        System.out.println("");
        Integer[] integers = swapElements(integerArray, 0, 2);

        System.out.println(Arrays.toString(integers));
    }
}
