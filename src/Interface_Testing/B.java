package Interface_Testing;

public class B implements First{
    int name;
    int age;

    @Override
    public String toString() {
        return STR."B{name=\{name}, age=\{age}\{'}'}";
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public B(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public B() {
        System.out.println("empty constructor");
    }


}
