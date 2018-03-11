package com.question3;

class MythreadY extends Thread{

    public void run(){
        MyFileReader.getInstance().performCalculateInFile();
    }

}

