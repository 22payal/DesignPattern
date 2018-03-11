package com.question3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyFileReader {


    private static MyFileReader myFileReader = null;

    private int val;

    private MyFileReader() {

    }

    public static MyFileReader getInstance() {
        if (myFileReader == null) {
            synchronized (MyFileReader.class) {
                if (myFileReader == null) {
                    myFileReader = new MyFileReader();
                    System.out.println("object is created");

                }
            }
        }

        return myFileReader;
    }


    public void performCalculateInFile() {

        try {

            BufferedReader reader=new BufferedReader(new FileReader("src/main/java/com/question3/input.txt"));
            val=Integer.parseInt(reader.readLine());

            System.out.println(Thread.currentThread().getName()+ ": "+val);

           // System.out.println(val);
            val=val*5;

            reader.close();
            String str=String.valueOf(val);
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/com/question3/input.txt"));
            writer.write(str);

            writer.close();
        }
        catch (Exception ex){

        }
    }


}
