package Java_Class_Design;

public class Q13 extends Computer {
String type ="Q13";
}

class Computer{
    String type ="computer";

    public static void main(String[] args) {
        Computer computer = new Q13();
        Q13 q13 = new Q13();
        System.out.println(STR."\{computer.type} \{q13.type}");
    }
}
