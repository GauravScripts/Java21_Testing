package serializationSample.Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationChallenge extends Employee {
    public static void main(String[] args) {
        try {
            //Creating the object
            Employee e = new Employee();
            e.name = "John";
            e.address = "1234 Main Street";
            e.SSN = 123456789;
            e.number = 101;

            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(e);

            out.flush();
            //closing the stream
            out.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
