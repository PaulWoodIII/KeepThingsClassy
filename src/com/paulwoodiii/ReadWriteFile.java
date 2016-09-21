package com.paulwoodiii;

import java.io.*;
import java.util.Scanner;

/**
 * Created by paul on 9/21/16.
 */
public class ReadWriteFile {
    public static void main(String [] args){
        File f = new File("names.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("Alice\n");
            fw.append("Bob\n");
            fw.append("Charlie \n");
            fw.flush();
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()){
                String name = scanner.nextLine();
                System.out.println(name);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        //Read Entire File
        try {
            FileReader fr = new FileReader(f);
            int fileSize =  (int) f.length();
            char[] contents = new char[fileSize];
            fr.read(contents, 0, fileSize);
            String contentString = String.copyValueOf(contents);
            System.out.println(contents);
            System.out.println(contentString);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
