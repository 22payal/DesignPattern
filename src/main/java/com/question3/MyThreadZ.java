package com.question3;

public class MyThreadZ extends Thread {

    public void run(){
        MyFileReader.getInstance().performCalculateInFile();
    }
}
