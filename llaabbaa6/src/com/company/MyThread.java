package com.company;

public class MyThread implements Runnable{

    private final String name;

public MyThread(String name){
    this.name=name;
}

    public void run(){

        try{
            for(int i=0; i<8;i++){
            Thread.sleep(500);
            System.out.println(name +": " + "Алёна ");
        }}
        catch(InterruptedException e){
           System.out.println("Thread has been interrupted");
        }
    System.out.printf("%s закончил свое действие... \n", Thread.currentThread().getName());
    }
    }






