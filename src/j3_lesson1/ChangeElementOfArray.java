package j3_lesson1;

public class ChangeElementOfArray <T> {

    public void changeElementOfArray (T[] array, int firstEl, int secEl) {
        T buf;

        if(!((0 <= firstEl && firstEl < array.length) && (0 <= secEl && secEl < array.length))) {
            System.out.println("Invalid index values.");
            return;
        }

        buf = array[firstEl];
        array[firstEl] = array[secEl];
        array[secEl] = buf;
    }

}
