package Interface_Testing;

public class A implements First{
    int name;
    int age;
    int rollno;

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

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "A{" +
                "name=" + name +
                ", age=" + age +
                ", rollno=" + rollno +
                '}';
    }

    public A(int name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    public A() {
        System.out.println("A");
    }


}
