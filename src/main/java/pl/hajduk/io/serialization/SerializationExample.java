package pl.hajduk.io.serialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Albert kowalski", 20);

        // serializacja do pliku
        try (FileOutputStream fos = new FileOutputStream("students.ser"); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)) {
            objectOutputStream.writeObject(student);
            System.out.println("obiekt Został zserializowany do pliku");
        }

        // deserializacja

        try (FileInputStream fis=new FileInputStream("students.ser"); ObjectInputStream objectInputStream=new ObjectInputStream(fis)){
            Student readStudent = (Student) objectInputStream.readObject();
            System.out.println("Obiekt odtworzony z pliku"+readStudent);
        }
    }
}
