package j3_lesson1;

import java.util.ArrayList;

public class ArrayListCreator <T> {
    public ArrayList<T> transformationFromArrayToArrayList (T[] array) {
        ArrayList<T> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }

        return result;
    }
}
