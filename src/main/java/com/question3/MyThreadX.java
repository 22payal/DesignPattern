package com.question3;

public class MyThreadX extends Thread {

    public void run() {

        MyFileReader.getInstance().performCalculateInFile();

    }
}


