package com.company;
class MyThreadRunnable implements Runnable{
    public void run() {
        System.out.println("Runnable thread");
    }
}

public class running {
    public static void main(String[] args){
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        gun1.start();
    }
}
