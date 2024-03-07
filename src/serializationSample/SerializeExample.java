package serializationSample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        try {
            //Creating the object
            Student s1 = new Student(101, "John");

            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);

            out.flush();
            //closing the stream
            out.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}