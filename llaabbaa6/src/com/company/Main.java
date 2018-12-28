package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

       System.out.println("поток начался.");

        MyThread myThread = new MyThread("ПЕРВЫЙ");
        MyThread myThread1 = new MyThread("НЕТ,Я ПЕРВЫЙ");

       ExecutorService executorService = Executors.newFixedThreadPool(2);
     executorService.submit(myThread);
    executorService.submit(myThread1);

    }
}
