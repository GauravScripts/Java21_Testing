package serializationSample.Deserializatin;

import java.io.*;
import java.util.Date;

public class DateSerializeExample {
    public static void main(String[] args) {
        try {
            //Creating the date object
            Date date = new Date();

            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("date.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(date);

            out.flush();
            //closing the stream
            out.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}