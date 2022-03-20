package com.company;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4) {
            System.out.println("thread is created");
            System.out.println("yes");
            i++;
        }
    }
}

public class thread {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();

        t1.start();

    }
}