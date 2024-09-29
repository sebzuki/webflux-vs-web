package com.exemple.web;

import java.util.stream.IntStream;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
//        IntStream.range(0, 100).forEach(i -> {
//            Thread thread = new Thread(() -> {
//                System.out.println("Thread: " + Thread.currentThread());
//            });
//            thread.start();
//        });

        IntStream.range(0, 10).forEach(i ->
                Thread.startVirtualThread(() ->
                        System.out.println("Virtual Thread a " + (i + 1) + ": " + Thread.currentThread())));

//        IntStream.range(0, 10).forEach(i ->
//                Thread.startVirtualThread(() ->
//                        System.out.println("Virtual Thread b " + (i + 1) + ": " + Thread.currentThread())));

        Thread.sleep(100);
    }
}
