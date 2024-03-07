package ComparatorandCompatable;

public class Student implements  Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
