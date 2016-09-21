package com.paulwoodiii;


import jodd.json.*;
import java.io.*;

/**
 * Created by paul on 9/21/16.
 */
public class ReadWriteJSON {
    public static void main(String[] args) throws IOException {
        Person p = new Person("Alice Smith", 30, true);
        File f = new File("person.json");

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.deep(true).serialize(p);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length();
        char[] contents = new char[fileSize];
        fr.read(contents,0,fileSize);
        JsonParser parser = new JsonParser();
        Person p2 = parser.parse(contents, Person.class);
        System.out.println(p);

    }
}
