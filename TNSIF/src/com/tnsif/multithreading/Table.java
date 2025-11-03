package com.tnsif.multithreading;

public class Table {
	synchronized  void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread class 1
class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

// Thread class 2
class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}


