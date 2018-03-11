package com.question3;


class check{
    public static void main(String[] args) {
        MyThreadX thread1=new MyThreadX();
        thread1.start();
       thread1.setName("first");

        MythreadY thread2=new MythreadY();
        thread2.start();
        thread2.setName("second");

        MyThreadZ thread3=new MyThreadZ();
        thread3.start();
        thread3.setName("third");
    }
}