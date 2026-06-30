package org.example.Threads;

public class MainThreadState {
    public static void main(String[] args) {
        var curentthread = Thread.currentThread();
        System.out.printf(curentthread.getClass().getName());

        printThreadState(curentthread);

        curentthread.setName("MainGuy");
        curentthread.setPriority(Thread.MAX_PRIORITY);
        printThreadState(curentthread);

        CustomThread customThread = new CustomThread();
        customThread.start();

        for(int i=0; i<=3;i++)
            System.out.println(" 0 ");

    }

    public static void printThreadState(Thread thread){
        System.out.println("---------------------");
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread Priority: "+ thread.getPriority());
        System.out.println("Thread State:" + thread.getState());
        System.out.println("------------------------");
    }
}
