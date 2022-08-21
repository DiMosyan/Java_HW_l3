package lesson1;

import lesson1.BigTask.Apple;
import lesson1.BigTask.Box;
import lesson1.BigTask.Fruit;
import lesson1.BigTask.Orange;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        testChangeElementOfArray();
        testTransformationFromArrayToArrayList();
        testBigTask();

    }

    public static void testChangeElementOfArray() {
        System.out.println("changeElementOfArray");
        String[] array = new String[] {"one", "two", "three", "four"};
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
        new ChangeElementOfArray<String>().changeElementOfArray(array, 0, 3);
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void testTransformationFromArrayToArrayList() {
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> list = new ArrayListCreator<Integer>().transformationFromArrayToArrayList(array);

        System.out.println("transformationFromArrayToArrayList");
        System.out.println(list.getClass());
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(list.get(i) + " ");
        }

        System.out.println();
        System.out.println();
    }

    public static void testBigTask() {
        System.out.println("getWeight");
        Box<Fruit> orangeBox = new Box<>();
        for (int i = 0; i < 4; i++) {
            orangeBox.putFruit(new Orange());
        }
        System.out.println(orangeBox.getWeight());

        Box<Fruit> appleBox = new Box<>();
        for (int i = 0; i < 5; i++) {
            appleBox.putFruit(new Apple());
        }
        System.out.println(appleBox.getWeight());

        System.out.println();
        System.out.println("compare");

        System.out.println(orangeBox.compare(appleBox));
        appleBox.putFruit(new Apple());
        System.out.println(appleBox.compare(orangeBox));
        System.out.println();


        System.out.println("pourOver");
        Box anotherOrangeBox = new Box();
        anotherOrangeBox.putFruit(new Orange());
        appleBox.pourOver(anotherOrangeBox);
        System.out.println("weight of appleBox: " + appleBox.getWeight());
        orangeBox.pourOver(anotherOrangeBox);
        System.out.println("weight of orangeBox " + orangeBox.getWeight());
        System.out.println("weight of anotherOrangeBox: " + anotherOrangeBox.getWeight());
    }
}
