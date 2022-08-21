package lesson1.BigTask;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits = new ArrayList();

    public float getWeight() {
        if (fruits.size() == 0) {
           return 0;
        } else {
            return (fruits.get(0).getWeight() * fruits.size());
        }
    }

    public void putFruit(T fruit) {
        if(fruits.size() != 0) {
            if(fruit.getClass() != fruits.get(0).getClass()) {
                System.out.println("Oranges and apples can't put in same box");
                return;
            }
        }
        fruits.add(fruit);
    }

    public boolean compare(Box another) {
        if(this.getWeight() - another.getWeight() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void pourOver(Box another) {
        List<T> anotherFruits = another.getFruits();

        if(anotherFruits.size() != 0 && this.getFruits().size() != 0) {
            if(anotherFruits.get(0).getClass() != this.getFruits().get(0).getClass()) {
                System.out.println("Oranges and apples can't put in same box");
                return;
            }
        }
        anotherFruits.addAll(this.getFruits());
        this.fruits.clear();
    }
}
