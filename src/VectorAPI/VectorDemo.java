package VectorAPI;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> number = new Vector<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.stream().map(Object::getClass).forEach(System.out::println);

    }
}
