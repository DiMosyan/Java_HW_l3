package lesson1;

public class test {
    public static void main(String[] args) {
        changeElementOfArray();
    }

    public static void changeElementOfArray() {
        String[] array = new String[] {"one", "two", "three", "four"};
        new ChangeElementOfArray<String>().changeElementOfArray(array, 0, 3);
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
    }
}
