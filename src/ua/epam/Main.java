package ua.epam;

import java.lang.reflect.Array;
import java.util.Arrays;

 class InvertArray {
    public static void main(String[] args) {
        int [] array = {7,6,1,2,5,9,4,7,3};
        int tempValue;
        int arrayLength = Array.getLength(array);

        System.out.println("array = " + Arrays.toString(array));

        for (int i = 0; i < arrayLength / 2; i++) {
            tempValue = array[i];
            array[i] = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = tempValue;
        }

        System.out.println("after inversion = " + Arrays.toString(array));

    }
}
