package Interface_Testing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<First> num = new ArrayList<>();
        A a = new A(1, 2, 3);
        B b = new B(4, 5);
        num.add(new A(1, 2, 3));
        num.add(new B(4, 5));
        num.add(new A(2,3,4));
        num.add(new B(5,6));
        num.add(a);
        num.add(b);
        num.stream().forEach(System.out::println);
    }
}
