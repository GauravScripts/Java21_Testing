package overridingmethod;

public class Animal extends Dog{
    public String show(){
        return "Animal";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.show());
    }
}
